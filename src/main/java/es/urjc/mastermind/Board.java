package es.urjc.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Board {

    private final int LENGTH = 4;
    private final int MAX_ATTEMPTS = 10;

    private int attempts;
    private boolean youWin;
    private List<Result> combinationsDone;
    private boolean isFinished;
    private Combination result;

    public void playRound(Scanner scanner) {
        this.attempts++;
        String proposal = this.proposeCombination(scanner);
        Combination combination = new Combination(proposal);
        this.combinationsDone.add(new Result(combination, result));
        if (combination.equals(this.result)) {
            this.youWin = true;
            this.isFinished = true;
        } else {
            if (attempts == this.MAX_ATTEMPTS) {
                this.isFinished = true;
            }
        }
    }

    public void showAttempts() {
        System.out.println(this.attempts + " attempt(s):");
        System.out.println(Message.XXX);
        for (Result c : this.getCombinationsDone()) {
            System.out.println(c);
        }
    }

    public void showResult() {
        Message msg = this.youWin ? Message.You_Won : Message.You_Lost;
        this.showAttempts();
        System.out.println(msg);
    }

    private String proposeCombination(Scanner scanner) {
        boolean validProposal = false;
        String input = "";
        while (!validProposal) {
            System.out.print(Message.Propose);
            input = scanner.nextLine();
            validProposal = this.validateCombination(input);
        }
        return input;
    }

    private boolean validateCombination(String input) {
        boolean ok = true;
        if (input.length() != this.LENGTH) {
            System.out.println(Message.Wrong_Length);
            ok = false;
        } else {
            if (!validateCharacters(input)) {
                ok = false;
            }
        }
        return ok;
    }

    private boolean validateCharacters(String input) {
        boolean ok = true;
        char[] chars = input.toCharArray();
        int i = 0;
        while (i < chars.length && ok) {
            if (Color.parse(chars[i]) == Color.Unknown) {
                ok = false;
                System.out.println(Message.Wrong_Colors);
            }
            i++;
        }
        return ok;
    }

    public Board() {
        this.attempts = 0;
        this.youWin = false;
        this.result = Combination.random(this.LENGTH);
        System.out.println("EL RESULTADO ES: " + this.result);
        this.isFinished = false;
        this.combinationsDone = new ArrayList<Result>();
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public List<Result> getCombinationsDone() {
        return this.combinationsDone;
    }

}

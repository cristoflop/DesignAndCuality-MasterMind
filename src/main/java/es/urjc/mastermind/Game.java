package es.urjc.mastermind;

import java.util.Scanner;

public final class Game {

    private final int LENGTH = 4;
    private Board board;

    private Scanner scanner;

    public final void play() {
        do {
            this.board = new Board();
            this.showTitle();
            while (!this.board.isFinished()) {
                this.board.showAttempts();
                String proposal = this.proposeCombination();
                this.board.playRound(new Combination(proposal));
            }
            this.board.showResult();
        } while (this.resume());
        this.endGame();
    }

    public String proposeCombination() {
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

    private void showTitle() {
        System.out.println(Message.Title);
    }

    private void endGame() {
        this.scanner.close();
    }

    private boolean resume() {
        System.out.print(Message.Resume);
        String finishGame = "";
        while (!finishGame.equals(Message.Yes_Message.getMsg()) && !finishGame.equals(Message.No_Message.getMsg())) {
            System.out.print(Message.Yes_No_Message_Format);
            finishGame = scanner.nextLine().toLowerCase();
        }
        return finishGame.equals(Message.Yes_Message.getMsg());
    }

    public Game() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Game().play();

    }
}

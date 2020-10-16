package es.urjc.mastermind;

import java.util.Scanner;

public final class Game {

    private int attempts;
    private final int MAX_ATTEMPTS = 10;
    private final int LENGTH = 4;
    private Board board;

    private Scanner scanner;

    public final void play() {
        do {
            this.board = new Board();
            this.attempts = 0;
            this.showTitle();

            while (!this.board.isFinished() && attempts < this.MAX_ATTEMPTS) {
                this.showAttempts();

                String proposal = this.proposeCombination();
                this.board.playRound(new Combination(proposal));

                this.attempts++;
            }

            if (this.board.isFinished()) {
                System.out.println("You have won");
            } else {
                System.out.println("You have lost");
            }

        } while (this.resume());

        this.endGame();
    }

    public String proposeCombination() {
        boolean validProposal = false;
        String input = "";
        while (!validProposal) {
            System.out.print("Propose combination: ");
            input = scanner.nextLine();
            validProposal = this.validateCombination(input);
        }

        return input;
    }

    private boolean validateCombination(String input) {
        boolean ok = true;
        if (input.length() != this.LENGTH) {
            System.out.println("Wrong proposed combination length");
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
                System.out.println("Wrong colors, they must be: rbygop");
            }
            i++;
        }
        return ok;
    }

    private void showTitle() {
        System.out.println("----- MASTERMIND -----");
    }

    private void showAttempts() {
        System.out.println(this.attempts + " attempt(s):");
        System.out.println("xxxx");
        // pintar los resultados actuales
        for (Combination c : this.board.getCombinationsDone()) {
            // mostrar combinaciones hechas
            System.out.println(c);
        }
    }

    private void endGame() {
        this.scanner.close();
    }

    private boolean resume() {
        System.out.print("Do you want to resume? (y/n): ");
        String finishGame = "";
        while (!finishGame.equals("y") && !finishGame.equals("n")) {
            System.out.print("Please write 'Y' or 'N': ");
            finishGame = scanner.nextLine().toLowerCase();
        }
        return finishGame.equals("y");
    }

    public Game() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Game().play();

    }
}

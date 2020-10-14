package es.urjc.mastermind;

import java.util.Scanner;

public final class Game {

    private int attempts;
    private final int MAX_ATTEMPTS = 2;
    private Board board;

    private Scanner scanner;

    public final void play() {
        String endGameMsg;
        do {

            this.showTitle();

            while (!this.board.isFinished() && attempts < this.MAX_ATTEMPTS) {
                this.showAttempts();
                this.proposeCombination();

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

    public void proposeCombination() {
        System.out.print("Propose a combination: ");
        String input = scanner.nextLine();
    }

    private final void showTitle() {
        System.out.println("----- MASTERMIND -----");
    }

    private final void showAttempts() {
        System.out.println(this.attempts + " attempt(s):");
        System.out.println("xxxx");
        // pintar los resultados actuales
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
        this.attempts = 0;
        Combination result = Combination.random();
        this.board = new Board(result);
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Game().play();

    }
}

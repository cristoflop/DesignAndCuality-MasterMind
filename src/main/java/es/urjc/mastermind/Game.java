package es.urjc.mastermind;

import java.util.Scanner;

public final class Game {

    private Board board;
    private Scanner scanner;

    public final void play() {
        do {
            this.board = new Board();
            this.showTitle();
            while (!this.board.isFinished()) {
                this.board.showAttempts();
                this.board.playRound(this.scanner);
            }
            this.board.showResult();
        } while (this.resume());
        this.endGame();
    }

    private void showTitle() {
        System.out.println(Message.Title);
    }

    private void endGame() {
        this.scanner.close();
    }

    private boolean resume() {
        System.out.print(Message.Resume);
        String finishGame = scanner.nextLine().toLowerCase();
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
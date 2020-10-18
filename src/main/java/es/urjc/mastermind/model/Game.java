package es.urjc.mastermind.model;

import es.urjc.mastermind.view.GameView;

import java.util.Scanner;

public final class Game {

    private Board board;
    private Message title;

    public final void playRound() {
        while (!this.board.isFinished()) {
            this.board.showAttempts(); // pasar a gameView
            // this.board.playRound();
        }
        this.board.showResult();
        // } while (gameView.resume());
    }

    public boolean isFinished() {
        return this.board.isFinished();
    }

    public void initGame() {
        this.board = new Board();
    }

    public Game() {
        this.title = Message.Title;
    }

    public Message getTitle() {
        return this.title;
    }

    public Board getBoard() {
        return this.board;
    }

}
package es.urjc.mastermind.model;

public final class Game {

    private Board board;
    private Message title;

    public final void playRound(String proposal) {
        this.board.playRound(proposal);
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
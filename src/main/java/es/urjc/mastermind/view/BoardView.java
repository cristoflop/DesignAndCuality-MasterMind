package es.urjc.mastermind.view;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Board;
import es.urjc.mastermind.model.Message;

public class BoardView {

    private Board board;
    private ResultView resultView;

    public void showAttempts() {
        SystemConsole console = SystemConsole.getInstance();
        console.println("\n" + this.board.getAttempts() + " attempt(s):");
        console.println(Message.XXX.getMsg());
        this.resultView.showResults();
    }

    public void showResult() {
        Message msg = this.board.youWin() ? Message.You_Won : Message.You_Lost;
        this.showAttempts();
        SystemConsole.getInstance().println(msg.getMsg());
    }

    public BoardView(Board board) {
        this.board = board;
        this.resultView = new ResultView(board);
    }

}

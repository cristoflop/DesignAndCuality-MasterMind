package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Board;
import es.urjc.mastermind.model.Message;

public class ConsoleBoardView {

    private Board board;
    private ConsoleResultView consoleResultView;

    public void showAttempts() {
        SystemConsole console = SystemConsole.getInstance();
        console.println("\n" + this.board.getAttempts() + " attempt(s):");
        console.println(Message.XXX.getMsg());
        this.consoleResultView.showResults();
    }

    public void showResult() {
        Message msg = this.board.youWin() ? Message.You_Won : Message.You_Lost;
        this.showAttempts();
        SystemConsole.getInstance().println(msg.getMsg());
    }

    public ConsoleBoardView(Board board) {
        this.board = board;
        this.consoleResultView = new ConsoleResultView(board);
    }

}

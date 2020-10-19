package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Board;
import es.urjc.mastermind.model.Result;

public class ConsoleResultView {

    private Board board;

    public void showResults() {
        for (Result result : this.board.getCombinationsDone()) {
            this.showResult(result);
        }
    }

    private void showResult(Result result) {
        SystemConsole console = SystemConsole.getInstance();
        console.println(result.getCombination() + " --> " + result.getBlacks() + " blacks and " + result.getWhites() + " whites");
    }

    public ConsoleResultView(Board board) {
        this.board = board;
    }

}

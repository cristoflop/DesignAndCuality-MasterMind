package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Result;
import usantatecla.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

    private Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    public void writeln() {
        MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}

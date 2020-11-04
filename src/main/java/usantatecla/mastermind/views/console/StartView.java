package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

    public void writeln(int width) {
        this.console.writeln(MessageView.TITLE.getMessage());
        for (int i = 0; i < width; i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }

}

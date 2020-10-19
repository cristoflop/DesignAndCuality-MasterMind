package usantatecla.mastermind.views.console;

import usantatecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

    public void interact() {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}

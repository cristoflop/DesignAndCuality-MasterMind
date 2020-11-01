package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

public class GameView extends WithConsoleView {

    void interact(PlayController playController) {
        this.console.writeln();
        new AttemptsView(playController).writeln();
        new SecretCombinationView(playController).writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController).write(i);
            new ResultView(playController).writeln(i);
        }
        if (playController.getAttempts() > 0 && playController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (playController.isLooser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }

}

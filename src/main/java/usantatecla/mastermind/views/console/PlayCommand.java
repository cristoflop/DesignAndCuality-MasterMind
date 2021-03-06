package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

public class PlayCommand extends ConsoleCommand {

    public PlayCommand(PlayController playController) {
        super(MessageView.PROPOSED_COMBINATION.getMessage(), playController);
    }

    public void execute() {
        new ProposalView().interact(this.playController);
        new GameView().interact(this.playController);
    }

    public boolean isActive() {
        return true;
    }
}

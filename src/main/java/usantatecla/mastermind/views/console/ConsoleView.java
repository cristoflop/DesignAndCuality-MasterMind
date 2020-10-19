package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public class ConsoleView extends View {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView(Game game) {
        super(game);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void interact() {
        boolean newGame;
        do {
            this.startView.interact();
            boolean finished;
            do {
                finished = this.proposalView.interact();
            } while (!finished);
            newGame = this.resumeView.interact();
        } while (newGame);
    }

}

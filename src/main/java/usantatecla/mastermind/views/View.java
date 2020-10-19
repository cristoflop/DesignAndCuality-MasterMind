package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.ProposalView;
import usantatecla.mastermind.views.console.ResumeView;
import usantatecla.mastermind.views.console.StartView;

public abstract class View {

    protected Game game;

    public View(Game game) {
        this.game = game;
    }

    public abstract void interact();

}

package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public abstract class Mastermind {

    private Game game;
    private View view;

    public void play() {
        this.view.interact();
    }

    public Mastermind() {
        this.game = new Game();
        this.view = this.getView(this.game);
    }

    public abstract View getView(Game game);

}

package es.urjc.mastermind.view;

import es.urjc.mastermind.model.Game;

public abstract class View {

    protected Game game;

    public View(Game game) {
        this.game = game;
    }

    public abstract void play();

}

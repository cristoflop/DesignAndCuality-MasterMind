package es.urjc.mastermind.view;

import es.urjc.mastermind.model.MasterMindGame;

public abstract class View {

    protected MasterMindGame masterMindGame;

    public View(MasterMindGame masterMindGame) {
        this.masterMindGame = masterMindGame;
    }

    public abstract void play();

}

package es.urjc.mastermind;

import es.urjc.mastermind.model.MasterMindGame;
import es.urjc.mastermind.view.View;
import es.urjc.mastermind.view.console.ConsoleMasterMindGameView;

public class ConsoleMasterMind {

    private MasterMindGame masterMindGame;
    private View view;

    public ConsoleMasterMind() {
        this.masterMindGame = new MasterMindGame();
        this.view = new ConsoleMasterMindGameView(this.masterMindGame);
    }

    private void play() {
        this.view.play();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}

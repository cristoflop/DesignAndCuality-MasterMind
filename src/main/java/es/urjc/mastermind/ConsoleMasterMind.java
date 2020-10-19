package es.urjc.mastermind;

import es.urjc.mastermind.model.Game;
import es.urjc.mastermind.view.View;
import es.urjc.mastermind.view.console.ConsoleGameView;

public class ConsoleMasterMind {

    private Game game;
    private View view;

    public ConsoleMasterMind() {
        this.game = new Game();
        this.view = new ConsoleGameView(this.game);
    }

    private void play() {
        this.view.play();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}

package es.urjc.mastermind;

import es.urjc.mastermind.model.Game;
import es.urjc.mastermind.view.GameView;

public class MasterMind {

    public static void main(String[] args) {
        Game game = new Game();
        new GameView(game).play();
    }

}

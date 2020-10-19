package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ConsoleView;

public class Mastermind {

    private Game game;
    private View view;

    private Mastermind() {
        this.game = new Game();
        this.view = new ConsoleView(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}

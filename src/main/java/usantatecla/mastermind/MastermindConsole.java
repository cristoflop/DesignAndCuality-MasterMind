package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.Mastermind;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ConsoleView;

public class MastermindConsole extends Mastermind {

    public View getView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}


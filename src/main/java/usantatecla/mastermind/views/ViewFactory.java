package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.ConsoleView;

public class ViewFactory {

    private static ViewFactory instance;

    public static ViewFactory getInstance() {
        if (instance == null)
            instance = new ViewFactory();
        return instance;
    }

    public ConsoleView generateConsoleView(Game game) {
        return new ConsoleView(game);
    }

}

package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;

public class PlayView {

    public void interact(PlayController playController) {
        new ConsolePlayMenu(playController).execute();
    }

}

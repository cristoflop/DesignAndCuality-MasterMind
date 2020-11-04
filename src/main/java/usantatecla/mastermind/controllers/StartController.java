package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.views.console.SecretCombinationView;
import usantatecla.mastermind.views.console.StartView;

public class StartController extends Controller {

    public StartController(Game game, State state) {
        super(game, state);
    }

    public void control() {
        this.start();
        new StartView().writeln(this.getWidth());
        new SecretCombinationView().writeSecretCombination(this.game.getSecretCombination().toString());
    }

    public void start() {
        this.state.next();
    }

}

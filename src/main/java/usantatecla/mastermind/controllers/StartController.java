package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class StartController extends Controller implements AcceptorController {

    public StartController(Game game, State state) {
        super(game, state);
    }

    public void start() {
        this.state.next();
    }

    public Combination getSecretCombination() {
        return this.game.getSecretCombination();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}

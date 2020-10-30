package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class PlayController extends Controller {

    private ProposalController proposalController;
    // private RedoController redoController;
    // private UndoController undoController;

    PlayController(Game game, State state) {
        super(game, state);
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}

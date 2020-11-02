package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.controllers.UndoController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

import java.util.List;

public class PlayControllerImplementation extends PlayController {

    private ProposalController proposalController;
    private RedoController redoController;
    private UndoController undoController;

    public PlayControllerImplementation(Session session) {
        super(session);
        this.proposalController = new ProposalController(session);
        this.redoController = new RedoController(session);
        this.undoController = new UndoController(session);
    }

    public Error addProposedCombination(List<Color> colors) {
        return this.proposalController.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.proposalController.getColors(position);
    }

    public int getBlacks(int position) {
        return this.proposalController.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.proposalController.getWhites(position);
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

}

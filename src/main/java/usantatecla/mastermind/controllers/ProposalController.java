package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

import java.util.List;

public class ProposalController extends Controller {

    private SessionImplementation sessionImplementation;

    public ProposalController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public Error addProposedCombination(List<Color> colors) {
        return this.sessionImplementation.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.sessionImplementation.isWinner();
    }

    public boolean isLooser() {
        return this.sessionImplementation.isLooser();
    }

    public int getAttempts() {
        return this.sessionImplementation.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.sessionImplementation.getColors(position);
    }

    public int getBlacks(int position) {
        return this.sessionImplementation.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.sessionImplementation.getWhites(position);
    }

}

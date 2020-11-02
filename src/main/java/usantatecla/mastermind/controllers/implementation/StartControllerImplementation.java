package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

    private SessionImplementation sessionImplementation;

    public StartControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void start() {
        this.sessionImplementation.next();
    }

    public Combination getSecretCombination() {
        return this.sessionImplementation.getSecretCombination();
    }

}

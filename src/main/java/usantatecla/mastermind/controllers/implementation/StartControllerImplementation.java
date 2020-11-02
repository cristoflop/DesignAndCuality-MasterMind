package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Session;

public class StartControllerImplementation extends StartController {

    public StartControllerImplementation(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    public Combination getSecretCombination() {
        return this.session.getSecretCombination();
    }

}

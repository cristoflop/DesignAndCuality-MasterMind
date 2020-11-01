package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Session;

public class StartController extends Controller implements AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    public Combination getSecretCombination() {
        return this.session.getSecretCombination();
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}

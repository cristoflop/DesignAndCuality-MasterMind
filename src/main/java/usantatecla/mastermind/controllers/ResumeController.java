package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.reset();
        } else {
            this.session.next();
        }
    }

    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}

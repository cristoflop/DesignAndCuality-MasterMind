package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Session;

public class ResumeControllerImplementation extends ResumeController {

    public ResumeControllerImplementation(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.reset();
        } else {
            this.session.next();
        }
    }


}

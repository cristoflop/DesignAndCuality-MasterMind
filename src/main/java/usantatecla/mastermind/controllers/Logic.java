package usantatecla.mastermind.controllers;

import usantatecla.mastermind.controllers.implementation.PlayControllerImplementation;
import usantatecla.mastermind.controllers.implementation.ResumeControllerImplementation;
import usantatecla.mastermind.controllers.implementation.StartControllerImplementation;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Session session;

    private Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = new HashMap<StateValue, AcceptorController>();
        this.controllers.put(StateValue.INITIAL, new StartControllerImplementation(this.session));
        this.controllers.put(StateValue.IN_GAME, new PlayControllerImplementation(this.session));
        this.controllers.put(StateValue.FINAL, new ResumeControllerImplementation(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValueState());
    }

}

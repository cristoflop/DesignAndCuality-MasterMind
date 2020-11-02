package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.models.SessionImplementation;
import usantatecla.mastermind.models.StateValue;

import java.util.HashMap;

public class LogicImplementation extends Logic {


    public LogicImplementation() {
        this.session = new SessionImplementation();
        this.controllers = new HashMap<StateValue, AcceptorController>();
        this.controllers.put(StateValue.INITIAL, new StartControllerImplementation(this.session));
        this.controllers.put(StateValue.IN_GAME, new PlayControllerImplementation(this.session));
        this.controllers.put(StateValue.FINAL, new ResumeControllerImplementation(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

}

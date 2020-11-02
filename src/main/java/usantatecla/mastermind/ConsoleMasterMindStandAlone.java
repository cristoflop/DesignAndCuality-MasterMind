package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.implementation.LogicImplementation;

public class ConsoleMasterMindStandAlone extends ConsoleMastermind {

    protected Logic createLogic() {
        return new LogicImplementation();
    }

        public static void main(String[] args) {
            new ConsoleMasterMindStandAlone().play();
        }
}

package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;

public class ConsoleMasterMindClient extends ConsoleMastermind {

    protected Logic createLogic() {
        return null;
    }

    public static void main(String[] args) {
        new ConsoleMasterMindStandAlone().play();
    }

}

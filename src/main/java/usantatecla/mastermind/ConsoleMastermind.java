package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.console.ConsoleView;

public abstract class ConsoleMastermind extends Mastermind {

    protected View createView() {
        return new ConsoleView();
    }

    protected abstract Logic createLogic();

}

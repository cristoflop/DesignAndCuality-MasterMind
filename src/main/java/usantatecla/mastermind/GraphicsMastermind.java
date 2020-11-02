package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.implementation.LogicImplementation;
import usantatecla.mastermind.views.View;
import usantatecla.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    protected View createView() {
        return new GraphicsView();
    }

    protected Logic createLogic() {
        return new LogicImplementation();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }
}

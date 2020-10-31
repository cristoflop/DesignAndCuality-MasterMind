package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;

public class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Game game, State state) {
		super(game, state);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.game.clear();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}

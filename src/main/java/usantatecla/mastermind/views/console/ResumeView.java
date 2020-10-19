package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

	private Game game;

	public ResumeView(Game game) {
		this.game = game;
	}

	public boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}

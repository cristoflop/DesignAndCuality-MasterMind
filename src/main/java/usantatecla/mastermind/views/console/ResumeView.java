package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

	public boolean writeln() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}


}

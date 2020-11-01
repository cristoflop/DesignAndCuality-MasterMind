package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.utils.WithConsoleView;

import java.util.List;

class ProposalView extends WithConsoleView {

    void interact(PlayController playController) {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(playController).read();
            error = playController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
    }

}

package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Game;
import es.urjc.mastermind.view.View;

public class ConsoleGameView extends View {

    private ConsoleBoardView consoleBoardView;
    private ConsoleResumeView consoleResumeView;
    private ConsoleProposeView consoleProposeView;

    public void play() {
        do {
            this.initGame();
            this.showTitle();
            while (!this.game.isFinished()) {
                this.consoleBoardView.showAttempts();
                String proposal = this.consoleProposeView.proposeCombination();
                this.game.playRound(proposal);
            }
            this.consoleBoardView.showResult();
        }
        while (this.consoleResumeView.resume());
    }

    public void showTitle() {
        SystemConsole.getInstance().println(this.game.getTitle().getMsg());
    }

    private void initGame() {
        this.game.initGame();
        this.consoleBoardView = new ConsoleBoardView(this.game.getBoard());
    }

    public ConsoleGameView(Game game) {
        super(game);
        this.consoleResumeView = new ConsoleResumeView();
        this.consoleProposeView = new ConsoleProposeView();
    }

}

package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.MasterMindGame;
import es.urjc.mastermind.view.View;

public class ConsoleMasterMindGameView extends View {

    private ConsoleBoardView consoleBoardView;
    private ConsoleResumeView consoleResumeView;
    private ConsoleProposeView consoleProposeView;

    public void play() {
        do {
            this.initGame();
            this.showTitle();
            while (!this.masterMindGame.isFinished()) {
                this.consoleBoardView.showAttempts();
                String proposal = this.consoleProposeView.proposeCombination();
                this.masterMindGame.playRound(proposal);
            }
            this.consoleBoardView.showResult();
        }
        while (this.consoleResumeView.resume());
    }

    public void showTitle() {
        SystemConsole.getInstance().println(this.masterMindGame.getTitle().getMsg());
    }

    private void initGame() {
        this.masterMindGame.initGame();
        this.consoleBoardView = new ConsoleBoardView(this.masterMindGame.getBoard());
    }

    public ConsoleMasterMindGameView(MasterMindGame masterMindGame) {
        super(masterMindGame);
        this.consoleResumeView = new ConsoleResumeView();
        this.consoleProposeView = new ConsoleProposeView();
    }

}

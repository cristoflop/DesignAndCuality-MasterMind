package es.urjc.mastermind.view;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.MasterMind;

public class MasterMindView {

    private MasterMind masterMind;
    private BoardView boardView;
    private ResumeView resumeView;
    private ProposeView proposeView;

    public void play() {
        do {
            this.initGame();
            this.showTitle();
            while (!this.masterMind.isFinished()) {
                this.boardView.showAttempts();
                String proposal = this.proposeView.proposeCombination();
                this.masterMind.playRound(proposal);
            }
            this.boardView.showResult();
        }
        while (this.resumeView.resume());
    }

    public void showTitle() {
        SystemConsole.getInstance().println(this.masterMind.getTitle().getMsg());
    }

    private void initGame() {
        this.masterMind.initGame();
        this.boardView = new BoardView(this.masterMind.getBoard());
    }

    public MasterMindView(MasterMind masterMind) {
        this.masterMind = masterMind;
        this.resumeView = new ResumeView();
        this.proposeView = new ProposeView();
    }

    public static void main(String[] args) {
        MasterMind masterMind = new MasterMind();
        new MasterMindView(masterMind).play();
    }

}

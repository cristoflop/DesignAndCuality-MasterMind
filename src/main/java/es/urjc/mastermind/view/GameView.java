package es.urjc.mastermind.view;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Game;

public class GameView {

    private Game game;
    private BoardView boardView;
    private ResumeView resumeView;
    private ProposeView proposeView;

    public void play() {
        do {
            this.initGame();
            this.showTitle();
            while (!this.game.isFinished()) {
                this.boardView.showAttempts();
                String proposal = this.proposeView.proposeCombination();
                this.game.playRound(proposal);
            }
            this.boardView.showResult();
        }
        while (this.resumeView.resume());
    }

    public void showTitle() {
        SystemConsole.getInstance().println(this.game.getTitle().getMsg());
    }

    private void initGame() {
        this.game.initGame();
        this.boardView = new BoardView(this.game.getBoard());
    }

    public GameView(Game game) {
        this.game = game;
        this.resumeView = new ResumeView();
        this.proposeView = new ProposeView();
    }

    public static void main(String[] args) {
        Game game = new Game();
        new GameView(game).play();
    }

}

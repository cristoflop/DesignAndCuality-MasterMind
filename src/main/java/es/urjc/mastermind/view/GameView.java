package es.urjc.mastermind.view;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Game;
import es.urjc.mastermind.model.Message;

public class GameView {

    private Game game;
    private BoardView boardView;

    public void play() {
        do {
            this.game.initGame();
            this.showTitle(this.game.getTitle().getMsg());
            while (!this.game.isFinished()) {
                this.game.playRound();
            }
        }
        while (this.resume());
    }

    public boolean resume() {
        SystemConsole console = SystemConsole.getInstance();
        String finishGame = console.readln(Message.Resume.getMsg());
        while (!finishGame.equals(Message.Yes_Message.getMsg()) && !finishGame.equals(Message.No_Message.getMsg())) {
            finishGame = console.readln(Message.Yes_No_Message_Format.getMsg());
        }
        return finishGame.equals(Message.Yes_Message.getMsg());
    }

    public void showTitle(String title) {
        SystemConsole.getInstance().println(title);
    }

    public GameView(Game game) {
        this.game = game;
        this.boardView = new BoardView(this.game.getBoard());
    }

    public static void main(String[] args) {
        Game game = new Game();
        new GameView(game).play();

    }

}

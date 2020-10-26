package usantatecla.tictactoe.models;

public class Turn {

	public static final int NUMBER_PLAYERS = 2;
	private Player[] players;
	private Board board;
	private int active;
	private int users;

	public Turn(Board board) {
		assert board != null;

		this.board = board;
	}

	public void setUsers(int users) {
		this.users = users;
		this.board.reset();
		this.players = new Player[Turn.NUMBER_PLAYERS];
		for (int i = 0; i < Turn.NUMBER_PLAYERS; i++) {
			this.players[i] = new Player(Token.get(i), board);
		}
		this.active = Turn.NUMBER_PLAYERS - 1;
	}

	public void next() {
		this.active = (this.active + 1) % Turn.NUMBER_PLAYERS;
	}

	public boolean isUser() {
		return this.users == 2 || this.users == 1 && this.active == 0;
	}

	public Error put(Coordinate coordinate) {
		return this.getPlayer().put(coordinate);
	}

	private Player getPlayer() {
		return this.players[this.active];
	}

	public Error move(Coordinate origin, Coordinate target) {
		return this.getPlayer().move(origin, target);
	}

	public Token getToken() {
		return this.getPlayer().getToken();
	}

}
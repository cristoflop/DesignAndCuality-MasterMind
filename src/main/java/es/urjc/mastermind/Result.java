package es.urjc.mastermind;

public class Result {

    private int blacks;
    private int whites;
    private Combination combination;

    public Result(int blacks, int whites, Combination c) {
        this.blacks = blacks;
        this.whites = whites;
        this.combination = c;
    }

    public int getBlacks() {
        return blacks;
    }

    public void setBlacks(int blacks) {
        this.blacks = blacks;
    }

    public int getWhites() {
        return whites;
    }

    public void setWhites(int whites) {
        this.whites = whites;
    }

}

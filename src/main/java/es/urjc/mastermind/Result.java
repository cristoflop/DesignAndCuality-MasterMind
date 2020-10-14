package es.urjc.mastermind;

public class Result {

    private int blacks;
    private int whites;

    public Result(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
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

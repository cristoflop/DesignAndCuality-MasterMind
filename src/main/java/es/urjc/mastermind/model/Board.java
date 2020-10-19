package es.urjc.mastermind.model;

import es.urjc.mastermind.Utils.Constant;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private int attempts;
    private boolean youWin;
    private List<Result> combinationsDone;
    private boolean isFinished;
    private Combination result;

    public void playRound(String proposal) {
        this.attempts++;
        Combination combination = new Combination(proposal);
        this.combinationsDone.add(new Result(combination, result));
        if (combination.isEqualTo(this.result)) {
            this.youWin = true;
            this.isFinished = true;
        } else {
            if (attempts == Constant.MAX_ATTEMPTS) {
                this.isFinished = true;
            }
        }
    }

    public Board() {
        this.attempts = 0;
        this.youWin = false;
        this.result = Combination.random(Constant.COMBINATION_LENGTH);
        System.out.println("EL RESULTADO ES: " + this.result);
        this.isFinished = false;
        this.combinationsDone = new ArrayList<Result>();
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public List<Result> getCombinationsDone() {
        return this.combinationsDone;
    }

    public int getAttempts() {
        return this.attempts;
    }

    public boolean youWin() {
        return this.youWin;
    }

}

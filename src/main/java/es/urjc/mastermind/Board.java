package es.urjc.mastermind;

import java.util.ArrayList;
import java.util.List;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Board {


    private final int LENGTH = 4;

    private List<Combination> combinationsDone;
    // private List<Result> results;
    private boolean isFinished;
    private Combination result;

    public void playRound(Combination combinationProposed) {
        this.isFinished = combinationProposed.equals(this.result);
    }

    public Board() {

        Combination result = Combination.random(this.LENGTH);
        System.out.println("EL RESULTADO ES: " + result);

        this.result = result;
        this.isFinished = false;
        this.combinationsDone = new ArrayList<Combination>();
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public List<Combination> getCombinationsDone() {
        return this.combinationsDone;
    }

}

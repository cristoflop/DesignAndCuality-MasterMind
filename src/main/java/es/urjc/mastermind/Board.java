package es.urjc.mastermind;

import java.util.ArrayList;
import java.util.List;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Board {

    private List<Combination> combinationsDone;
    private List<Result> results;
    private boolean isFinished;
    private Combination result;

    public final void playRound(Combination combinationProposed) {

    }

    public Board(Combination result) {
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

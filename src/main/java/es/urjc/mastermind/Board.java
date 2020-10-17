package es.urjc.mastermind;

import java.util.ArrayList;
import java.util.List;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Board {

    private final int LENGTH = 4;
    private final int MAX_ATTEMPTS = 10;

    private int attempts;
    private boolean youWin;
    private List<Combination> combinationsDone;
    private boolean isFinished;
    private Combination result;

    public void playRound(Combination combinationProposed) {
        this.isFinished = combinationProposed.equals(this.result);
    }

    public Board() {
        this.attempts = 0;
        this.youWin = false;

        Combination result = Combination.random(this.LENGTH);
        System.out.println("EL RESULTADO ES: " + result);

        this.result = result;
        this.isFinished = false;
        this.combinationsDone = new ArrayList<Combination>();
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public void showAttempts() {
        System.out.println(this.attempts + " attempt(s):");
        System.out.println(Message.XXX);
        for (Combination c : this.getCombinationsDone()) {
            System.out.println(c);
        }
    }

    public void showResult() {
        Message msg = this.youWin ? Message.You_Won : Message.You_Lost;
        System.out.println(msg);
    }

    public List<Combination> getCombinationsDone() {
        return this.combinationsDone;
    }

}

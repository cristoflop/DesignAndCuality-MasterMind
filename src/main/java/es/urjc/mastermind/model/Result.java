package es.urjc.mastermind.model;

import java.util.List;

public class Result {

    private int blacks;
    private int whites;
    private Combination combination;

    public Result(Combination proposed, Combination result) {
        this.blacks = 0;
        this.whites = 0;
        this.combination = proposed;
        List<Color> proposedColors = this.combination.getColors();
        List<Color> resultColors = result.getColors();
        for (int i = 0; i < proposedColors.size(); ++i) {
            Color auxProposed = proposedColors.get(i);
            Color resultColor = resultColors.get(i);
            if (auxProposed.equals(resultColor)) {
                this.blacks++;
            } else {
                if (resultColors.contains(auxProposed)) {
                    this.whites++;
                }
            }
        }
    }

    public Combination getCombination() {
        return this.combination;
    }

    public int getBlacks() {
        return this.blacks;
    }

    public int getWhites() {
        return this.whites;
    }

}

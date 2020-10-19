package es.urjc.mastermind;

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
            int indexAuxProposedInResult = resultColors.indexOf(auxProposed);
            if (indexAuxProposedInResult != -1) { // el color esta en la combinacion correcta
                if (indexAuxProposedInResult == i) {
                    this.blacks++;
                } else {
                    this.whites++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.combination + " --> " + this.blacks + " blacks and " + this.whites + " whites";
    }
}
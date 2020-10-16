package es.urjc.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Combination {

    private final static int MAX_COLORS = 4;
    private List<Color> colors;

    public Result compare(Combination other) {
        int blacks = 0;
        int whites = 0;

        return new Result(blacks, whites, this);
    }

    public static Combination random() {
        Random r = new Random();
        int max = Color.values().length;

        List<Color> colors = new ArrayList<Color>();
        while (colors.size() < MAX_COLORS) {
            int pos = r.nextInt(max - 1) + 1;
            colors.add(Color.values()[pos]);
        }
        return new Combination(colors);
    }

    public Combination(String input) {
        this.colors = new ArrayList<Color>();
        for (char c : input.toCharArray()) {
            this.colors.add(Color.parse(c));
        }
    }

    private Combination(List<Color> colors) {
        this.colors = colors;
    }
}

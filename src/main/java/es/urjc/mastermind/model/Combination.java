package es.urjc.mastermind.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Combination {

    private List<Color> colors;

    public static Combination random(int maxColors) {
        Random r = new Random();
        int max = Color.values().length;
        List<Color> colors = new ArrayList<Color>();
        while (colors.size() < maxColors) {
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

    public List<Color> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        String result = "";
        for (Color c : this.colors) {
            result += c.getColor();
        }
        return result;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Combination) {
            result = ((Combination) other).colors.equals(this.colors);
        }
        return result;
    }
}

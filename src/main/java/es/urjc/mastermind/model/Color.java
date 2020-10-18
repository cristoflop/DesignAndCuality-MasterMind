package es.urjc.mastermind.model;

public enum Color {

    Unknown(null),
    Red('r'),
    Green('g'),
    Blue('b'),
    Orange('o'),
    Yellow('y'),
    Purple('p');

    private final Character color;

    public Character getColor() {
        return this.color;
    }

    public static Color parse(char c) {
        Color result = Color.Unknown;
        switch (c) {
            case 'r':
                result = Color.Red;
                break;
            case 'g':
                result = Color.Green;
                break;
            case 'b':
                result = Color.Blue;
                break;
            case 'o':
                result = Color.Orange;
                break;
            case 'y':
                result = Color.Yellow;
                break;
            case 'p':
                result = Color.Purple;
                break;
        }
        return result;
    }

    Color(Character color) {
        this.color = color;
    }

}

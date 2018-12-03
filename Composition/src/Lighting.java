public class Lighting {

    private int lightbulbs;
    private boolean hasFan;
    private Dimensions dimensions;

    public Lighting(int lightbulbs, boolean hasFan, Dimensions dimensions) {
        this.lightbulbs = lightbulbs;
        this.hasFan = hasFan;
        this.dimensions = dimensions;
    }

    public int getLightbulbs() {
        return lightbulbs;
    }

    public boolean isHasFan() {
        return hasFan;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

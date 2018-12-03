public class Window {

    private Dimensions dimensions;
    private boolean dualPane;
    private boolean canOpen;
    private boolean isOpen;

    public Window(Dimensions dimensions, boolean dualPane, boolean canOpen, boolean isOpen) {
        this.dimensions = dimensions;
        this.dualPane = dualPane;
        this.canOpen = canOpen;
        this.isOpen = isOpen;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isDualPane() {
        return dualPane;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }
}

import javafx.scene.image.ImageView;

public abstract class AnimatedThings {
    private double x;
    private double y;
    private ImageView SpriteSheet;
    private int attitude;
    private int index;
    private int indexMax;
    private int windowSize;
    private int offset;

    public AnimatedThings(String path, double x, double y){

        this.x=x;
        this.y=y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    abstract void update(double time);
}
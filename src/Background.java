import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Background {

    private double x;
    private double y;
    private ImageView imageView;

    public Background(double x, double y){
        this.x = x;
        this.y = y;
        this.imageView = new ImageView(new Image("C:\\Users\\ahant\\IdeaProjects\\TP_Runner2\\ressources\\desert.png"));
        imageView.setViewport(new Rectangle2D(20,0,600,400));
    }

    public ImageView getImageView() {

        return imageView;
    }
}

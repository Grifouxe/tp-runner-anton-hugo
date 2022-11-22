import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaticThings {

    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThings(double sizeX, double sizeY, String image_de_fond) throws FileNotFoundException {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imageView = new ImageView(new Image(new FileInputStream( image_de_fond )));
    }


    public ImageView getImageView() {

        return imageView;
    }

    public double getSizeX() {

        return sizeX ;
    }

    public double getSizeY() {

        return sizeY;
    }
}

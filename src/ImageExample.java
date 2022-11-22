import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageExample extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {


        Image image = new Image(new FileInputStream("path of the image"));
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(50);
        imageView.setY(25);
        imageView.setViewport(new Rectangle2D(20,20,20,20));


        Group root = new Group(imageView);
        Scene scene = new Scene(root, 600, 500);

        stage.setTitle("Loading an image");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}

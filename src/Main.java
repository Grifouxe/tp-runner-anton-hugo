import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    private final double frame=16;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world");

        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 600, 400, true);



        root.getChildren().add(theScene.getBackgroundRight().getImageView());
        root.getChildren().add(theScene.getBackgroundLeft().getImageView());
        root.getChildren().add(theScene.getLifeOne().getImageView());
        root.getChildren().add(theScene.getLifeTwo().getImageView());
        root.getChildren().add(theScene.getLifeThree().getImageView());
        root.getChildren().add(theScene.getHero().getImageView());
        primaryStage.setScene(theScene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long time) {
               theScene.getHero().update(frame*2);
                theScene.getCameraScene().update(frame/1000);
                theScene.update(frame/1000);

                }
        };
        timer.start();

        pane.setOnMouseClicked( (event)-> theScene.getHero().jump());


    }

    public static void main(String[] args) {
        launch(args);
    }
}


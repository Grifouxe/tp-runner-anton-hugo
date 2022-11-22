import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;

import java.io.FileNotFoundException;


public class GameScene extends Scene {
    private Hero hero=new Hero( "ressources/heros.png",200,200);
    private Camera camera = new Camera(hero,0, 50);
    private StaticThings BackgroundLeft = new StaticThings(0, 0, "ressources/desert.png");
    private StaticThings BackgroundRight = new StaticThings(0, 0, "ressources/desert.png");
    private int numberOfLifes;
    private StaticThings lifeOne = new StaticThings(10,10,"ressources/heart2.png");
    private StaticThings lifeTwo = new StaticThings(50,50,"ressources/heart2.png");
    private StaticThings lifeThree = new StaticThings(90,90,"ressources/heart2.png");
    private Text text = new Text();

    public GameScene(Parent parent, double v, double v1, boolean b) throws FileNotFoundException {
        super(parent, v, v1, b);

        BackgroundLeft.getImageView().setViewport(new Rectangle2D(camera.getx(), camera.gety(), 600,300));

    }

    public Camera getCameraScene() {

        return camera;
    }

    public StaticThings getBackgroundLeft() {

        return BackgroundLeft;
    }

    public StaticThings getBackgroundRight() {

        return BackgroundRight;
    }
    public Hero getHero() {
        return hero;
    };
    public StaticThings getLifeOne() {

        return lifeOne;
    }
    public StaticThings getLifeTwo() {

        return lifeTwo;
    }
    public StaticThings getLifeThree() {

        return lifeThree;
    }
    public int getNumberOfLifes() {

        return numberOfLifes;
    }

    public void setNumberOfLifes(int numberOfLifes) {

        this.numberOfLifes = numberOfLifes;
    }

    public void update(double time) {
        BackgroundLeft.getImageView().setViewport(new Rectangle2D(camera.getx() % 800, camera.gety(), 600, 300));
        BackgroundRight.getImageView().setViewport(new Rectangle2D((camera.getx() % 800 - 800), camera.gety(), 600, 300));
        text.setText("BONJOUR" + (int)Math.floor((hero.getX()+200)/100));
}
}
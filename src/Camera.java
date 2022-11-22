public class Camera {
    private double x;
    private double y;
    private Hero hero;
    private double ax=0;
    private double vx;
    public double getx() {

        return x;
    }
    public double gety() {

        return y;
    }

    public Camera(Hero hero, double x, double y){
        this.hero = hero;
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {

        return "la coordonnée X est" + x + "la coordonnée Y est" + y;
    }


    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {

        this.y = y;
    }


    public void update(double time){
        this.ax=7*(hero.getX()-this.x)-1.1*vx;
        this.vx+=this.ax*time;
        this.x+=this.vx*time ;
        hero.getImageView().setX(hero.getX()-this.x);
    }

}

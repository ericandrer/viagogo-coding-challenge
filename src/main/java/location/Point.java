package location;

import java.util.ArrayList;
import java.util.Random;

public class Point{
    private double x;
    private double y;

    //Constructor with no parameters.
    public Point(){}

    // Constructor for initial parameters.
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    private double setX(double newX) {
        return this.x=newX;
    }

    private double setY(double newY) {
        return this.y=newY;
    }
    /**
     * Method to obtain the distance between points,
     * function heuristic(node) =
     dx = abs(node.x - goal.x)
     dy = abs(node.y - goal.y)
     return D * (dx + dy)
     * @param eventPoint
     * @return distance
     */
    public double distanceTo(Point eventPoint) {
        double dx = Math.abs(x - eventPoint.x);
        double dy = Math.abs(y - eventPoint.y);
        return dx + dy;
    }

    /**
     * Pseudo-random method to get an uniformly distributed int value.
     * @return a Random int between -10 and 10 X axis.
     */
    public double randomX() {
            Random r = new Random();
            double x = r.nextInt(10 + 1 + 10) - 10;

            Point rndPoint = new Point();
            this.x=rndPoint.setX(x);

            return x;
    }

    /**
     * Pseudo-random method to get an uniformly distributed int value.
     * @return a Random int between -10 and 10 Y axis.
     */
    public double randomY() {
        Random r = new Random();
        double y = r.nextInt((10 + 1 + 10) - 10);

        Point randomPointY = new Point();
        this.y = randomPointY.setY(y);

        return y;

    }

}

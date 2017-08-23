package location;

public class Point{
    private double x;
    private double y;

    // Constructor for initial parameters.
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    private double getX(){
        return this.x;
    }
    private double getY(){
        return this.y;
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

    //Playing with Ceil/Round Math Objects to get random results.
    public double distanceToOrigin() {
        Point origin = new Point(Math.round(Math.random()),Math.round(Math.random()));
        return distanceTo(origin);
    }

}

package excercises.rectangle;

public class Rectangle {

    // The co-ordinates of the top, left, bottom and right sides

    private double top;

    private double left;

    private double bottom;

    private double right;

    public Rectangle(double top, double left, double bottom, double right) {

        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;

    }

    /**
     * This method checks if this rectangle interests another rectangle or not.
     * 
     * @param Rectangle
     * @return Boolean
     */
    public boolean intersects(Rectangle r) {

        // check if the bottom boundary of this class is higher than the top of
        // the argument rectangle's boundary and vice versa.
        // If this condition is met then rectangles can not overlap on the same
        // height.
        if (!(this.bottom > r.getTopCoordinate() || this.top < r.getBottomCoordinate())) {

            // check if the left and right boundaries overlap. If they do at any
            // point, then this condition will return true, otherwise returns
            // false.
            return !(this.left > r.getRightCoordinate() || this.right < r.getLeftCoordinate());
        }

        return false;

    }

    /**
     * Returns the top co-ordinate of the rectangle
     */
    public double getTopCoordinate() {
        return this.top;
    }

    /**
     * Returns the bottom co-ordinate of the rectangle
     */
    public double getBottomCoordinate() {
        return this.bottom;
    }

    /**
     * Returns the right co-ordinate of the rectangle
     */
    public double getRightCoordinate() {
        return this.right;
    }

    /**
     * Returns the left co-ordinate of the rectangle
     */
    public double getLeftCoordinate() {
        return this.left;
    }

}

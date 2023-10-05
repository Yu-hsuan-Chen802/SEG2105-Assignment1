package assignment.a1.design3;

import assignment.a1.design1.PointCP;

public class PointCP3
{
    //Instance variables ************************************************
    /**
     * Contains the current value of X or RHO depending on the type
     * of coordinates.
     */
    private double x;

    /**
     * Contains the current value of Y or THETA value depending on the
     * type of coordinates.
     */
    private double y;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP3(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    //Instance methods **************************************************


    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRho()
    {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta()
    {
        return Math.toDegrees(Math.atan2(y, x));
    }


    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public void convertStorageToPolar()
    {

    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public void convertStorageToCartesian()
    {

    }

    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP3 pointB)
    {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP3 rotatePoint(double rotation)
    {
        double radRotation = Math.toRadians(rotation);

        return new PointCP3((Math.cos(radRotation) * x) - (Math.sin(radRotation) * y),
                (Math.sin(radRotation) * x) + (Math.cos(radRotation) * y));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as " + "Cartesian  (" + getX() + "," + getY() + ")" + "\n";
    }
}
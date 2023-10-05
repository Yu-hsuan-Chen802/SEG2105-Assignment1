package assignment.a1.design5;

public class PointCP2 extends PointCP5
{
    //Instance variables ************************************************
    /**
     * Contains the current value of X or RHO depending on the type
     * of coordinates.
     */
    private double rho;

    /**
     * Contains the current value of Y or THETA value depending on the
     * type of coordinates.
     */
    private double theta;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP2(double rho, double theta)
    {
        this.rho = rho;
        this.theta = theta;
    }


    //Instance methods **************************************************


    public double getX()
    {
        return (Math.cos(Math.toRadians(theta)) * rho);
    }

    public double getY()
    {
        return (Math.sin(Math.toRadians(theta)) * rho);
    }

    public double getRho()
    {
        return rho;
    }

    public double getTheta()
    {
        return theta;
    }


    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public PointCP2 convertStorageToPolar() {
        //return this;
        return new PointCP2(rho, theta);
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public PointCP3 convertStorageToCartesian()
    {
        return new PointCP3(getX(), getY());
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP5 rotatePoint(double rotation)
    {
        return new PointCP2(rho, theta + rotation);
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as " + "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
    }
}

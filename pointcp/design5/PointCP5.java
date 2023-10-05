package assignment.a1.design5;

public abstract class PointCP5
{
    public abstract double getX();
    public abstract double getY();
    public abstract double getRho();
    public abstract double getTheta();
    public abstract PointCP2 convertStorageToPolar();
    public abstract PointCP3 convertStorageToCartesian();
    public double getDistance(PointCP5 pointB) {
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }
    public abstract PointCP5 rotatePoint(double rotation);
}
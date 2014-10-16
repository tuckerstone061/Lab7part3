

package part3;

/**
 *
 * @author Tucker Stone
 * @version Oct 15, 2014
 */
public class Brick
{
    //~ Instance/static variables .............................................

    // instance variables:
    private int height;
    private int width;
    private int depth;

    // Constant: weight per cubic cm in grams
    private static final int WEIGHT_PER_CM3 = 2;


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Create a Brick. Parameters are edge lengths.
     * @param myHeight in centimeters
     * @param myWidth  in centimeters
     * @param myDepth  in centimeters
     */
    public Brick(int myHeight, int myWidth, int myDepth)
    {
        height = myHeight;
        width  = myWidth;
        depth  = myDepth;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get this brick's surface area.
     * @return the surface area in square centimeters
     */
    public double getSurfaceArea()
    {
        double side1 = width * height;
        double side2 = width * depth;
        double side3 = depth * height;
        double total = (side1 + side2 + side3) * 2;

        return total;
    }


    // ----------------------------------------------------------
    /**
     * Get this brick's weight.
     * @return the weight in kg.
     */
    public double getWeight()
    {
        double value = (this.getVolume() * WEIGHT_PER_CM3) / 1000.0;
        return value;
    }


    // ----------------------------------------------------------
    /**
     * Get this brick's volume.
     * @return the volume in qubic centimeters
     */
    public int getVolume()
    {
        return width * height * depth;
    }

    public int getHeight()
    {
        return height;
    }
}

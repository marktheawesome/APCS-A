//import jdk.javadoc.internal.doclets.toolkit.resources.doclets;
//import sun.jvm.hotspot.HelloWorld;

/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 *
 * @author Mark Gyomory
 * @version 8/28/2019
 */
public class Geometry
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width)
    {
        return length * width;
    }

    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height)
    {
        double area = base * height / 2.0;

        return area;
    }

    /**
     * Calculates the volume of a sphere.
     *
     * @param radius  radius of the sphere
     * @return   volume of the sphere
     */
    public static double sphereVolume(double radius)
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the area of a trapezoid.
     *
     * @param base1 length of base of one of the bases
     * @param base2 length of other base
     * @param height  height of the trapozoid
     * @return   area of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, Double height)
    {
        return (((base1 + base2) / 2) * height);
    }

    /**
     * Calculates the volume of a rectangular prism.
     *
     * @param length length of rectangular prism
     * @param width width of rectangular prism
     * @param height  height of the rectangular prism
     * @return   Volume of the rectangular prism
     */
    public static double recVolume(double length, double width, double height)
    {
        return (length * width * height);
    }

    /**
     * Calculates the volume of a cone.
     *
     * @param radius of the cone bottom
     * @param height of cone
     * @return   Volume of the cone
     */
    public static double coneVolume(double radius, double height)
    {
        return (Math.PI * Math.pow(radius, 2) * (height/3));
    }

    /**
     * Calculates the Surface area of a rectangular prism.
     *
     * @param width of rectuagular prisim
     * @param height of rectuagular prisim
     * @param length of rectuagular prisim
     * @return   Volume of the cone
     */
    public static double rectangleSurfaceArea(double width, double length, double height)
    {
        return (2 * ((width * length) + (height * length) + (height * width)));
    }

    /**
     * Calculates the Surface of a sphere.
     *
     * @param radius of the sphere
     * @return   Surface area of the sphere
     */
    public static double SphereSurfaceArea(double radius)
    {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    /**
     * Calculates the hypotenuse of a right triangle.
     *
     * @param a lenght od side 1
     * @param b length of side 2
     * @return distance between 2 points
     */
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    /**
     * Calculates the distance between 2 points.
     *
     * @param x1 x of first point
     * @param x2 x of secound point
     * @param y1 y of first point
     * @param y2 y of secound point
     * @return distance between 2 points
     */
    public static double distance(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt((y2-y1) + (x2-x1));
    }

    /**
     * Calculates the slope between 2 points.
     *
     * @param x1 x of first point
     * @param x2 x of secound point
     * @param y1 y of first point
     * @param y2 y of secound point
     * @return slope between 2 points
     */
    public static double slope(double x1, double x2, double y1, double y2)
    {
        return ((y2-y1)/(x2-x1));
    }

    /**
     * Calculates the area of a triangle given 3 sides.
     *
     * @param a length od side 1
     * @param b length of side 2
     * @param c length of side 3
     * @return area of trigle
     */
    public static double triArea(double a, double b, double c)
    {
        double p = (a+b+c)/2;
        return Math.sqrt((p) * (p-1) * (p-b) * (p-c));
    }
    public static void main(String[] args)
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);

        System.out.println(ta1);
        System.out.println(ta2);

        System.out.println(trapezoidArea(1.0, 2.0, 3.0));
        System.out.println(recVolume(1.0, 2.0, 3.0));
        System.out.println(coneVolume(1, 2));
        System.out.println(rectangleSurfaceArea(1.0, 2.0, 3.0));
        System.out.println(SphereSurfaceArea(3.0));
        System.out.println(hypotenuse(3.0, 4.0));
        System.out.println(distance(1, 2, 2, 3));
        System.out.println(slope(1.0,2.0,2.0,3.0));
    }
}

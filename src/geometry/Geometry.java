package geometry;

public class Geometry {

    public static double squareArea(double side) {
        return Math.pow(side, 2);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double cubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double parallelepipedVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double trapezoidArea(double base1, double base2, double height) {
        return ((base1 + base2) * height / 2) ;
    }

    public static double sphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
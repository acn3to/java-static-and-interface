import converter.TemperatureConverter;
import geometry.Geometry;

public class Main {
    public static void main(String[] args) {
        double squareSide = 5;
        double rectangleLength = 10, rectangleWidth = 20;
        double triangleBase = 15, triangleHeight = 30;
        double circleRadius = 7;
        double cubeSide = 8;
        double parallelepipedLength = 12, parallelepipedWidth = 16, parallelepipedHeight = 24;
        double trapezoidBase1 = 10, trapezoidBase2 = 20, trapezoidHeight = 25;
        double sphereRadius = 9;

        System.out.println("Área do quadrado: " + Geometry.squareArea(squareSide));
        System.out.println("Área do retângulo: " + Geometry.rectangleArea(rectangleLength, rectangleWidth));
        System.out.println("Área do triângulo: " + Geometry.triangleArea(triangleBase, triangleHeight));
        System.out.println("Área do círculo: " + Geometry.circleArea(circleRadius));
        System.out.println("Volume do cubo: " + Geometry.cubeVolume(cubeSide));
        System.out.println("Volume do paralelepípedo: " + Geometry.parallelepipedVolume(parallelepipedLength, parallelepipedWidth, parallelepipedHeight));
        System.out.println("Área do trapézio: " + Geometry.trapezoidArea(trapezoidBase1, trapezoidBase2, trapezoidHeight));
        System.out.println("Área da esfera: " + Geometry.sphereArea(sphereRadius));
    }
}
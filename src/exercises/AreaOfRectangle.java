package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        //what data types should the dimensions be?
        //double
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateRectangleArea();
    }

    public void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the rectangle length?");
        Double rectangleLength = scanner.nextDouble();

        System.out.println("What is the rectangle width?");
        Double rectangleWidth = scanner.nextDouble();
        scanner.close();

        // area = length * width
        Double area = rectangleLength * rectangleWidth;

        System.out.println("Your rectangle area is: " + area.toString());
    }
}


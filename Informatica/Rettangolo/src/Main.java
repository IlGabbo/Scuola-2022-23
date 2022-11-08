import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(10, 10));
        rectangleList.add(new Rectangle(20, 34));
        rectangleList.add(new Rectangle(40, 15));
        float areaSum = 0;
        float perimeterSum = 0;

        for (Rectangle rectangle : rectangleList) {
            areaSum += rectangle.calcArea();
            perimeterSum += rectangle.calcPerimeter();
        }

        System.out.println("Sum of all areas of all rectangles: " + areaSum);
        System.out.println("Sum of all perimeters of all rectangles: " + perimeterSum);
        System.out.println();

        System.out.println("Which rectangle do you want to resize?");
        Rectangle tempRectangle = rectangleList.get(scanner.nextInt());
        System.out.println("Enter the new base and the new height");
        float tempBase = scanner.nextFloat();
        float tempHeight = scanner.nextFloat();
        tempRectangle.changeDimensions(tempBase, tempHeight);

        areaSum = 0;
        perimeterSum = 0;

        for (Rectangle rectangle : rectangleList) {
            areaSum += rectangle.calcArea();
            perimeterSum += rectangle.calcPerimeter();
        }

        System.out.println("Sum of all areas of all rectangles: " + areaSum);
        System.out.println("Sum of all perimeters of all rectangles: " + perimeterSum);
    }
}

class Rectangle {
    float base;
    float height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void changeDimensions(float base, float height) {
        this.base = base;
        this.height = height;
    }

    float calcPerimeter() {
        return (base + height) * 2;
    }

    float calcArea() {
        return base * height;
    }
}
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        int choice;

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        if (choice < 0)
            return -1;

        return choice;
    }

    public static void main(String[] args) {
        int choice;
        do {
            choice = Main.menu();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the radius");
                    Circle circle = new Circle(scanner.nextFloat());
                    System.out.println("Circumference = " + circle.calcCircumference());
                    System.out.println("Area = " + circle.calcArea());
                }
                case 2 -> {
                    System.out.println("Enter the width and length");
                    Rectangle rectangle = new Rectangle(scanner.nextFloat(), scanner.nextFloat());
                    System.out.println("Perimeter = " + rectangle.calcPerimeter());
                    System.out.println("Area = " + rectangle.calcArea());
                }
                case 3 -> {
                    System.out.println("Enter the base first and then the other two sides, then the height");
                    Triangle triangle = new Triangle(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
                    System.out.println("Perimeter = " + triangle.calcPerimeter());
                    System.out.println("Area = " + triangle.calcArea());
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter a valid number");
            }
        } while (true);
    }
}

class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    float calcCircumference() {
        return (float) ((2 * Math.PI) * radius);
    }

    float calcArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}

class Rectangle {
    float width;
    float length;
    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    float calcPerimeter() {
        return 2 * (length * width);
    }

    float calcArea() {
        return width * length;
    }
}

class Triangle {
    float base;
    float b;
    float c;
    float height;
    public Triangle(float base, float b, float c, float height) {
        this.base = base;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    float calcPerimeter() {
        return base + b + c;
    }

    float calcArea() {
        return (height * base) / 2;
    }
}
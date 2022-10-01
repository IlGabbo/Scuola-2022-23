import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area, circumference;

        Scanner scanner = new Scanner(System.in);

        radius = scanner.nextFloat();

        circumference = radius * 2 * Math.PI;
        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("%.2f%n", circumference);
        System.out.printf("%.2f%n", area);
    }
}

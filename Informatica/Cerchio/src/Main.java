import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area, circonference;

        Scanner scanner = new Scanner(System.in);

        radius = scanner.nextFloat();

        circonference = radius * 2 * Math.PI;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Circumference = " );
    }
}

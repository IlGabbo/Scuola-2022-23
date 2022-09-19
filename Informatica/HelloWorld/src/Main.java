import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        a = 51;
        b = 10;

        System.out.println("Variable a = " + a + "\nVariable b = " + b);

        if (a < b)
        {
            System.out.println(a);
        }
        else if (a > b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("They are the same");
        }

        Scanner scanner = new Scanner(System.in);

        int giglo = 0;

        scanner.nextInt(giglo);

        System.out.println(giglo);
    }
}


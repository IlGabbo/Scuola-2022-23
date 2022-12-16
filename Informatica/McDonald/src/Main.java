import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static McDonald mcDonald;

    public static void main(String[] args) {
        int input;
        do {
            System.out.println("""
                    [0] Print Menu
                    [1] Buy burgers
                    [2] Exit
                    """);
            input = scanner.nextInt();
        } while (input != 2);
    }

    static void printMenu(McDonald mcDonald) {
        System.out.println("Burgers available");
        for (Burger burger : mcDonald.Burgers) {
            System.out.println("------------------");
            System.out.println(burger.description + "\nQuantity Available: " + burger.quantity);
            System.out.println("Price: " + burger.price);
            System.out.println();
        }
    }

    static void buyItems(McDonald mcDonald) {

    }

    static void showReceipt(/*TODO return from buy items*/) {

    }
}

class McDonald {
    ArrayList<Burger> Burgers;

    public McDonald(ArrayList<Burger> burgers) {
        Burgers = burgers;
    }

}

class Burger {
    String id;
    String description;
    int quantity;
    float price;

    public Burger(String id, String description, int quantity, float price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
}
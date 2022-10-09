import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static int menu() {
        System.out.println("Enter a choice");
        System.out.println();
        int choice = scanner.nextInt();

        return choice;
    }
}

class BankAccount {
    float balance;
    void withdrawal(){}
    void payment(){}
    float getBalance() {
        return balance;
    }
    AccountHolder accountHolder;
}

class AccountHolder {
    String surname;
    String nome;
    int pin;
}
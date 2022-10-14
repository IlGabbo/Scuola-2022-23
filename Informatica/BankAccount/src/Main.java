import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank();

    static void mainMenu() {
        int temp;
        System.out.println("Enter your choice\n");

        System.out.println("0. Exit");
        System.out.println("1. Enter a pin");
        System.out.println("2. Admin Mode");
        switch (scanner.nextInt()) {
            case 0 -> System.exit(0);
            case 1 -> {
                System.out.println("Enter your pin line by line");
                List<Integer> pin = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                    do {
                        System.out.printf("Enter the %d number%n", i);
                        temp = scanner.nextInt();
                    } while (temp > 10);
                    pin.add(temp);
                }
                try {
                    checkPin(pin);
                } catch (Exception e) {
                    System.out.println("Pin not found");
                }
            }
            case 2 -> adminMenu();
            default -> System.out.println("Enter a valid number");
        }

    }

    static boolean checkUser(List<Integer> pin) {
        for (int i = 0; i < bank.accountHolderList.size(); i++) {
            if (pin.equals(bank.accountHolderList.get(i).pin)) {
                return true;
            }
        }
        return false;
    }

    static void checkPin(List<Integer> pin) throws Exception {
        boolean found = false;
        for (int i = 0; i < bank.accountHolderList.size(); i++) {
            if (pin.equals(bank.accountHolderList.get(i).pin)) {
                found = true;
                userMenu(bank.accountHolderList.get(i));
            }
        }
        if (!found)
            throw new Exception();
    }

    static void userMenu(AccountHolder user) {
        float temp;
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show balance");
            System.out.println("4. Update user balance");
            switch (scanner.nextInt()) {
                case 0:
                    return;
                case 1:
                    System.out.println("How much do you want to withdraw");
                    temp = scanner.nextFloat();
                    if (temp > 0) {
                        try {
                            user.withdrawal(temp);
                        } catch (Exception e) {
                            System.out.println("Not enough balance");
                            System.out.println("Your bank balance is " + user.bankAccount.balance);
                        }
                    }
                    break;
                case 2:
                    System.out.println("How much do you want to deposit?");
                    temp = scanner.nextFloat();
                    if (temp > 0) {
                        try {
                            user.deposit(temp);
                        } catch (Exception e) {
                            System.out.println("Not enough balance");
                            System.out.println("Your balance is " + user.userBalance);
                        }
                    }
                    break;
                case 3:
                    System.out.println(user.bankAccount.balance);
                    break;
<<<<<<< HEAD
                case 4:
                    System.out.println("How much do you want to add to your wallet?");
                    temp = scanner.nextFloat();
                    if (temp > 0) {
                        user.updateWallet(temp);
                    } else {
                        System.out.println("Enter a positive number");
                    }
                    break;
=======
>>>>>>> 635e1d0183af8942e92695b927c38bc6e1355406
            }
        }
    }

    static void adminMenu() {
        List<Integer> pin = new ArrayList<>();
        System.out.println("Press 1 to create a user, 0 to exit");
        if (scanner.nextInt() == 0)
            return;

        System.out.println("Enter the users name");
        String name = scanner.next();
        System.out.println("Enter the users surname");
        String surname = scanner.next();
        System.out.println("Enter the users initial balance");
        float initBalance = scanner.nextInt();
        int temp;
        do {
            System.out.println("Enter the pin line by line");

            for (int i = 0; i < 4; i++) {
                do {
                    System.out.printf("Enter the %d number%n", i);
                    temp = scanner.nextInt();
                } while (temp > 10);
                pin.add(temp);
            }
        } while (checkUser(pin));

        bank.accountHolderList.add(new AccountHolder(
                name,
                surname,
                initBalance,
                pin));
    }

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        System.out.println("Welcome to the bank\n");

        while (true) {
            mainMenu();
        }
    }
}

class Bank {
    public List<AccountHolder> accountHolderList = new ArrayList<>();
}

class BankAccount {
    final float FIDO = -3000.0F;
    float balance;
}

class AccountHolder {
    List<Integer> pin;
    BankAccount bankAccount = new BankAccount();
    String name, surname;
    float userBalance;

    public AccountHolder(String name, String surname, float initBalance, List<Integer> pin) {
        this.name = name;
        this.surname = surname;
        this.userBalance = initBalance;
        this.pin = pin;
    }

    void withdrawal(float withdrawalBalance) throws Exception {
        if (bankAccount.balance - bankAccount.FIDO >= withdrawalBalance) {
            bankAccount.balance -= withdrawalBalance;
            userBalance += withdrawalBalance;
        } else
            throw new Exception();
    }

    void deposit(float depositBalance) throws Exception {
        if (userBalance >= depositBalance) {
            bankAccount.balance += depositBalance;
            userBalance -= depositBalance;
        } else
            throw new Exception();
    }

    void updateWallet(float walletBalance) {
        userBalance += walletBalance;
    }
}
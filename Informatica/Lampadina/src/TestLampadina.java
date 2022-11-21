import java.util.Scanner;

enum StatoLampadina {
    accesa,
    spenta,
    rotta
}

public class TestLampadina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci quanti click deve resistere la lampadina");
        Lampadina lampadina = new Lampadina(scanner.nextInt());
        int input;
        do {
            System.out.println(
                    "0 per avere lo stato" +
                            "\n1 per cliccare" +
                            "\n2 per uscire"
            );
            input = scanner.nextInt();
            switch (input) {
                case 0 -> {
                    System.out.println(lampadina.stato());
                }
                case 1 -> {
                    lampadina.click();
                }
            }
        } while (input != 2);
    }
}

class Lampadina {
    int numeroClick = 0;
    int numeroClickFabbricante;
    StatoLampadina statoLampadina = StatoLampadina.spenta;

    public Lampadina(int numeroClickFabbricante) {
        this.numeroClickFabbricante = numeroClickFabbricante;
    }

    String stato() {
        if (statoLampadina == StatoLampadina.accesa) {
            return "La lampadina e accesa";
        } else if (statoLampadina == StatoLampadina.spenta) {
            return "La lampadina e spenta";
        } else if (statoLampadina == StatoLampadina.rotta) {
            return "La lampadina e rotta";
        }
        return null;
    }

    void click() {
        if (numeroClick > numeroClickFabbricante) {
            statoLampadina = StatoLampadina.rotta;
        }
        if (statoLampadina != StatoLampadina.rotta && statoLampadina == StatoLampadina.accesa) {
            statoLampadina = StatoLampadina.spenta;
            numeroClick++;
        } else if (statoLampadina != StatoLampadina.rotta && statoLampadina == StatoLampadina.spenta) {
            statoLampadina = StatoLampadina.accesa;
            numeroClick++;
        }
    }
}
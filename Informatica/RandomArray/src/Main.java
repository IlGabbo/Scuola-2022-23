import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = GenerateArray(scanner.nextInt());
        for (int var : array) {
            System.out.println(var);
        }
    }

    static int[] GenerateArray(int size) {
        int upperBound = 100;
        int lowerBound = 10;
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(upperBound - lowerBound) + lowerBound;
            if (num % 2 == 0) {
                num++;
            }
            if (i % 2 == 0) {
                array[i] = num;
            } else {
                array[i] = array[i - 1] + num;
            }
        }
        return array;
    }

    static void ModifyArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] += array[i++];
        }
    }
}
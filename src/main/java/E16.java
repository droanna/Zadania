import java.util.Scanner;

public class E16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int number = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = number;
                number += 1;
            }
        }
        for (int line[] : array) {
            for (int i : line) {
                System.out.printf("%d \t", i);
            }
            System.out.println();
        }
        int i = 1;
        int j = 0;
        int k = 0;

        System.out.println("Result:");
        while (i < size * size) {
            while (k < array.length && array[j][k] != 0) {
                System.out.printf("%d \t", array[j][k]);
                array[j][k] = 0;
                k += 1;
                i++;
            }
            k -= 1;
            j += 1;
            while (j < array.length && array[j][k] != 0) {
                System.out.printf("%d \t", array[j][k]);
                array[j][k] = 0;
                j += 1;
                i++;
            }
            j -= 1;
            k -= 1;
            while (k >= 0 && array[j][k] != 0) {
                System.out.printf("%d \t", array[j][k]);
                array[j][k] = 0;
                k -= 1;
                i++;
            }
            k += 1;
            j -= 1;
            while (j > 0 && array[j][k] != 0) {
                System.out.printf("%d \t", array[j][k]);
                array[j][k] = 0;
                j -= 1;
                i++;
            }
            j += 1;
            k += 1;

        }
    }
}


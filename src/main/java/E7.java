import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int[][] result = array(scanner.nextInt());

        for (int array[] : result) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }

    private static int[][] array(int i) {
        if (i >= 1 && i <= 10) {
            int[][] result = new int[i][i];
            int n = 1;
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    result[j][k] = n;
                    if (n < i) {
                        n++;
                    } else {
                        n = 1;
                    }
                }
                n = j + 2;
            }
            return result;
        } else {
            throw new IllegalArgumentException("Liczba z zakresu [1, 10]");
        }
    }
}

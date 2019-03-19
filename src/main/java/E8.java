import java.util.Random;
import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar poziomy: ");
        int n = scanner.nextInt();
        System.out.println("Podaj wymiar pionowy: ");
        int m = scanner.nextInt();
        System.out.println("Podaj prawdopodobieństwo wystąpienia bomby: ");
        int p = scanner.nextInt();

        int[][] bombs = getBombs(n, m, p);
        System.out.println("Bomby: ");
        for (int array[] : bombs) {
            for (int number : array) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] result = getResults(n, m, bombs);

        System.out.println("Wyniki: ");
        for (int array[] : result) {
            for (int number : array) {
                if (number == 10) {
                    System.out.print("* ");
                } else {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }


    private static int[][] getBombs(int n, int m, int p) {
        int[][] bombs = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int probability = random.nextInt(100);
                if (probability < p) {
                    bombs[i][j] = 1;
                } else {
                    bombs[i][j] = 0;
                }
            }
        }
        return bombs;
    }

    private static int[][] getResults(int n, int m, int[][] bombs) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (bombs[i][j] == 1) {
                    result[i][j] = 10;
                } else {
                    int bombsNumber = 0;
                    if (j > 0 && j < n - 1 && i > 0 && i < m - 1) {
                        bombsNumber = bombs[i - 1][j - 1] + bombs[i - 1][j] + bombs[i - 1][j + 1] + bombs[i][j - 1] + bombs[i][j + 1] + bombs[i + 1][j - 1] + bombs[i + 1][j] + bombs[i + 1][j + 1];
                    }
                    if (j == 0 && i > 0 && i < m - 1) {
                        bombsNumber = bombs[i - 1][j] + bombs[i - 1][j + 1] + bombs[i][j + 1] + bombs[i + 1][j] + bombs[i + 1][j + 1];
                    }
                    if (j == n - 1 && i > 0 && i < m - 1) {
                        bombsNumber = bombs[i - 1][j] + bombs[i][j - 1] + bombs[i + 1][j - 1] + bombs[i + 1][j] + bombs[i - 1][j - 1];
                    }
                    if (j > 0 && j < n - 1 && i == 0) {
                        bombsNumber = bombs[i][j - 1] + bombs[i][j + 1] + bombs[i + 1][j - 1] + bombs[i + 1][j] + bombs[i + 1][j + 1];

                    }
                    if (j > 0 && j < n - 1 && i == m - 1) {
                        bombsNumber = bombs[i - 1][j - 1] + bombs[i - 1][j] + bombs[i - 1][j + 1] + bombs[i][j - 1] + bombs[i][j + 1];
                    }
                    if (j == 0 && i == 0) {
                        bombsNumber = bombs[i][j + 1] + bombs[i + 1][j] + bombs[i + 1][j + 1];
                    }
                    if (j == n - 1 && i == 0) {
                        bombsNumber = bombs[i][j - 1] + bombs[i + 1][j - 1] + bombs[i + 1][j];
                    }
                    if (j == 0 && i == m - 1) {
                        bombsNumber = bombs[i - 1][j] + bombs[i - 1][j + 1] + bombs[i][j + 1];
                    }
                    if (j == n - 1 && i == m - 1) {
                        bombsNumber = bombs[i - 1][j - 1] + bombs[i - 1][j] + bombs[i][j - 1];
                    }

                    result[i][j] = bombsNumber;
                }

            }
        }
        return result;
    }
}

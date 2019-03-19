import java.util.Random;
import java.util.Scanner;

public class E9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiary tablicy: ");
        int value = scanner.nextInt();
        if (value < 10 || value > 100) {
            throw new IllegalArgumentException("Liczba z zakresu [10, 100]");
        }

        boolean[][] places = new boolean[value][value];


        Random random = new Random();
        int x = random.nextInt(value);
        int y = random.nextInt(value);
        places[x][y] = true;
        int sum = 0;
        int steps = 0;

        while (sum < value * value - 1) {

            int direction = random.nextInt(4);
            switch (direction) {
                case 0:
                    if (x - 1 < 0) {
                        x = random.nextInt(value);
                        y = random.nextInt(value);
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    } else {
                        x = x - 1;
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps = steps + 1;
                    }
                    break;
                case 1:
                    if (x + 1 > value - 1) {
                        x = random.nextInt(value);
                        y = random.nextInt(value);
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    } else {
                        x = x + 1;
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    }
                    break;
                case 2:
                    if (y - 1 < 0) {
                        x = random.nextInt(value);
                        y = random.nextInt(value);
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    } else {
                        y = y - 1;
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    }
                    break;
                case 3:
                    if (y + 1 > value - 1) {
                        x = random.nextInt(value);
                        y = random.nextInt(value);
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    } else {
                        y = y + 1;
                        if (!places[x][y]) {
                            places[x][y] = true;
                            sum += 1;
                        }
                        steps += 1;
                    }
                    break;
            }
        }

        System.out.println("Liczba kroków: " + steps);


    }
}



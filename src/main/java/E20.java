import java.util.ArrayList;

public class E20 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{5, 3, 4, 6, 7, 8, 9, 1, 2}, {6, 7, 2, 1, 9, 5, 3, 4, 8}, {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3}, {4, 2, 6, 8, 5, 3, 7, 9, 1}, {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4}, {2, 8, 7, 4, 1, 9, 6, 3, 5}, {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        for (int[] line : array) {
            for (int i : line) {
                System.out.printf("%d \t", i);
            }
            System.out.println();
        }

        if (checkIfCorrectSudoku(array)) {
            System.out.println("Correct sudoku");
        }

    }

    private static boolean checkIfCorrectSudoku(int[][] array) {
        return checkHorrizontalLine(array) && checkVerticalLine(array) && checkSquare(array);
    }

    private static boolean checkHorrizontalLine(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] line : array) {
            for (int i : line) {
                if (!list.contains(i) && i > 0 && i < 10) {
                    list.add(i);
                } else {
                    return false;
                }
            }
            list.clear();
        }
        return true;
    }

    private static boolean checkVerticalLine(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int[] anArray : array) {
                int number = anArray[i];
                if (!list.contains(number) && number > 0 && number < 10) {
                    list.add(number);
                } else {
                    return false;
                }
            }
            list.clear();
        }
        return true;
    }

    private static boolean checkSquare(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (sum < 81) {
            while (y < 3) {
                while (x < 3) {
                    int number = array[i][j];
                    if (!list.contains(number) && number > 0 && number < 10) {
                        list.add(number);
                        sum++;
                    } else {
                        return false;
                    }
                    j++;
                    x++;
                }
                j = j - 3;
                x = 0;
                i++;
                y++;
            }
            list.clear();
            if (j == 6) {
                j = 0;
                x = 0;
                y = 0;
            } else {
                j = j + 3;
                i = i - 3;
                x = 0;
                y = 0;
            }
        }
        return true;

    }
}

import java.util.ArrayList;

public class E20 {

    public static void main(String[] args) {
        int[][] array = new int[9][9];
        array[0][0] = 5;
        array[0][1] = 3;
        array[0][2] = 4;
        array[0][3] = 6;
        array[0][4] = 7;
        array[0][5] = 8;
        array[0][6] = 9;
        array[0][7] = 1;
        array[0][8] = 2;
        array[1][0] = 6;
        array[1][1] = 7;
        array[1][2] = 2;
        array[1][3] = 1;
        array[1][4] = 9;
        array[1][5] = 5;
        array[1][6] = 3;
        array[1][7] = 4;
        array[1][8] = 8;
        array[2][0] = 1;
        array[2][1] = 9;
        array[2][2] = 8;
        array[2][3] = 3;
        array[2][4] = 4;
        array[2][5] = 2;
        array[2][6] = 5;
        array[2][7] = 6;
        array[2][8] = 7;
        array[3][0] = 8;
        array[3][1] = 5;
        array[3][2] = 9;
        array[3][3] = 7;
        array[3][4] = 6;
        array[3][5] = 1;
        array[3][6] = 4;
        array[3][7] = 2;
        array[3][8] = 3;
        array[4][0] = 4;
        array[4][1] = 2;
        array[4][2] = 6;
        array[4][3] = 8;
        array[4][4] = 5;
        array[4][5] = 3;
        array[4][6] = 7;
        array[4][7] = 9;
        array[4][8] = 1;
        array[5][0] = 7;
        array[5][1] = 1;
        array[5][2] = 3;
        array[5][3] = 9;
        array[5][4] = 2;
        array[5][5] = 4;
        array[5][6] = 8;
        array[5][7] = 5;
        array[5][8] = 6;
        array[6][0] = 9;
        array[6][1] = 6;
        array[6][2] = 1;
        array[6][3] = 5;
        array[6][4] = 3;
        array[6][5] = 7;
        array[6][6] = 2;
        array[6][7] = 8;
        array[6][8] = 4;
        array[7][0] = 2;
        array[7][1] = 8;
        array[7][2] = 7;
        array[7][3] = 4;
        array[7][4] = 1;
        array[7][5] = 9;
        array[7][6] = 6;
        array[7][7] = 3;
        array[7][8] = 5;
        array[8][0] = 3;
        array[8][1] = 4;
        array[8][2] = 5;
        array[8][3] = 2;
        array[8][4] = 8;
        array[8][5] = 6;
        array[8][6] = 1;
        array[8][7] = 7;
        array[8][8] = 9;

        for (int[] line : array) {
            for (int i : line) {
                System.out.printf("%d \t", i);
            }
            System.out.println();
        }

        if(checkIfCorrectSudoku(array)){
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

import java.util.ArrayList;
import java.util.List;

public class E5 {

    public static void main(String[] args) {
        System.out.println("Liczby podzie;ne przez 3: " + numbersDividedBy3());
        System.out.println("Liczby podzielne przez 5: " + numbersDividedBy5());
        System.out.println("Liczby podzielne przez 3 i 5: " + numbersDividedBy3And5());
    }

    private static List<Integer> numbersDividedBy3() {
        int i = 1;
        List<Integer> numbers = new ArrayList<>();
        while (i <= 100) {
            if (i % 3 == 0) {
                numbers.add(i);
            }
            i++;
        }
        return numbers;
    }

    private static List<Integer> numbersDividedBy5() {
        int i = 1;
        List<Integer> numbers = new ArrayList<>();
        while (i <= 100) {
            if (i % 5 == 0) {
                numbers.add(i);
            }
            i++;
        }
        return numbers;
    }

    private static List<Integer> numbersDividedBy3And5() {
        int i = 1;
        List<Integer> numbers = new ArrayList<>();
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add(i);
            }
            i++;
        }
        return numbers;
    }
}

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę n: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("n + nn + nnn = " + sumOfThreeNumbers(number));
    }

    private static int sumOfThreeNumbers(int number){
        if (number>0) {
            String numberString = String.valueOf(number);
            String number2 = numberString + numberString;
            String number3 = numberString + numberString + numberString;
            return number + Integer.parseInt(number2) + Integer.parseInt(number3);
        } else{
            throw new IllegalArgumentException("Niewłaściwa liczba");
        }
    }
}

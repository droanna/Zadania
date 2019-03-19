import java.util.Random;
import java.util.Scanner;

public class E14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number: ");
        String userNumber = scanner.nextLine();
        if (userNumber.length() == 1) {
            userNumber = "0" + userNumber;
        }

        Random random = new Random();
        int number = random.nextInt(100);
        String luckyNumber = Integer.toString(number);
        if (luckyNumber.length() == 1) {
            luckyNumber = "0" + luckyNumber;
        }

        lottery(userNumber, luckyNumber);

    }

    private static void lottery(String userNumber, String luckyNumber) {
        System.out.println("Lucky number: " + luckyNumber);
        if (userNumber.equals(luckyNumber)) {
            System.out.println("You won $10,000!");
        } else if (userNumber.charAt(0) == luckyNumber.charAt(1) && userNumber.charAt(1) == luckyNumber.charAt(0)) {
            System.out.println("You won $3,000!");
        } else if (luckyNumber.contains(userNumber.substring(0, 1)) || luckyNumber.contains(userNumber.substring(1))) {
            System.out.println("You won $1,000!");
        } else {
            System.out.println("Maybe next time... :(");
        }
    }
}

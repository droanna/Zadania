import java.util.Scanner;

public class E18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Postal Code: ");
        String pCode = scanner.nextLine();
        postalCode(pCode);
    }

    private static void postalCode(String pCode) {
        System.out.println("*****");
        int i = 0;
        int sum = 0;
        int number;
        while (i <= pCode.length()) {
            if (i < pCode.length()) {
                number = Integer.parseInt(pCode.substring(i,i+1));
                sum += number;
            } else {
                number = sum % 10;
            }
            switch (number) {
                case 0:
                    System.out.println(PostalCode.ZERO.getCode());
                    break;
                case 1:
                    System.out.println(PostalCode.ONE.getCode());
                    break;
                case 2:
                    System.out.println(PostalCode.TWO.getCode());
                    break;
                case 3:
                    System.out.println(PostalCode.THREE.getCode());
                    break;
                case 4:
                    System.out.println(PostalCode.FOUR.getCode());
                    break;
                case 5:
                    System.out.println(PostalCode.FIVE.getCode());
                    break;
                case 6:
                    System.out.println(PostalCode.SIX.getCode());
                    break;
                case 7:
                    System.out.println(PostalCode.SEVEN.getCode());
                    break;
                case 8:
                    System.out.println(PostalCode.EIGHT.getCode());
                    break;
                case 9:
                    System.out.println(PostalCode.NINE.getCode());
                    break;
            }
            i++;

        }
        System.out.println("*****");
    }
}


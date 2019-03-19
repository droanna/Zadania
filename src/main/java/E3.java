import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String text  = scanner.nextLine();
        System.out.println("Ilość wystąpiń spacji: " + numberOfSpaces(text));
    }

    private static int numberOfSpaces(String text){
        int sum = 0;
        int count = 0;
        while (count<text.length()){
            if (text.charAt(count)==' '){
                sum+=1;
            }
            count++;
        }
        return sum;
    }


}

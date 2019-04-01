import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class E17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day of the month: ");
        int q = scanner.nextInt();
        System.out.println("Month: ");
        int m = scanner.nextInt();

        System.out.println("Year: ");
        int year = scanner.nextInt();


        if (isRightDate(q,m,year)) {
            System.out.println("Day of week: " + dayOfWeek(q, m, year));
        }
        else{
            System.out.println("Invalid date");
        }

    }

    private static String dayOfWeek(int q, int m, int year) {
        if (m == 1) {
            m = 13;
        }
        if (m == 2) {
            m = 14;
        }
        int j = year / 100;
        int k = year % 100;

        int dayOfWeek = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        switch (dayOfWeek) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
        }
        return "";
    }


    private static boolean isRightDate(int q, int m, int year) {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try {
            Date rightDate = format.parse(String.valueOf(q) + "/" + String.valueOf(m) + "/" + String.valueOf(year));
            if (rightDate.toString().equals(String.valueOf(q) + "/" + String.valueOf(m) + "/" + String.valueOf(year))) {
                return true;
            }
        } catch (ParseException e) {
            e.getMessage();
            return false;
        }
        return true;
    }
}

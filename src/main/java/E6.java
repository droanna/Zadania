import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba sekund: ");
        time(scanner.nextInt());

    }
    private static void time(int seconds){
        int hours = 0;
        int minutes  = 0;
        if(seconds/3600>0){
            hours = seconds/3600;
            seconds = seconds - hours*3600;
        } if(seconds>60){
            minutes = seconds/60;
            seconds = seconds-minutes*60;
        }


        LocalTime time = LocalTime.of(hours, minutes, seconds);
        System.out.println(time);
    }
}

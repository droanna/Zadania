import java.util.Scanner;

public class E15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year: ");
        int year = scanner.nextInt();
        zodiac(year);
    }

    private static void zodiac(int year) {
        if ((year - 1900) % 12 == 0) {
            System.out.println("The year of rat");
        }
        if ((year - 1901) % 12 == 0) {
            System.out.println("The year of ox");
        }
        if ((year - 1902) % 12 == 0) {
            System.out.println("The year of tiger");
        }
        if ((year - 1903) % 12 == 0) {
            System.out.println("The year of rabbit");
        }
        if ((year - 1904) % 12 == 0) {
            System.out.println("The year of dragon");
        }
        if ((year - 1905) % 12 == 0) {
            System.out.println("The year of snake");
        }
        if ((year - 1906) % 12 == 0) {
            System.out.println("The year of horse");
        }
        if ((year - 1907) % 12 == 0) {
            System.out.println("The year of sheep");
        }
        if ((year - 1908) % 12 == 0) {
            System.out.println("The year of monkey");
        }
        if ((year - 1909) % 12 == 0) {
            System.out.println("The year of rooster");
        }
        if ((year - 1910) % 12 == 0) {
            System.out.println("The year of dog");
        }
        if ((year - 1911) % 12 == 0) {
            System.out.println("The year of pig");
        }
    }
}

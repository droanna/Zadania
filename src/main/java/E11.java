import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting velocity [m/s]: ");
        double startingVelocity = scanner.nextDouble();
        System.out.println("Ending velocity [m/s]: ");
        double endingVelocity = scanner.nextDouble();
        System.out.println("Time span [s]: ");
        double timeSpan = scanner.nextDouble();

        double acceleration = (endingVelocity-startingVelocity)/timeSpan;
        System.out.println("Acceleration: " + acceleration + "[m/s2]");
    }
}

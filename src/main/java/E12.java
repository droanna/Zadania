import java.util.Scanner;

public class E12 {

    private static final double SPECIFIC_HEAT = 4180;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial temperature [K]: ");
        double initialTemperature = scanner.nextDouble();
        System.out.println("Final temperature [K]: ");
        double finalTemperature = scanner.nextDouble();
        System.out.println("Amount of water [kg]: ");
        double amountOfWater = scanner.nextDouble();

        double energy = amountOfWater * SPECIFIC_HEAT * (finalTemperature - initialTemperature);
        System.out.println("Energy: " + energy + "[J]");

    }
}

import java.util.Scanner;

public class E2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        double a = scanner.nextDouble();

        System.out.println("Pole powierzchni = " + area(a));
        System.out.println("Obwód = " + circuit(a));
        System.out.println("Krótsza przekątna = " + shortDiagonal(a));
        System.out.println("Dłuższa przekątna = " + longDiagonal(a));
        System.out.println("Promień okręgu wpisanego = " + incircleRadius(a));
    }

    private static double area(double a){
        return 3*Math.sqrt(3)*Math.pow(a,2)/2;
    }

    private static double circuit(double a){
        return 6*a;
    }

    private static double shortDiagonal(double a){
        return Math.sqrt(3)*a;
    }

    private static double longDiagonal(double a){
        return 2*a;
    }

    private  static double incircleRadius(double a){
        return a*Math.sqrt(3)/2;
    }
}

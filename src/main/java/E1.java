public class E1 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 9) {
            System.out.println(line1(6, 34));
            i++;

            if (i < 9) {
                System.out.println(line2(5, 34));
                i++;
            }
        }
        for (int j = 0; j < 6; j++) {
            System.out.println(line3(46));
        }

    }


    private static String line1(int stars, int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stars; i++) {
            sb.append("* ");
        }
        for (int i = 0; i < lines; i++) {
            sb.append("=");
        }
        return sb.toString();
    }

    private static String line2(int stars, int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stars; i++) {
            sb.append(" *");
        }
        sb.append("  ");
        for (int i = 0; i < lines; i++) {
            sb.append("=");
        }
        return sb.toString();
    }

    private static String line3(int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            sb.append("=");
        }
        return sb.toString();
    }
}
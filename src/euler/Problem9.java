package euler;

public class Problem9 {

    static double x = 1, y = 1, z = 0;

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();
        boolean hi = false;

        for (x = 1; x <= 1000d; x++) {
            if (check(x, y)) {
                hi = true;
                break;
            }
            for (y = 1; y <= 1000d; y++) {
                if (check(x, y)) {
                    hi = true;
                    break;
                }
            }
            if (hi) {
                break;
            }

        }

        final long total = System.currentTimeMillis() - startTime;
        System.out.println(total + " milliseconds");
    }

    public static boolean check(double x, double y) {
        z = (Math.pow(x, 2) + Math.pow(y, 2));
        double p = Math.sqrt(z);
        if ((p % 1) == 0.0) {
            if (x + y + p == 1000) {
                System.out.println("found answer: " + x + " " + y + " " + " "
                        + p + " = " + (x + y + p));
                int l = (int) (x * y * p);
                System.out.println("product " + l);
                return true;
            }
            return false;
        }
        return false;
    }

}

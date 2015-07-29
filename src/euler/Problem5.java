package euler;

public class Problem5 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        long total = 0;
        boolean found = false;

        for (long x = 20; x <= 99999999999999999l; x++) {

            for (long y = 1; y <= 20; y++) {

                if (x % y != 0) {
                    break;

                } else if (y == 20) {

                    found = true;
                    total = x;
                }
            }

            if (found) {
                break;
            }

        }
        System.out.println(total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

}

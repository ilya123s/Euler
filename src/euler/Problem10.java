package euler;

public class Problem10 {

    static int limit = 2000000;

    static int count = 0;

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();
        long total = 0;
        for (int y = 2; y <= limit; y++) {
            // System.out.println(x);
            if (isPrime(y)) {
                total += y;
            }
        }

        System.out.println("total = " + total);
        System.out.println("number of primes found: " + count);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

    public static boolean isPrime(int x) {

        for (int y = 2; y <= (x - 1); y++) {
            if ((x % y) == 0) {
                // System.out.println("not prime " );
                return false;
            }
        }
        // System.out.println("found prime " + x);
        ++count;
        return true;
    }

}

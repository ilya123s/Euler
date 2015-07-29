package euler;

public class Problem3 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        long numberToBeFactored = 600851475143l, total = 0;

        for (long i = 1; i <= numberToBeFactored - 1; i++) {
            if (numberToBeFactored % i == 0) {
                if (isPrime(i) && i > total) {
                    total = i;
                    System.out.println("new max prime " + total);
                }
            }
        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

    /**
     * Checks that int given is either prime or not
     * 
     * @param potentialPrime
     * @return
     */
    private static boolean isPrime(long potentialPrime) {

        if (potentialPrime == 0 || potentialPrime == 1) {
            return false;
        }

        for (long i = 2; i <= potentialPrime - 1; i++) {

            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }

}

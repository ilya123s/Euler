package euler;

public class Problem7 {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int total = 2, primeCount = 0, limit = 10001;

        while (primeCount != limit) {
            if (isPrime(total)) {
                primeCount++;
            }

            total++;

        }

        System.out.println("total " + (total - 1));
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
    private static boolean isPrime(int potentialPrime) {

        if (potentialPrime == 0 || potentialPrime == 1) {
            return false;
        }

        for (int i = 2; i <= potentialPrime - 1; i++) {

            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }

}

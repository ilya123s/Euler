package euler;

public class Problem21 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        int total = 0;

        for (int x = 1; x < 10000; x++) {

            if (isAmicable(x)) {
                System.out.println("AMICABLE " + x);
                total += x;
            }
        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

    public static boolean isAmicable(int potentialAmicable) {

        int sumA = calculateSumDivisors(potentialAmicable);
        int sumB = calculateSumDivisors(sumA);
        if (sumA == potentialAmicable) {
            return false;
        }
        // System.out.println(potentialAmicable + " SUMA " + sumA + " SUMB "
        // + sumB);

        return potentialAmicable == sumB;
    }

    public static int calculateSumDivisors(int toBeDivided) {

        int total = 0;

        for (int i = 1; i <= toBeDivided / 2; i++) {
            if (toBeDivided % i == 0) {
                // System.out.println("DIVISOR " + i);
                total += i;
            }
        }

        return total;

    }
}

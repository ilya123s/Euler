package euler;

public class Problem14 {

    private static int limit = 1000000, chainCount, finalChainCount,
            finalSequence;

    public static void main(String args[]) {

        finalChainCount = 0;
        long x = 0;
        final long startTime = System.currentTimeMillis();

        for (int sequence = 2; sequence <= limit; sequence++) {

            chainCount = 1;
            x = sequence;
            System.out.println(x);
            while (x != 1) {
                x = iterate(x);
            }
            if (chainCount > finalChainCount) {
                finalChainCount = chainCount;
                finalSequence = sequence;
            }

        }

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");
        System.out.println("Chain count: " + finalChainCount);
        System.out.println("sequence number: " + finalSequence);

    }

    private static long iterate(long x) {
        if (isEven(x)) {
            x /= 2;
        } else {
            x *= 3;
            x += 1;
        }
        chainCount++;
        return x;

    }

    private static boolean isEven(long n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

}

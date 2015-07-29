package euler;

public class Problem2 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        long total = 0;
        long fibonacci = 0, fibPrev = 1, fibNext = 0;
        boolean reached = false;

        while (!reached) {

            fibNext = fibonacci + fibPrev;
            fibPrev = fibonacci;
            fibonacci = fibNext;
            System.out.println(fibonacci);

            if (fibonacci % 2l == 0l) {
                total += fibonacci;
            }

            if (fibonacci >= 4000000l) {
                reached = true;
            }

        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }
}

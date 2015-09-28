package euler;

public class Problem1 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        int total = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }

        }
        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

}

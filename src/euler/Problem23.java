package euler;

import java.util.ArrayList;

public class Problem23 {

    private static int limit = 28123;

    public static void main(String[] args) {

        // ANSWER 4179871
        final long startTime = System.currentTimeMillis();
        int total = 0;
        Integer added = 0;
        ArrayList<Integer> abundantList = new ArrayList();
        ArrayList<Integer> abundantSum = new ArrayList();

        for (int x = 1; x <= limit; x++) {

            if (isAbundant(x)) {
                abundantList.add(x);
            }
        }

        for (int y = 0; y < abundantList.size(); y++) {
            added = 0;
            System.out.println(y);
            for (int z = y; z < abundantList.size(); z++) {
                added = abundantList.get(y) + abundantList.get(z);

                if (!abundantSum.contains(added) && added <= limit) {
                    abundantSum.add(added);
                }
            }
        }

        for (int x = 1; x <= limit; x++) {

            if (!abundantSum.contains(x)) {
                total += x;
            }
        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

    public static boolean isAbundant(int abundant) {

        int total = 0;

        for (int i = 1; i <= abundant / 2; i++) {

            if (abundant % i == 0) {
                total += i;
            }
        }

        return total > abundant;

    }

}

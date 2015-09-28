package euler;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Problem26 {

    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();
        int total = 0, maxOrruance = 0;
        BigDecimal divider;

        MathContext mc = new MathContext(999, RoundingMode.HALF_UP);

        for (int i = 1; i <= 1000; i++) {

            String iString = new Integer(i).toString();
            divider = new BigDecimal(iString);
            BigDecimal result = new BigDecimal("1").divide(divider, mc);

            int ocurrance = findRecurrance(result);
            System.out.println(result);
            if (ocurrance > maxOrruance) {
                maxOrruance = ocurrance;
                total = i;
            }

        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");
    }

    private static int findRecurrance(BigDecimal bigDecimal) {

        char[] splitDecimal = bigDecimal.toString().toCharArray();
        char[] cloneSplit = splitDecimal.clone();
        int count = 1;

        // start from 2 as numbers have 0. in front of them
        for (int x = 2; x < splitDecimal.length; x++) {

            for (int y = 3; y < cloneSplit.length; y++) {

                if (splitDecimal[x] == cloneSplit[y]) {
                    break;
                }
                count++;
            }
        }

        return count;

    }
}

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
            System.out.println(i + " " + result);
            if (ocurrance > maxOrruance) {
                maxOrruance = ocurrance;
                total = i;
            }

        }

        System.out.println("total " + total + " MAX Occurance " + maxOrruance);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000) + " seconds");
    }

    private static int findRecurrance(BigDecimal bigDecimal) {

        char[] splitDecimal = bigDecimal.toString().toCharArray();
        char[] cloneSplit = splitDecimal.clone();
        int count = 1;
        boolean isPastFirstZeros = false;

        // start from 2 as numbers have 0. in front of them
        OUTERLOOP: for (int x = 2; x < splitDecimal.length; x++) {

            if (splitDecimal[x] == '0' && !isPastFirstZeros) {
                continue;
            }

            isPastFirstZeros = true;
            count = 1;

            for (int y = x + 1; y < cloneSplit.length; y++) {

                if (splitDecimal[x] == cloneSplit[y]) {
                    break;
                }

                count++;
            }

            if (x + (count * 2) < splitDecimal.length) {
                for (int z = 0; z <= count; z++) {

                    if (splitDecimal[x + z] != cloneSplit[x + z + count]) {
                        count = 1;
                        break;
                    } else if (z == count) {
                        break OUTERLOOP;
                    }

                }
            } else if (count > 994) {
                count = 1;
            }
        }

        return count;

    }
}

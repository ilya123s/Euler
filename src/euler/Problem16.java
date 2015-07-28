package euler;

import java.math.BigDecimal;

public class Problem16 {

    private static double power = 1000;

    private static BigDecimal calculation;

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();

        calculation = new BigDecimal(Math.pow(2, power));
        System.out.println(calculation);
        getResult();

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");

    }

    public static void getResult() {

        char[] charArray = calculation.toString().toCharArray();
        Long result = 0L;

        for (int x = 0; x <= charArray.length - 1; x++) {

            result += Long.parseLong(String.valueOf(charArray[x]));

        }
        System.out.println(result);
    }

}

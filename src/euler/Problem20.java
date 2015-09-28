package euler;

import java.math.BigInteger;

public class Problem20 {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        Integer total = 0;
        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            System.out.println("Fact " + factorial);
            factorial = factorial.multiply(new BigInteger(new Integer(i)
                    .toString()));
        }
        System.out.println(factorial);
        char[] splitFactorial = factorial.toString().toCharArray();

        for (char c : splitFactorial) {
            System.out.println(c);

            total += new Integer((new Character(c).toString()));
        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }
}

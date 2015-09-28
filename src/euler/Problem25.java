package euler;

import java.math.BigInteger;

public class Problem25 {

    public static void main(String[] args) {

        int indexCount = 1;
        int limit = 1000;

        BigInteger prevFib = new BigInteger("0");
        BigInteger fib = new BigInteger("1");
        BigInteger nextFib = new BigInteger("0");

        while (fib.toString().toCharArray().length != limit) {
            System.out.println("INDEX " + indexCount + " " + fib);
            nextFib = fib.add(prevFib);
            prevFib = fib;
            fib = nextFib;
            indexCount++;

        }

        System.out.println(indexCount);

    }

}

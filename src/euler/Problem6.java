package euler;

public class Problem6 {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int total = 0, square = 0, sum = 0;

        for (int i = 1; i <= 100; i++) {

            square += i * i;
            sum += i;
        }

        sum *= sum;

        total = sum - square;

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

}

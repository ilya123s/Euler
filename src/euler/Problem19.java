package euler;

public class Problem19 {

    private static final int startYear = 1900;

    private static final int endYear = 2000;

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int sundayCount = 0, days = 0;
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int y = startYear; y <= endYear; y++) {

            for (int m = 0; m < months.length; m++) {
                days += months[m];
                // leap year condition
                if (y > startYear && y % 4 == 0 && m == 1) {
                    days++;
                    System.out.println("LEAP YEAR " + y);
                }
                if ((days + 1) % 7 == 0) {
                    sundayCount++;
                }

            }

        }

        // For this problem we need to exclude year 1900, however we can't just
        // set start year to 1900 Because we know that jan 1 1900 is Monday.
        // There are 2 sunday which are on the first of the month so we need to
        // remove 2 from the total count.
        System.out.println("total " + (sundayCount - 2));
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

}

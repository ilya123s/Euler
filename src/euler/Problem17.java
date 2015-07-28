package euler;

public class Problem17 {

    private static String[] oneToNine = { "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", };

    private static String[] elevenToNineteen = { "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen" };

    private static String[] tens = { "ten", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety" };

    private static String hundred = "hundred";

    private static String thousand = "thousand";

    private static String and = "and";

    private static long total;

    private static int maxNumber = 1000, startNumber = 1;

    public static void main(String args[]) {

        System.out.println(Problem17.class.getName());
        //System.out.println("TEST " + calculateLength(1000));

        final long startTime = System.currentTimeMillis();

        total = 0;

        for (int i = startNumber; i <= maxNumber; i++) {

            long temp = calculateLength(i);
            System.out.println("chars in " + i + " " + temp);
            total += temp;
            System.out.println("after " + i + " " + total);
        }

        System.out.println("Final result " + total);

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");

    }

    private static long calculateLength(int i) {

        String iString = ((Integer) i).toString();
        int numberOfDigits = iString.length();
        int firstChar = Integer.parseInt(((Character) iString.charAt(0))
                .toString());

        System.out.println("Start iString " + iString);

        if (firstChar == 0) {
            return 0;
        }
        if (numberOfDigits == 1) {
            return (long) oneToNine[i - 1].length();
        }
        if (numberOfDigits == 2) {
            if (iString.startsWith("1") && !iString.endsWith("0")) {
                return (long) elevenToNineteen[Integer
                        .parseInt(((Character) iString.charAt(1)).toString()) - 1]
                        .length();
            } else if (iString.endsWith("0")) {
                return (long) tens[firstChar - 1].length();
            } else {
                return (long) (tens[firstChar - 1].length() + calculateLength(Integer
                        .parseInt(iString.substring(1))));
            }
        }
        if (numberOfDigits == 3) {
            long hundredOnly = (long) (calculateLength(firstChar) + hundred
                    .length());
            if (i % 100 == 0) {
                return hundredOnly;
            }
            return ((long) hundredOnly + and.length() + calculateLength(Integer
                    .parseInt(iString.substring(1))));
        }
        if (numberOfDigits == 4) {
            return (long) (calculateLength(firstChar) + thousand.length() + calculateLength(Integer
                    .parseInt(iString.substring(1))));
        }
        return 0;
    }
}

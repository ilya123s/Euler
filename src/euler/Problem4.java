package euler;

public class Problem4 {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int total = 0, limit = 999, palin = 0;
        ;

        for (int x = 0; x <= limit; x++) {
            for (int y = x + 1; y <= limit; y++) {
                palin = y * x;
                if (isPalindromic(palin) && palin > total) {
                    total = palin;
                    System.out.println("found new max palin " + total);
                }

            }
        }

        System.out.println("total " + total);
        final long end = System.currentTimeMillis() - startTime;
        System.out.println(((end / 1000) / 60) + " minutes " + (end / 1000)
                + " seconds");

    }

    private static boolean isPalindromic(int palin) {

        char[] splitInt = (new Integer(palin)).toString().toCharArray();
        int x = splitInt.length - 1;

        for (int i = 0; i < splitInt.length; i++) {

            if (!(splitInt[i] == splitInt[x])) {
                return false;
            }

            x--;

        }

        return true;
    }

}

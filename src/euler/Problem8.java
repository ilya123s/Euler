package euler;

public class Problem8 {

    private static String string = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

    static char[] string2 = string.toCharArray();

    public static void main(String args[]) {
        final long startTime = System.currentTimeMillis();
        doCalculation();
        final long total = System.currentTimeMillis() - startTime;
        System.out.println(total);
    }

    public static void doCalculation() {

        int x = string2.length;
        int total = 0;
        int y = 0, b = 0;
        int temp = 1;

        for (y = 0; y <= x; y++) {
            temp = 1;
            if (y <= (x - 6)) {
                for (int z = 0; z <= 4; z++) {
                    int now = Character.getNumericValue(string2[y + z]);
                    if (now >= 0) {
                        temp *= Character.getNumericValue(string2[y + z]);
                    }
                }

                if (temp > total) {
                    b = y;
                    total = temp;
                }
            }
        }
        System.out.println("at " + b + " numbers are: " + string2[b]
                + string2[b + 1] + string2[b + 2] + string2[b + 3]
                + string2[b + 4]);
        System.out.println("total is: " + total);
    }
}

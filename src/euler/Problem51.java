package euler;

/**
 * 
 * 
 * 
 * 
 * @author n440479
 *
 */
public class Problem51 {

    private static final int maxPrimeSearchLimit = 99999999;

    private static final char REPLACE = 'R';

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();

        int prime = 1178377, replacementNumberToBeFound = 8;
        // 313087

        boolean found = false;

        while (!found) {
            prime = findNextPrime(prime);
            if (prime == maxPrimeSearchLimit)
                break;
            if (setDigitsToReplace(prime) == replacementNumberToBeFound) {
                found = true;
                System.out.println("Primes found in " + prime + " is: "
                        + replacementNumberToBeFound);
            }

        }

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");

    }

    public static int findNextPrime(int startPrime) {

        // loop from given prime to max limit
        for (int searchPrime = startPrime + 1; searchPrime <= maxPrimeSearchLimit; searchPrime++) {

            // check that number is prime
            if (isPrime(searchPrime)) {
                return searchPrime;
            }

        }
        return maxPrimeSearchLimit;

    }

    /**
     * Checks that int given is either prime or not
     * 
     * @param potentialPrime
     * @return
     */
    private static boolean isPrime(int potentialPrime) {

        if (potentialPrime == 0 || potentialPrime == 1) {
            return false;
        }

        for (int i = 2; i <= potentialPrime - 1; i++) {

            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int setDigitsToReplace(int primeToBeSplit) {

        char[] splitPrime = (new Integer(primeToBeSplit)).toString()
                .toCharArray();
        char[] originalSplitPrime = splitPrime.clone();
        ;
        int primeCount = 0, maxPrimeCountFound = 0;
        int x = 0, y = 0, z = 0, w = 0;

        for (w = 0; w <= splitPrime.length; w++) {
            for (z = 0; z <= splitPrime.length; z++) {
                for (x = 0; x <= splitPrime.length; x++) {
                    for (y = 0; y <= splitPrime.length - 1; y++) {

                        if (w > z || z > x) {
                            break;
                        }

                        splitPrime[y] = REPLACE;
                        if (x != 0) {
                            splitPrime[x - 1] = REPLACE;
                        }
                        if (z != 0) {
                            splitPrime[z - 1] = REPLACE;
                        }
                        if (w != 0) {
                            splitPrime[w - 1] = REPLACE;
                        }

                        primeCount = calculateReplaceDigits(splitPrime);

                        // set the max prime count
                        if (maxPrimeCountFound < primeCount) {
                            maxPrimeCountFound = primeCount;
                            // System.out
                            // .println("  >>>>>>> New Maximum Prime <<<<<<<< "
                            // + maxPrimeCountFound
                            // + " In number " + primeToBeSplit);
                        }

                        primeCount = 0;

                        splitPrime = originalSplitPrime.clone();

                    }
                }
            }
        }

        System.out.println("---------- FOUND " + maxPrimeCountFound
                + " PRIMES IN " + primeToBeSplit + " ---------------");

        return maxPrimeCountFound;

    }

    // check indexes are not the same.
    private static boolean checkDuplicateOverlap(int[] indexes) {

        for (int i = 0; i < indexes.length; i++) {
            for (int x = i + 1; x < indexes.length; x++) {
                if (indexes[i] == indexes[x]) {
                    return false;
                }
            }
        }

        return true;

    }

    /**
     * This method finds all characters that need to be replaced and loops them
     * through 0-9 to check for primes.
     * 
     * @param primeToBeSplit
     * @return
     */
    private static int calculateReplaceDigits(char[] primeToBeSplit) {

        // char[] splitPrime = (new Integer(primeToBeSplit)).toString()
        // .toCharArray();
        char[] originalSplitPrime = primeToBeSplit.clone();
        char newInt;
        String splitPrimeToString;
        Integer newlyFormedInt;
        int primeCount = 0;
        boolean canContinue = true;

        for (int x = 0; x <= 9; x++) {

            newInt = new Integer(x).toString().charAt(0);

            // loop through the array and find and characters to replace
            for (int z = 0; z < primeToBeSplit.length; z++) {
                if (primeToBeSplit[z] == REPLACE) {

                    // this check is to make sure that the first character is
                    // never set to 0
                    if (z == 0 && x == 0) {
                        canContinue = false;
                    } else
                        primeToBeSplit[z] = newInt;
                }
            }

            // This is because there is a 0 at the first char.
            if (!canContinue) {
                continue;
            }

            splitPrimeToString = new String(primeToBeSplit);
            newlyFormedInt = new Integer(splitPrimeToString);

            if (isPrime(newlyFormedInt)) {
                // System.out.println("Prime found in replacement "
                // + new String(originalSplitPrime) + " >>> "
                // + newlyFormedInt);
                primeCount++;
            }

            // set Back to Original
            primeToBeSplit = originalSplitPrime.clone();
        }

        return primeCount;
    }

}

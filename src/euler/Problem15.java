package euler;

public class Problem15 {

    private static int size = 21;

    private static long[][] grid = new long[size][size];

    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();

        calculateMoves();
        printGrid();

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");
        System.out.println("moves: " + grid[size - 1][size - 1]);

    }

    public static void calculateMoves() {
        for (int x = 0; x <= size - 1; x++) {
            for (int y = 0; y <= size - 1; y++) {

                if (x == 0 || y == 0) {
                    grid[x][y] = 1;
                } else {
                    if (grid[x][y] == 0) {
                        grid[x][y] = grid[x - 1][y] + grid[x][y - 1];
                    }

                }
            }

        }
    }

    public static void printGrid() {
        String dash = "-";
        for (int x = 0; x <= size - 1; x++) {
            String line = " | ";
            for (int y = 0; y <= size - 1; y++) {
                line += grid[x][y] + " | ";
                dash += "-";
            }
            System.out.println(line);
            System.out.println(dash);

        }
    }
}

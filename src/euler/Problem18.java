package euler;

import java.util.ArrayList;
import java.util.List;

public class Problem18 {

    private static List<Integer[]> integerList, originalList;

    private static int index;

    public static void main(String args[]) {

        integerList = new ArrayList<Integer[]>();
        originalList = new ArrayList<Integer[]>();
        populate(integerList);
        populate(originalList);

        System.out.println(integerList.size());

        notGreedyAlgorithm();
        displayGrid(originalList);
        displayGrid(integerList);

        System.out.println(integerList.get(0)[0]);
        final long startTime = System.currentTimeMillis();

        final long end = System.currentTimeMillis() - startTime;
        System.out.println(end + " milliseconds");

    }

    private static void populate(List<Integer[]> listToPopulate) {
        listToPopulate.add(new Integer[] { 75 });
        listToPopulate.add(new Integer[] { 95, 64 });
        listToPopulate.add(new Integer[] { 17, 47, 82 });
        listToPopulate.add(new Integer[] { 18, 35, 87, 10 });
        listToPopulate.add(new Integer[] { 20, 04, 82, 47, 65 });
        listToPopulate.add(new Integer[] { 19, 01, 23, 75, 03, 34 });
        listToPopulate.add(new Integer[] { 88, 02, 77, 73, 07, 63, 67, });
        listToPopulate.add(new Integer[] { 99, 65, 04, 28, 6, 16, 70, 92 });
        listToPopulate
                .add(new Integer[] { 41, 41, 26, 56, 83, 40, 80, 70, 33 });
        listToPopulate.add(new Integer[] { 41, 48, 72, 33, 47, 32, 37, 16, 94,
                29 });
        listToPopulate.add(new Integer[] { 53, 71, 44, 65, 25, 43, 91, 52, 97,
                51, 14 });
        listToPopulate.add(new Integer[] { 70, 11, 33, 28, 77, 73, 17, 78, 39,
                68, 17, 57 });
        listToPopulate.add(new Integer[] { 91, 71, 52, 38, 17, 14, 91, 43, 58,
                50, 27, 29, 48 });
        listToPopulate.add(new Integer[] { 63, 66, 04, 68, 89, 53, 67, 30, 73,
                16, 69, 87, 40, 31 });
        listToPopulate.add(new Integer[] { 4, 62, 98, 27, 23, 9, 70, 98, 73,
                93, 38, 53, 60, 04, 23 });
    }

    private static void notGreedyAlgorithm() {

        Integer[] rowToCalculate, previousRow;
        //loop from the bottom up of the pyramid.
        for (int rowIndex = (integerList.size() - 1); rowIndex >= 1; rowIndex--) {

            System.out.println("rowIndex " + rowIndex);

            previousRow = integerList.get(rowIndex);
            rowToCalculate = integerList.get(rowIndex - 1);

            // loop through each number in the row
            for (int columnIndex = 0; columnIndex < rowToCalculate.length; columnIndex++) {

                System.out.println("columnIndex " + columnIndex);

                if (previousRow[columnIndex] > previousRow[columnIndex + 1]) {

                    rowToCalculate[columnIndex] += previousRow[columnIndex];
                } else {
                    rowToCalculate[columnIndex] += previousRow[columnIndex + 1];
                }

                System.out.println("row " + rowIndex + " and value "
                        + rowToCalculate[columnIndex]);
            }

        }

    }

    /**
     * sysos the list you give it
     * 
     * @param listToDisplay
     */
    private static void displayGrid(List<Integer[]> listToDisplay) {

        int sizeOfRow, appendInt;

        for (int rowIndex = 0; rowIndex <= listToDisplay.size() - 1; rowIndex++) {

            StringBuilder rowString = new StringBuilder();
            sizeOfRow = listToDisplay.get(rowIndex).length;
            appendInt = rowIndex;

            while (appendInt < listToDisplay.size()) {
                rowString.append("  ");
                appendInt++;
            }

            for (int columnIndex = 0; columnIndex < sizeOfRow; columnIndex++) {

                rowString.append(listToDisplay.get(rowIndex)[columnIndex]
                        + "  ");
                if (listToDisplay.get(rowIndex)[columnIndex].toString()
                        .length() == 2) {
                    rowString.append(" ");
                } else if (listToDisplay.get(rowIndex)[columnIndex].toString()
                        .length() == 1) {
                    rowString.append("  ");
                }
            }
            System.out.println(rowString.toString());
        }
    }

    //This is the greedy way of doing things :(

    private static void oldWay() {
        Integer value = integerList.get(0)[0];
        Integer total = new Integer(value);

        index = getIndex(0, value);

        System.out.println("Row 0 " + " | Value " + value);
        for (int i = 0; i < integerList.size() - 1; i++) {

            value = identifyNextLargest(i);
            System.out.println("current total " + total);
            total += value;
            System.out.println("Row " + (i + 1) + " | Value " + value);

        }

        System.out.println("Total = " + total);

    }

    private static Integer identifyNextLargest(int row) {

        //int index = getIndex(row, value);
        if (row != integerList.size()) {
            row++;
        }
        Integer[] integer = integerList.get(row);
        Integer largestInt = new Integer(integer[index]);

        if (integer[index + 1] > largestInt) {
            largestInt = integer[index + 1];
            index++;
        }
        return largestInt;
    }

    private static int getIndex(int row, Integer value) {

        Integer[] integer = integerList.get(row);
        for (int i = 0; i <= row; i++) {
            if (integer[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}

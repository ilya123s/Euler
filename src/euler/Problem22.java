package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem22 {

    private static String path = "C:/Users/n440479/workspace/euler/src/euler/resources/p022_names.txt";

    private static ArrayList<String> namesList;

    private static char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z' };

    public static void main(String[] args) throws IOException {

        long total = 0;
        namesList = new ArrayList<String>();
        openFile();
        Collections.sort(namesList);

        for (int i = 0; i < namesList.size(); i++) {
            total += (calculateWorth(namesList.get(i)) * (i + 1));
            System.out.println("NAME " + namesList.get(i) + " " + total);

        }

        System.out.println(total);
    }

    public static void openFile() throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        String line = textReader.readLine();
        line = line.replaceAll("\"", "");
        namesList.addAll(Arrays.asList((line.split(","))));

        fr.close();

    }

    public static long calculateWorth(String s) {

        char[] charArray = s.toCharArray();
        long total = 0;

        for (int i = 0; i < charArray.length; i++) {
            for (int x = 0; x < alphabet.length; x++) {
                if (charArray[i] == alphabet[x]) {
                    total += x + 1;
                }
            }
        }
        return total;

    }
}

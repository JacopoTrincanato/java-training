package read_data_from_file;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {

        // approach 1: Using FileReader
        FileReader fileReader = new FileReader(
                "C:\\Users\\end user\\Desktop\\java-training\\java-training\\org.training.java\\Test.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String myString;

        while ((myString = bufferedReader.readLine()) != null) {
            System.out.println(myString);
        }

        bufferedReader.close();

        // approach 2 = using scanner
        File file = new File("C:\\Users\\end user\\Desktop\\java-training\\java-training\\org.training.java\\Test.txt");

        Scanner scanner = new Scanner(file);

        // loop statement
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // approach 3
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());
        scanner.close();
    }
}

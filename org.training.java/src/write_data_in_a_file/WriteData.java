package write_data_in_a_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(
                "C:\\Users\\end user\\Desktop\\java-training\\java-training\\org.training.java\\Test.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Hello Java");

        System.out.println("hi");

        bufferedWriter.close();
    }
}

package lab6;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;

public class Lab6 {

    public static void main(String[] args) {
        CSVReader csvReader = null;
        try {
            String arg = args.length > 0 ? args[0] : "src/main/java/lab6/file.csv";
            csvReader = new CSVReader(new FileReader(arg));
            for (String[] strings : csvReader.readAll()) {
                System.out.println(Arrays.toString(strings));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (csvReader != null) {
                try {
                    csvReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

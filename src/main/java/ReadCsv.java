
/**
 * Author : AnupamRai
 */


import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class ReadCsv {
    private static final String SAMPLE_CSV_FILE_PATH = "/Users/apple/Documents/QuestionList.csv";

    public  void readme(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            log.info("going good");
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("Country : " + nextRecord[4]);
                System.out.println("Country : " + nextRecord[5]);
                System.out.println("Country : " + nextRecord[6]) ;
                System.out.println("Country : " + nextRecord[7]);
                System.out.println("Country : " + nextRecord[8]);
                System.out.println("Country : " + nextRecord[9]);
                System.out.println("Country : " + nextRecord[10]);
                System.out.println("Country : " + nextRecord[11]);
                System.out.println("==========================");
            }
        }
    }
}


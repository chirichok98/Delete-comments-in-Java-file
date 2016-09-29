import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**000
 * Created by Михаил on 28.09.2016.
 */
public class InputOutput {

    public static String getText(String wayToFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(wayToFile));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine() + "\n");
        }
        return sb.toString();
    }

    public static void setText(String string) throws IOException {
        File outputFile = new File("output.java");
        FileWriter fileWriter = new FileWriter(outputFile);
        StringTokenizer strtok = new StringTokenizer(string, "\n");
        while (strtok.hasMoreTokens()) {
            fileWriter.write(strtok.nextToken() + "\n");
        }
        fileWriter.close();
    }
}

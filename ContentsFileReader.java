import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContentsFileReader {
    
    public static void main (String args[]) {
        readFileContents();
    }

    public static void readFileContents() {
        try {
	    System.out.println("Type the full path of the file you want to read:");
	    Scanner userReadPath = new Scanner(System.in);
	    String inputReadPath = userReadPath.nextLine();

	    BufferedReader in = new BufferedReader(new FileReader(inputReadPath));

	    for (String line = in.readLine(); line != null; line = in.readLine()) {
	        System.out.println(line);
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("FileNotFoundException");
	} catch (IOException e) {
	    System.out.println("IOException");
        }
    }
}

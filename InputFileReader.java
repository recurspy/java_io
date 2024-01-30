import java.nio.file.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFileReader {
    public static void readFile() throws FileNotFoundException, IOException {
    System.out.println("readFile");
    Scanner userPath = new Scanner(System.in);
    String inputPath = userPath.nextLine();

    String line;
    BufferedReader in = new BufferedReader(new FileReader(inputPath));
    line = in.readLine();
    System.out.println(line);
    }
    public static void main (String args[]) {
        System.out.println("main");

    try {
	readFile();
        } catch (FileNotFoundException e) {
	    System.out.println("FileNotFoundException");
        } catch (IOException e) {
	    System.out.println("IOException");
	} 
    }
}

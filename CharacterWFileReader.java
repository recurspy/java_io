import java.nio.file.Files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterWFileReader {

    public static void main (String args[]) {
    try {
            readCharacterContents();
        } catch (IOException ioe) {
	    ioe.printStackTrace();
	}
    }
    
    public static void readCharacterContents() throws IOException  {
        System.out.println("Type the full path of the file you want to read:");
	Scanner userReadPath = new Scanner(System.in);
	String inputReadPath = userReadPath.nextLine();

	FileInputStream fileInputStream = new FileInputStream(inputReadPath);
	InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	BufferedReader in = new BufferedReader(inputStreamReader);

	String line;
	int characterCount = 0;

	while ((line = in.readLine()) != null) {
	    characterCount += line.length();
	}
	System.out.println(characterCount);
    }
}

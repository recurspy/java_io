import java.util.Scanner;
import java.io.IOException;

public class MainReader {

    public static void main (String args[]) throws IOException {
	    System.out.println("type 'read'");
	    Scanner userOption = new Scanner(System.in);
	    String userFinalOption = userOption.nextLine();

	    if (userFinalOption.equals("read")) {
	        ContentsFileReader.readFileContents();
            }
	    if (userFinalOption.equals("read -cw")) {
	        CharacterWFileReader.readCharacterContents();
	    }
    }
}

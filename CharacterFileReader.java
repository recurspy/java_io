import java.io.*;
import java.util.Scanner;

public class CharacterFileReader {
    
    public static void main(String[] args) {
        characterFileReader();
    }

    public static void characterFileReader() {
        try {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Type the full path of the file you want to read:");
	    String userPath = sc.nextLine();
	
	    FileReader fr = new FileReader(userPath);
	    BufferedReader br = new BufferedReader(fr);

	    int count = 0;
	    while (true) {
	        int c = br.read();
		if (c < 0)
		    break;
		if (!Character.isWhitespace(c))
		    count++; // i dont really understand how this loop works but it does ¯\_(ツ)_/¯
	    }
	    br.close();
	    count = count - 1;
	    System.out.println(count);
            } catch (IOException e) {
	        System.out.println("IOException");
	    }
    }
}

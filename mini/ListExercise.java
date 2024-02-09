import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListExercise {

    // sorting integers by least to greatest
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	
        List<Integer> numbers = new ArrayList<>();

	while (sc.hasNextInt()) {
	    numbers.add(sc.nextInt());
	}
	sc.close();

	Collections.sort(numbers);
	System.out.println(numbers);
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListExercise {

    public static void main(String args[]) {
        System.out.println("type 'number [options]'");
	Scanner userInput = new Scanner(System.in);
	String userOption = userInput.nextLine();

        if (userOption.equals("number")) {
	    numberList();
	} else {
	    System.out.println("Goodbye");
	}
    }

    // sorting integers by least to greatest
    public static void numberList() {
        System.out.println("type the numbers you want to sort, then type a non-integer when you're done:");
	Scanner sc = new Scanner(System.in);

	List<Integer> numbers = new ArrayList<>();

	while (sc.hasNextInt()) {
	    numbers.add(sc.nextInt());
	}
	sc.close();

	Collections.sort(numbers);
	System.out.println("Least to greatest: " + numbers);
	Collections.reverse(numbers);
	System.out.println("Greatest to least: " + numbers);
	System.out.println(numbers);
    }
}

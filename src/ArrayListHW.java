import java.util.*;

public class ArrayListHW {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Loop
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Asks the user for 5 numbers
        System.out.println("Please enter 5 numbers.");

        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            int number = scan.nextInt();
            numbers.add(number); // Stores them in an array list
            sum += number;
            product *= number;
        }

        // Finds the sum, product, largest, and smallest of those numbers
        System.out.printf("\nArray: " + numbers + "\n");
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // sort array
        Collections.sort(numbers);

        System.out.println("Largest: " + numbers.get(numbers.size() - 1));
        System.out.printf("Smallest: " + numbers.get(0) + "\n\n");
        
        // close
        scan.close();

    }
}

import java.util.*;

public class ArraysHW {

    // define toPower()
    static void toPower(int size, int power) {
        ArrayList<Double> poweredArray = new ArrayList<Double>();
        
        for (int i = 0; i < size; i++) {
            poweredArray.add(Math.pow(i, power));
            System.out.println(poweredArray.get(i));
        }

    }

    public static void main(String[] args) {

        // input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size:");
        int sizeInput = Integer.parseInt(scan.nextLine());
        System.out.println("Enter power:");
        int powerInput = Integer.parseInt(scan.nextLine());

        // method call
        toPower(sizeInput, powerInput);

        // close scanner
        scan.close();
        }
    }



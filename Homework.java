<<<<<<< Updated upstream
// This code is awesome!
=======
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the array size as an input
        System.out.print ("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        // Creating a random integer array
        int[] array = createRandomArray(arraySize);

        boolean isOver = false;

        while (!isOver) {
            // Displaying the menu
            System.out.println ("Menu Options:");
            System.out.println ("1. Find the minimum and maximum of the array");
            System.out.println ("2. Find the average of the array and the differences from the average");
            System.out.println ("3. Find the sum of elements with odd and even indexes");
            System.out.println ("4. Exit");

            System.out.print ("Choose Operation: ");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println ("The minimum of the array is " + findMin(array));
                System.out.println ("The maximum of the array is " + findMax(array));
            }
            else if (operation == 2) {
                System.out.println ("The average of the array is " + findAverage(array));
                // Diff part here
            }
            else if (operation == 3) {
                System.out.println ("The sum of the elements with odd indexes is " + findOddSum(array));
                System.out.println ("The sum of the elements with even indexes is " + findEvenSum(array));
            }
            else if (operation == 4) {
                isOver = true;
                System.out.println ("Exiting...");
            }
            else {
                System.out.println ("Invalid operation. Please try again.");
            }
        }

        // Closing Scanner
        scanner.close();
    }

    /**
     * This method creates an int array that contains random integers in the range
     * from 0 to given array size.
     * 
     * @param arraySize the given array size
     * @return an int array that contains random integers
     */
    public static int[] createRandomArray(int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(101);
        }
    }

    /**
     * This method finds the average of the array and displays how each element
     * of the array differs from the average. For example, if the array is
     * {2, 6, 9, 3, 5}, and the average is 5, then the differences from the
     * average would be {-3, 1, 4, -2, 0}.
     * 
     * @param arr the array to work on
     * @return the average of the array
     */
    public static double findAverage (double[] arr) {
        double result = 0; // The sum of the array

        for (double element : arr){
            result += element;
        }

        double average = result / arr.length;
        double [] diff = new double[arr.length];

        for (int i = 0; i < arr.length; i++){
            diff[i] = arr[i] - average;
        }

        System.out.println(Arrays.toString(diff));

        return average;
    }
    
}
>>>>>>> Stashed changes

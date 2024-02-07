<<<<<<< Updated upstream
// This code is awesome!
=======
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        double[] numbers = {2, 6, 9, 3, 5};
        System.out.println(findAverage(numbers));
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

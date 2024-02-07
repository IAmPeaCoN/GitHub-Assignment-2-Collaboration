<<<<<<< Updated upstream
// This code is awesome!
=======
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        double[] numbers = {2, 6, 9, 3, 5};
        System.out.println(findAverage(numbers));
    }

    public static double findAverage (double[] arr){
        double result = 0;
        for(double element : arr){
            result += element;
        }
        double average = result / arr.length;
        double [] diff = new double[arr.length];
        for(int i = 0; i < arr.length; i++){
            diff[i] = Math.abs(arr[i] - average);
        }
        System.out.println(Arrays.toString(diff));
        return average;
    }
    
}
>>>>>>> Stashed changes

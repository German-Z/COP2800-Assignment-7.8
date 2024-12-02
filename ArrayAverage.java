import java.util.*;

public class ArrayAverage {
    public static void main(String[] args) {
        //instantiate scanner class input
        Scanner input = new Scanner(System.in);
        // prompt user to enter ten double values
        System.out.println("Please enter ten double values.");
        // array to store user values
        double[] values = new double[10];
        // for loop for user to enter values and then stored into array
        for (int i = 0; i < values.length; i++) {
            // if statements that displays 1st, 2nd, 3rd.. values for input
            if (i == 0) {
                System.out.printf("%dst value: ", i + 1);
            }
            else if (i == 1) {
                System.out.printf("%dnd value: ", i + 1);
            }
            else if (i == 2) {
                System.out.printf("%drd value: ", i + 1);
            }
            else {
                System.out.printf("%dth value: ", i + 1);
            }
            values[i] = input.nextDouble();
        }
        //Display results
        System.out.printf("The average is: %.2f%n", average(values));

        input.close();
    }
    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
    // calculate the average of a double array with overloaded method
    public static double average(double[] array) {
        // store sum of array
        double sum = 0;
        // for loop each element in array that adds i into the sum
        for (double i : array) {
            sum += i;
        }
        // sum / length of array to find the average and return to caller
        return sum / array.length;
    }
}

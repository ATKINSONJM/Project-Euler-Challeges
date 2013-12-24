/**
 * This package contains classes which have the solutions from the tasks set by the forum https://ProjectEuler.net.
 **/
package projecteuler;

/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class SumSquareDifference {

    /**
     * No args constructor which will call the method to complete task 6.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Task 6 - Sum of squares difference.\n" 
                + "The sum of the squares of the first ten natural numbers is,\n" 
                + "\n12 + 22 + ... + 102 = 385\n" 
                + "The square of the sum of the first ten natural numbers is,\n" 
                + "\n(1 + 2 + ... + 10)2 = 552 = 3025\n" 
                + "Hence the difference between the sum of the squares of the "
                + "first ten natural numbers and the square of the sum is 3025 − 385"
                + " = 2640.\n" 
                + "\nFind the difference between the sum of the squares of the "
                + "first one hundred natural numbers and the square of the sum.");
        
        final int total = task6();
        System.out.println("" + total);
    }
    
    /**
     * Method used to complete Task 6 - Sum of squares difference.
     * The sum of the squares of the first ten natural numbers is,
     * 12 + 22 + ... + 102 = 385 
     * The square of the sum of the first ten natural numbers is,
     * (1 + 2 + ... + 10)2 = 552 = 3025 
     * Hence the difference between the sum of the squares of the
     * first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     * 
     * Find the difference between the sum of the squares of the 
     * first one hundred natural numbers and the square of the sum."
     * 
     * @return integer which is the total given after completing the above task.
     */
    public static final int task6() {
        
        final int sumOfSquares = sumOfSquares(100);
        final int squareOfSum = (sumOfNumbers(100) * sumOfNumbers(100));
        return squareOfSum - sumOfSquares;
    }

    /**
     * Recursive method which will calculate the sum of the all the squared numbers 
     * from n down to 1.
     * 
     * @param n value which recursion should start from.
     * @return Integer which is the sum of the squares from n down to 1.
     */
    private static int sumOfSquares(int n) {
        if (n <= 0) {
            return n;
        } else {
            return (n * n + sumOfSquares(n - 1)); 
        }
    }
    
    /**
     * Recursive method which will calculate the sum of the all the numbers from n to 1.
     * 
     * @param n value which recursion should start from.
     * @return Integer which is the sum of the numbers from n to 1.
     */
    private static int sumOfNumbers(int n) {
        if (n <= 0) {
            return n;
        } else {
            return n + sumOfNumbers(n - 1);
        }
    }
}
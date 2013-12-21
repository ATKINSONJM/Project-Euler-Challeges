/**
 * This package contains classes which have the solutions from the tasks set by the forum https://ProjectEuler.net.
 **/
package projecteuler;

/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class MultiplesOf3And5 {

    /**
     * No args constructor which will call the method to complete task 1.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Task 1 - Multiples of 3 and 5.\n" 
                + "If we list all the natural numbers below 10 that are "
                + "multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these"
                + " multiples is 23.\n" 
                + "\n" + "Find the sum of all the multiples of 3 or 5 below 1000.");
        
        final int total = task1();
        System.out.println("" + total);
    }
    
    /**
     * Method used to complete task 1 - Multiples of 3 and 5
     * 
     * If we list all the natural numbers below 10 that are multiples of
     * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     * 
     * @return integer which is the total given after completing the above task.
     */
    public static final int task1() {
        
        int sum = 0;
        
        for (int i = 0; i < 1000; i++) {
            
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }     
        }
        return sum;
    }
    
}

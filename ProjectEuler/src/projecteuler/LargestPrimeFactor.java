/**
 * This package contains classes which have the solutions from the tasks set by the forum https://ProjectEuler.net.
 **/

package projecteuler;


/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class LargestPrimeFactor {
    
    /**
     * constructor which will call the method to complete task 3.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Task 3 - Largest Prime Factor\n"
                + "The prime factors of 13195 are 5, 7, 13 and 29.\n" 
                + "\n What is the largest prime factor of the number:"
                + "600851475143 ?");
        
        /**
         * Number which is being investigated to find its largest prime factor.
         */
        final Long number = 600851475143L;
        
        /**
         * Total which will be returned to user as the answer.
         */
        final Long total = task3(number);
        System.out.println("" + total);

        
    }

    /**
     * Method used to complete Task 3 - Largest Prime Factor.
     * 
     * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
     * factor of the number: 600851475143 ?
     * 
     * @param x = number which is being investigated to find largest prime factor.
     * @return integer which is the total given after completing the above task.
     */
    public static long task3(long x) {   
        
        long a = 2;
        while (x > 1) {
            if ((x % a) == 0) {
                x = x / a;
            } else {
               a++;
            }
        }
        return a;
     }
}



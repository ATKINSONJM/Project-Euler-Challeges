/**
 * This package contains classes which have the solutions from the tasks set by the forum https://ProjectEuler.net.
 **/

package projecteuler;

import static projecteuler.MultiplesOf3And5.task1;

/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class SmallesMultiple {

    /**
     * No args constructor which will call the method to complete task 5.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Task 5 - Smallest Multiple.\n" 
                + "\n2520 is the smallest number that can be divided by each of "
                + "the numbers from 1 to 10 without any remainder.\n" 
                + "What is the smallest positive number that is evenly divisible"
                + " by all of the numbers from 1 to 20\n");
        
        boolean divisibleByAll = false;
        for (int curNum = 2520; !divisibleByAll; curNum++) {
            divisibleByAll = true;
            for (int i = 2; i <= 20; i++) {
                if (curNum % i != 0) {
                    divisibleByAll = false;
                    break;
                }
            }
            if (divisibleByAll) {
                System.out.println("The smallest number is: " + curNum);
            }
        }
    }

}

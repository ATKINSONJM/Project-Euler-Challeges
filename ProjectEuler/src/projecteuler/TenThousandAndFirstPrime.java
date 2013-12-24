/**
 * This package contains classes which have the solutions from the tasks set by
 * the forum https://ProjectEuler.net.
 *
 */
package projecteuler;

/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class TenThousandAndFirstPrime {

    /**
     * No args constructor which will call the method to complete task 7.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        System.out.println("Task 7 - 10,001st Prime\n"
                + "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, "
                + "we can see that the 6th prime is 13."
                + "\nWhat is the 10 001st prime number?");

        final int total = task7(10001);
        System.out.println("" + total);
    }

    /**
     * Method used to complete Task 7 - 10,001st Prime. By listing the first six
     * prime numbers: 2, 3, 5, 7, 11, and 13, we can see # that the 6th prime is
     * 13.
     *
     * What is the 10 001st prime number?
     *
     * @param nthPrime the nth number which we want to know the prime value of.
     * @return integer which is the total given after completing the above task.
     */
    public static final int task7(int nthPrime) {
        int prime = 2;  
        int number = 3;  
        while  (prime < nthPrime) {  
            number += 2;  
            if (isPrime(number)) {
                prime++;
            } 
        }  
        return number;
    }
    
    /**
     *  Method which determines if a number is a prime number or not.
     * 
     * @param n integer which is checked for being prime.
     * @return boolean to confirm if the number is prime or not.
     */
    public static final boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }  
        }
        return true;
    }
    
}

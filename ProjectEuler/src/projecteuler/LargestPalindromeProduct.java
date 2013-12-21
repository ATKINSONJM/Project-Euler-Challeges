/**
 * This package contains classes which have the solutions from the tasks set by the forum https://ProjectEuler.net.
 **/

package projecteuler;

/**
 *
 * @author Jordan Atkinson jordan.atkinson3@gmail.com
 */
public class LargestPalindromeProduct {
    
    /**
     * constructor which will call the method to complete task 4; entry point of the program.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Largest palindrome product\n"
                + "A palindromic number reads the same both ways. The"
                + "largest palindrome made from the product of two 2-digit "
                + "numbers is 9009 = 91 × 99.\n" 
                + "Find the largest palindrome made from the product of two "
                + "3-digit numbers.");
        
        
        final int sum = task4();
        System.out.println("" + sum);
    }

    /**
     * Method used to complete Task 4 - Largest palindrome product.
     * 
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 × 99. 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     * 
     * @return integer which will be the result given after completing the above
     * task.
     */
    public static int task4() {
      int largest = 0;
      for (int i = 999; i >= 100; i--) {
        for (int j = 999; j >= 100; j--) {
            final int product = i * j;
            if ((product > largest) && (validPalindrome(product))) {
                largest = product;
            } 
         }
      } 
      return largest;
   }
    
    /**
     * Method which takes an integer and converts it to a string then checks to see 
     * if it is a palindrome or not.
     * 
     * @param n integer which will be converted then checked.
     * 
     * @return boolean returned depending on if the number is a palindrome.
     */
    public static boolean validPalindrome(int n) {
      final String numberToString = Integer.toString(n);
      final int length = numberToString.length();
      for (int i = 0; i <= (int) length / 2; i++) {
         if (!(numberToString.charAt(i) == numberToString.charAt((length - 1) - i))) {
             return false;
         }
      }
      return true;
   }
}

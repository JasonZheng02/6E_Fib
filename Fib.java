/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if      (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return fib_recurrence(n - 1) +
                   fib_recurrence(n - 2);
        }
    }
     /* These are class methods because the user does not need 
        an instance of the class to run the method
    */
    /* Time complexity:
       Consider the size of the problem to be less than max value of long
       
       As the proxy for the time required, count comparisons
       
       Then cost of the the recurrence algorithm
       grows in a fibonacci sequence starting with 1 2
       as the size of the problem increases,
       because of the recursive case
     */

    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int fib0 = 0;
        int fib1 = 1;
        if      (n == 0) return fib0;
        else if (n == 1) return fib1;
        for (int counter = 2; counter <= n; counter++) {
            if (counter % 2 == 0)
                fib0 = fib0 + fib1;
            else
                fib1 = fib0 + fib1;
        }
        return Math.max(fib0, fib1);
    }
    /* Time complexity:
       Consider the size of the problem to be less than max value of long
       
       As the proxy for the time required, count comparisons
       
       Then cost of the the grade8 algorithm
       grows in a linear way starting at 1 slope 1
       as the size of the problem increases,
       because of the for loop doing one comparison per increase in n
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double root5 = Math.sqrt(5);
        double phi = (Math.pow(((1 + root5) / 2),n) - Math.pow(((1 - root5) / 2),n));
        return phi / root5;
    }
    /* Time complexity:
       Consider the size of the problem to be less than max value of double
       
       As the proxy for the time required, count n exponent???
       
       Then cost of the the binet algorithm
       grows constant
       as the size of the problem increases,
       because just exponent increasing
     */
}

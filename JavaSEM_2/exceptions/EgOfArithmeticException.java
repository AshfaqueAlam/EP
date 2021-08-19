public class EgOfArithmeticException {
    public static void main(String[] args) {
        try {
            // code that generate exception
            System.out.println("Hello1"); // Printed
            int divideByZero = 5 / 0; // Goes to `catch` block
            System.out.println("Hello2"); // So, this will never be printed.
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage()); // Printed
        } finally {
            System.out.println("This is the finally block."); // Always Printed.
        }
        System.out.println("After finally."); // Printed
    }
}



/* OUTPUT:-
*  ------
* Hello1
* `ArithmeticException => / by zero
* `This is the finally block.
* `After finally.
*/
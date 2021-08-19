/* If one exception encountered then further no code will execute. But if `try` or `catch`
used then entire code will run and user defined exception message will be shown.
But, if one exception found in try{} block then further code will no be executed in try{} block
and it goes to catch{} block and then to finally{} block.
*/

public class EgOfArithmeticException {
    public static void main(String[] args) {
        try {
            // code that generate exception
            System.out.println("Hello1"); // Printed
            int divideByZero = 5 / 0; // Goes to `catch` block
            System.out.println("Hello2"); // So, this will never be printed.
        } catch (ArithmeticException e) {    // `e` is the object of ArithmeticException. Using `e` we can use the methods of ArithmeticException like getMessage().
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
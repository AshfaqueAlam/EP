public class ThrowUserGenException {
    public static void divideByZero() {
        throw new ArithmeticException("Try to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}



/* OUTPUT:-
*  ------
* Exception in thread "main" java.lang.ArithmeticException: Try to divide by 0
* at ThrowUserGenException.divideByZero(ThrowUserGenException.java:3)
* at ThrowUserGenException.main(ThrowUserGenException.java:6)
*/
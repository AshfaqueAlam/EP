public class EgOfArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = new int[4];

        // This statement causes an exception.
        int i = arr[30];
        System.out.println(i);

        // The following statement will never execute.
        System.out.println("Hi, I want to execute.");
    }
}

/*
 * OUTPUT:-
 * ------
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for
 * length 4 at EgOfArrayIndexOutOfBoundsException.main(EgOfArrayIndexOutOfBoundsException.java:6)
 */
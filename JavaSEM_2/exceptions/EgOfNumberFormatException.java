public class EgOfNumberFormatException {
    public static void main(String args[]) {
        try {
            String s = "abc";
            int i = Integer.parseInt(s); // NumberFormatException
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }

}


/* OUTPUT :-
*  ------
* Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
* at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
* at java.base/java.lang.Integer.parseInt(Integer.java:660)
* at java.base/java.lang.Integer.parseInt(Integer.java:778)
* at EgOfNumberFormatException.main(EgOfNumberFormatException.java:5)
 */
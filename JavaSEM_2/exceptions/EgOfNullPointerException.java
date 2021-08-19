public class EgOfNullPointerException {
    public static void main(String args[]) {
        String str = null;
        System.out.println(str.length());
        System.out.println("CA");
    }
}

/*
 * OUTPUT :-
 * ------
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because
 * "<local1>" is null at EgOfNullPointerException.main(EgOfNullPointerException.java:4)
 */
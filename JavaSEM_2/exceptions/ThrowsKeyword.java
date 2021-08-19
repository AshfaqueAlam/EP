import java.io.*;

public class ThrowsKeyword {
    public static void findFile() throws IOException {
        // code that may generate IOException.
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// NB:- FileNotFoundException is a subset of IOException. And two ways to forcefully show exception, one with the `throw` keyword and another is with the `throws` keyword.


/* OUTPUT :-
*  ------
* java.io.FileNotFoundException: test.txt (The system cannot find the file
* specified)
*/
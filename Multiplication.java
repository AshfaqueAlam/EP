/* Print this multiplication Table:-
1       2       3       4       5       6       7       8       9
2       4       6       8       10      12      14      16      18
3       6       9       12      15      18      21      24      27
4       8       12      16      20      24      28      32      36
*/

public class Multiplication {
    public static void main(String args[]) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 9; col++) {
                System.out.print(col * row + "\t");
            }
            System.out.println();
        }
    }
}
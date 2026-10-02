import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {

        int[][] a = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 6, 3}
        };

        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
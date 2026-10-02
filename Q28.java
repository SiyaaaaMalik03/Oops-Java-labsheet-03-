import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (a[i][j] == search) {
                    System.out.println("Found at row " + i +
                                       ", column " + j);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }
}
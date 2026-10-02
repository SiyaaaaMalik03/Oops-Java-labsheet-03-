import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];
        int positive = 0, negative = 0;

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();

                    if (a[i][j][k] > 0)
                        positive++;
                    else if (a[i][j][k] < 0)
                        negative++;
                }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        boolean[] visited = new boolean[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < 5; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " occurs " + count + " time(s)");
        }
    }
}
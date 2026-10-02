import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
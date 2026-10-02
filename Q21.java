import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        int first = a[0];

        for (int i = 0; i < 4; i++)
            a[i] = a[i + 1];

        a[4] = first;

        System.out.println("After left rotation:");

        for (int x : a)
            System.out.print(x + " ");
    }
}
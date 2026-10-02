import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] unique = new int[5];
        int count = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = a[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
    }
}
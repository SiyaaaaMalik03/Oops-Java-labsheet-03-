import java.util.Arrays;
import java.util.Scanner;

/*
 * Lab Sheet 3 - Object Oriented Programming Using Java
 
 * Course  : MCA 3rd Semester, College of Smart Computing
 *
 * Topic   : 1-D, 2-D, 3-D and Jagged Arrays
 * Each question is a method of the class LabPrograms3.
 * main() creates an object of LabPrograms3 and calls the methods through a menu.
 */

class LabPrograms3 {

    Scanner sc = new Scanner(System.in);

    // ---------- Helper methods (reused by many questions) ----------

    int[] readArray(int n) {
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    int[] readArrayWithSize() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        return readArray(n);
    }

    int[][] readMatrix(int r, int c, String name) {
        int[][] m = new int[r][c];
        System.out.println("Enter elements of matrix " + name + " (" + r + " x " + c + "):");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        return m;
    }

    int[][] readMatrixWithSize() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        return readMatrix(r, c, "");
    }

    int[][] readSquareMatrix() {
        System.out.print("Enter order of square matrix (n): ");
        int n = sc.nextInt();
        return readMatrix(n, n, "");
    }

    void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + "\t");
            System.out.println();
        }
    }

    int[][][] read3D() {
        int[][][] a = new int[2][2][2];
        System.out.println("Enter 8 elements of the 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();
        return a;
    }

    // ===================== PART A - 1-D ARRAYS =====================

    // 1. Input and display 5 integers
    void q1() {
        int[] arr = readArray(5);
        System.out.print("Array elements: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // 2. Input 10 integers and display in reverse order
    void q2() {
        int[] arr = readArray(10);
        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 3. Sum of all elements
    void q3() {
        int[] arr = readArrayWithSize();
        int sum = 0;
        for (int x : arr)
            sum += x;
        System.out.println("Sum = " + sum);
    }

    // 4. Maximum element
    void q4() {
        int[] arr = readArrayWithSize();
        int max = arr[0];
        for (int x : arr)
            if (x > max)
                max = x;
        System.out.println("Maximum element = " + max);
    }

    // 5. Count even and odd numbers
    void q5() {
        int[] arr = readArrayWithSize();
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers  = " + odd);
    }

    // 6. Copy all elements from one array to another
    void q6() {
        int[] source = readArrayWithSize();
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++)
            copy[i] = source[i];
        System.out.print("Copied array: ");
        for (int x : copy)
            System.out.print(x + " ");
        System.out.println();
    }

    // ===================== PART B - 2-D ARRAYS =====================

    // 7. Input and display a 3 x 3 matrix
    void q7() {
        int[][] m = readMatrix(3, 3, "");
        System.out.println("Matrix:");
        printMatrix(m);
    }

    // 8. Sum of all elements of a matrix
    void q8() {
        int[][] m = readMatrixWithSize();
        int sum = 0;
        for (int[] row : m)
            for (int x : row)
                sum += x;
        System.out.println("Sum of all elements = " + sum);
    }

    // 9. Sum of each row
    void q9() {
        int[][] m = readMatrixWithSize();
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++)
                sum += m[i][j];
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }

    // 10. Sum of each column
    void q10() {
        int[][] m = readMatrixWithSize();
        for (int j = 0; j < m[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < m.length; i++)
                sum += m[i][j];
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }

    // 11. Transpose of a matrix
    void q11() {
        int[][] m = readMatrixWithSize();
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        System.out.println("Transpose:");
        printMatrix(t);
    }

    // 12. Add two matrices of the same size
    void q12() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = readMatrix(r, c, "A");
        int[][] b = readMatrix(r, c, "B");
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];
        System.out.println("A + B:");
        printMatrix(sum);
    }

    // 13. Multiply two 3 x 3 matrices
    void q13() {
        int[][] a = readMatrix(3, 3, "A");
        int[][] b = readMatrix(3, 3, "B");
        int[][] prod = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    prod[i][j] += a[i][k] * b[k][j];
        System.out.println("A x B:");
        printMatrix(prod);
    }

    // ===================== PART C - 3-D ARRAYS =====================

    // 14. Input and display a 2 x 2 x 2 array
    void q14() {
        int[][][] a = read3D();
        System.out.println("3-D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + "\t");
                System.out.println();
            }
        }
    }

    // 15. Sum of all elements of a 3-D array
    void q15() {
        int[][][] a = read3D();
        int sum = 0;
        for (int[][] plane : a)
            for (int[] row : plane)
                for (int x : row)
                    sum += x;
        System.out.println("Sum of all elements = " + sum);
    }

    // 16. Count positive and negative numbers
    void q16() {
        int[][][] a = read3D();
        int pos = 0, neg = 0, zero = 0;
        for (int[][] plane : a)
            for (int[] row : plane)
                for (int x : row) {
                    if (x > 0)
                        pos++;
                    else if (x < 0)
                        neg++;
                    else
                        zero++;
                }
        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Zeros            = " + zero);
    }

    // 17. Maximum element of a 3-D array
    void q17() {
        int[][][] a = read3D();
        int max = a[0][0][0];
        for (int[][] plane : a)
            for (int[] row : plane)
                for (int x : row)
                    if (x > max)
                        max = x;
        System.out.println("Maximum element = " + max);
    }

    // 18. Search an element in a 3-D array and display its position
    void q18() {
        int[][][] a = read3D();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == key) {
                        System.out.println("Found at position [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
        if (!found)
            System.out.println("Element not found");
    }

    // ===================== PART D - JAGGED ARRAYS =====================

    // 19. Jagged array with 3 rows of different lengths
    void q19() {
        int[][] jag = new int[3][];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        System.out.println("Jagged array:");
        for (int[] row : jag) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    // 20. Marks of students with different number of subjects
    void q20() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects of student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.print("Enter " + subjects + " marks: ");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
        System.out.println("\nStudent marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " (" + marks[i].length + " subjects): ");
            for (int m : marks[i])
                System.out.print(m + " ");
            System.out.println();
        }
    }

    // ===================== PART E - ADDITIONAL QUESTIONS =====================

    // 21. Rotate an array to the left by one position
    void q21() {
        int[] arr = readArrayWithSize();
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = first;
        System.out.print("After left rotation: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // 22. Count how many times each element appears
    void q22() {
        int[] arr = readArrayWithSize();
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
    }

    // 23. Second largest element
    void q23() {
        int[] arr = readArrayWithSize();
        int largest = arr[0];
        for (int x : arr)
            if (x > largest)
                largest = x;
        boolean found = false;
        int second = 0;
        for (int x : arr) {
            if (x != largest && (!found || x > second)) {
                second = x;
                found = true;
            }
        }
        if (found)
            System.out.println("Second largest element = " + second);
        else
            System.out.println("No second largest element (all elements are equal).");
    }

    // 24. Remove duplicate elements (without collections)
    void q24() {
        int[] arr = readArrayWithSize();
        int[] unique = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate)
                unique[count++] = arr[i];
        }
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
        System.out.println();
    }

    // 25. Sum of main diagonal and secondary diagonal
    void q25() {
        int[][] m = readSquareMatrix();
        int n = m.length;
        int main = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            main += m[i][i];
            secondary += m[i][n - 1 - i];
        }
        System.out.println("Sum of main diagonal      = " + main);
        System.out.println("Sum of secondary diagonal = " + secondary);
    }

    // 26. Upper and lower triangular parts of a square matrix
    void q26() {
        int[][] m = readSquareMatrix();
        int n = m.length;
        System.out.println("Upper triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((j >= i ? String.valueOf(m[i][j]) : " ") + "\t");
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((j <= i ? String.valueOf(m[i][j]) : " ") + "\t");
            System.out.println();
        }
    }

    // 27. Print only the boundary elements of a matrix
    void q27() {
        int[][] m = readMatrixWithSize();
        int r = m.length, c = m[0].length;
        System.out.println("Boundary elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    System.out.print(m[i][j] + "\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }

    // 28. Search an element in a 2-D array and display row & column
    void q28() {
        int[][] m = readMatrixWithSize();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == key) {
                    System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
        if (!found)
            System.out.println("Element not found");
    }

    // 29. Sort the elements of each row in a jagged array
    void q29() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jag = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        for (int[] row : jag)
            Arrays.sort(row);
        System.out.println("Jagged array after sorting each row:");
        for (int[] row : jag) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    // 30. Check whether a matrix is sparse (more zeros than non-zeros)
    void q30() {
        int[][] m = readMatrixWithSize();
        int zeros = 0, total = 0;
        for (int[] row : m)
            for (int x : row) {
                total++;
                if (x == 0)
                    zeros++;
            }
        int nonZeros = total - zeros;
        System.out.println("Zero elements     = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);
        if (zeros > nonZeros)
            System.out.println("The matrix is a SPARSE matrix");
        else
            System.out.println("The matrix is NOT a sparse matrix");
    }
}

public class Labsheet3 {
    public static void main(String[] args) {
        LabPrograms3 lab = new LabPrograms3(); // object of the class
        Scanner sc = lab.sc;
        int choice;

        do {
            System.out.println("\n============ LAB SHEET 3 - JAVA (OOP) ============");
            System.out.println("PART A - 1-D ARRAYS");
            System.out.println("  1. Input/display 5 ints     2. Reverse order (10 ints)");
            System.out.println("  3. Sum of elements          4. Maximum element");
            System.out.println("  5. Count even/odd           6. Copy array");
            System.out.println("PART B - 2-D ARRAYS");
            System.out.println("  7. 3x3 matrix input/display 8. Sum of matrix");
            System.out.println("  9. Row sums                10. Column sums");
            System.out.println(" 11. Transpose               12. Add two matrices");
            System.out.println(" 13. Multiply 3x3 matrices");
            System.out.println("PART C - 3-D ARRAYS");
            System.out.println(" 14. 2x2x2 input/display     15. Sum of 3-D array");
            System.out.println(" 16. Count positive/negative 17. Maximum of 3-D array");
            System.out.println(" 18. Search in 3-D array");
            System.out.println("PART D - JAGGED ARRAYS");
            System.out.println(" 19. Jagged array (3 rows)   20. Student marks (jagged)");
            System.out.println("PART E - ADDITIONAL");
            System.out.println(" 21. Rotate left by one      22. Frequency of elements");
            System.out.println(" 23. Second largest          24. Remove duplicates");
            System.out.println(" 25. Diagonal sums           26. Upper/lower triangular");
            System.out.println(" 27. Boundary elements       28. Search in 2-D array");
            System.out.println(" 29. Sort rows of jagged     30. Sparse matrix check");
            System.out.println("  0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    lab.q1();
                    break;
                case 2:
                    lab.q2();
                    break;
                case 3:
                    lab.q3();
                    break;
                case 4:
                    lab.q4();
                    break;
                case 5:
                    lab.q5();
                    break;
                case 6:
                    lab.q6();
                    break;
                case 7:
                    lab.q7();
                    break;
                case 8:
                    lab.q8();
                    break;
                case 9:
                    lab.q9();
                    break;
                case 10:
                    lab.q10();
                    break;
                case 11:
                    lab.q11();
                    break;
                case 12:
                    lab.q12();
                    break;
                case 13:
                    lab.q13();
                    break;
                case 14:
                    lab.q14();
                    break;
                case 15:
                    lab.q15();
                    break;
                case 16:
                    lab.q16();
                    break;
                case 17:
                    lab.q17();
                    break;
                case 18:
                    lab.q18();
                    break;
                case 19:
                    lab.q19();
                    break;
                case 20:
                    lab.q20();
                    break;
                case 21:
                    lab.q21();
                    break;
                case 22:
                    lab.q22();
                    break;
                case 23:
                    lab.q23();
                    break;
                case 24:
                    lab.q24();
                    break;
                case 25:
                    lab.q25();
                    break;
                case 26:
                    lab.q26();
                    break;
                case 27:
                    lab.q27();
                    break;
                case 28:
                    lab.q28();
                    break;
                case 29:
                    lab.q29();
                    break;
                case 30:
                    lab.q30();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

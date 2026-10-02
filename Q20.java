public class Q20 {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75, 90},
            {85, 70},
            {88, 92, 76, 81}
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks:");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}
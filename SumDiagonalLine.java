import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = sc.nextInt();

        int[][] array = new int[n][n];

        System.out.print("Enter Element: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Array [" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }

        for (int[] b : array) {
            for (int aa : b) {
                System.out.print(aa + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n; j++){
                if (i==j){
                    total += array[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal Line is: " +total);
    }
}

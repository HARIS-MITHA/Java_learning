import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        System.out.println("Enter 4 elements:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
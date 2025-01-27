
import java.util.Scanner;
public class hnkp {
public class MatrixOperations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rows and columns: ");
int rows = sc.nextInt();
int cols = sc.nextInt();
int[][] matrix1 = new int[rows][cols];
int[][] matrix2 = new int[rows][cols];
int[][] sum = new int[rows][cols];
int[][] product = new int[rows][cols];
System.out.println("Enter elements of the first matrix:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix1[i][j] = sc.nextInt();
}
}
System.out.println("Enter elements of the second matrix:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix2[i][j] = sc.nextInt();
}
}
// Addition and Multiplication
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
sum[i][j] = matrix1[i][j] + matrix2[i][j];
product[i][j] = matrix1[i][j] * matrix2[i][j];
}
}
System.out.println("Sum of matrices:");
for (int[] row : sum) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
System.out.println("Product of matrices:");
for (int[] row : product) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
}
}
    
}

import java.util.Scanner;

public class Matrix {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Nhap so dinh cua do thi: ");
  int n = input.nextInt();
  int[][] matrix = new int[n][n];
  for(int i = 0; i < n; i++) {
   for(int j = 0; j < n; j++) {
    if(i == j) {
     matrix[i][j] = 0;
    } else {
     System.out.print("Nhap trong so (" + i + ", " + j + "): ");
     matrix[i][j] = input.nextInt();
    }
   }
  }
        System.out.println("Ma tran doi xung: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
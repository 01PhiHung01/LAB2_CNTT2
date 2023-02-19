import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
    int n,i, c, bientam;
    Scanner scanner = new Scanner(System.in);
     
    do {
        System.out.println("Nhap vao so phan tu cua mang: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhap cac phan tu cho mang: ");
    for (i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    System.out.println("Nhap so k: ");
    int k = scanner.nextInt();
    for (c = i = 0; i < n; i++) {
        if (A[i] != k) {
            A[c] = A[i];
            c++;
        }
    }
         
    n = c;
    System.out.println("Mang sau khi xoa di phan tu " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
            }
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (A[i] > A[j]) {
                bientam = A[i];
                A[i] = A[j];
                A[j] = bientam;
            }
        }
    }
    System.out.println();
    System.out.println("Mang sap xep theo thu tu tang dan: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
        }
    }
  


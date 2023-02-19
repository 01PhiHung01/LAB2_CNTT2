import java.util.Scanner;
class Tinhgiaithua {
    public static void main(String[] args) {
        System.out.print("Nhap mot so bat ki: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();
        int i =1;
        long GT =1;
        do {
            GT *=i;
            i++;
        }while(i<=n);
        System.out.printf("Ket qua la: " +GT);
    }
}
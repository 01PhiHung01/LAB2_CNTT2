import java.util.Scanner;
class Ktrasochinhphuong {
    public static void main(String[] args) {
        System.out.print("Nhap mot so bat ki: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();
        double squareRoot = Math.sqrt(n);
        if((squareRoot - Math.floor(squareRoot))==0)
        System.out.println(n +" la so chinh phuong");
        else  System.out.println(n+" khong phai la so chinh phuong");
    }
}

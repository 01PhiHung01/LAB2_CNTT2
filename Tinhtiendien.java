import java.util.Scanner;
class Tinhtiendien {
    public static void main(String[] args) {
        float n;
        float tien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien su dung: ");
        n = scanner.nextFloat();
        if (n<50) {
            tien=n*1000;
        }
        else {
            tien=50*1000+(n-50)*1200;
        }
        System.out.println("So tien dien phai tra la: " + tien);
    }
}

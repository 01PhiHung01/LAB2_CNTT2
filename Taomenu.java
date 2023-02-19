import java.util.Scanner;

public class Taomenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+-----------------------------------+");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+-----------------------------------+");
        System.out.println("Hay chon mot trong cac chuc nang 1 2 3 4");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Moi nhap so a:");
                double a = scanner.nextDouble();
                System.out.println("Moi nhap so b:");
                double b = scanner.nextDouble();

                if (a == 0 && b == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else if (a == 0 && b != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                } else {
                    double x =(double) -b / a;
                    System.out.println("Phuong trinh co nghiem la: " + x);
                }
                break;

            case 2:
                double Nghiem;
                System.out.println("Nhap vao so a: ");
                double a2 = scanner.nextDouble();
                System.out.println("NNhap vao so b: ");
                double b2 = scanner.nextDouble();
                System.out.println("Nhap vao so c: ");
                double c = scanner.nextDouble();

                if (a2 == 0) {
                    
                    if (b2==0){
                        if (c==0){
                        System.out.println("Phuong tring co vo so nghiem ");
                        }
                    else {
                        System.out.println("Phuong trinh vo nghiem");
                }
            }
                    else{
                        Nghiem =(double) -c/b2;
                        System.out.println("Nghiem cua phuong trinh la: " + Nghiem + ".");
            }
                    
                  
                    
                    
                    
                } else {
                    double delta = Math.pow(b2, 2) - 4*a2*c;

                    if (delta < 0) {
                        System.out.println("Phuong trinh vo nghiem");
                    } else if (delta == 0) {
                        double x = -b2 / (2 * a2);
                        System.out.println("Phuong trinh co nghiem kep x1=x2: " + x);
                    } else {
                        double x1 = (-b2 + Math.sqrt(delta)) / (2 * a2);
                        double x2 = (-b2 - Math.sqrt(delta)) / (2 * a2);

                        System.out.println("Phuong trinh co hai nghiem phan biet: ");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                }
                break;
            case 3:
                System.out.println("Nhap so dien su dung: ");
                    float n;
                    float tien;
                        n = scanner.nextInt();
                if (n<50) {
                        tien=n*1000;
                }
                else {
                        tien=50*1000+(n-50)*1200;
                }
                System.out.println("So tien dien phai tra la: " + tien);
                break;
            default:
                System.exit(0);
        }

    }
}
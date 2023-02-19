import java.util.Scanner;
import java.text.DecimalFormat;
public class Phuongtrinhbac1 {
    public static void main(String[] args) {
        int a, b;
        double Nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Moi nhap so b: ");
        b = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("Phuong tring co vo so nghiem ");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            Nghiem =(double) -b/a;
            System.out.println("Nghiem cua phuong trinh la: " + Nghiem + ".");
        }
        
    }
    
}
    
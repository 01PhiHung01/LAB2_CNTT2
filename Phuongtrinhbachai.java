import java.util.Scanner;
import java.text.DecimalFormat;
public class Phuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2,Nghiem;
        String KQ ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("Moi nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("Moi nhap so c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4*a*c;
        if (a==0) {
            if (b==0){
                if (c==0){
                   System.out.println("Phuong tring co vo so nghiem ");
            }
                else {
                    System.out.println("Phuong trinh vo nghiem");
            }
        }
            else{
                    Nghiem =(double) -c/b;
                    System.out.println("Nghiem cua phuong trinh la: " + Nghiem + ".");
            }
        } else {
               if (delta < 0) {
                KQ = "Phuong trinh vo nghiem";
                } else if  (delta==0){
                  x1 = x2 = -b/(2*a);
                    System.out.println("Phuong trinh co nghiem kep x1=x2:  "+x1);
                } else {
                     x1 = (-b + Math.sqrt(delta)) / (2*a);
                     x2 = (-b - Math.sqrt(delta)) / (2*a);
                KQ ="Phuong trinh co 2 nghiem x1: " + x1 + " va x2 : " + x2;
        }   
        System.out.println(KQ);
    }
}
}
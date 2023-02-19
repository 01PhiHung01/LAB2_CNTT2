import java.util.Scanner;
public class Xeploaihoctap {
    public static void main(String[] args) {
        double n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap diem cua hoc sinh: ");
        n = scanner.nextDouble();
        if (n<5)
                System.out.println("Hoc sinh dat loai Kem");
        else if (n>=5 && n<7)
                System.out.printf("Hoc sinh dat loai Trung binh");
        else if (n>=7 && n<8)
                System.out.printf("Hoc sinh dat loai Kha");
        else   System.out.printf("Hoc sinh dat loai Gioi");
    }
}
              
import java.util.Scanner;
class Docso3chuso {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n co 3 chu so: ");
        n = scanner.nextInt();
            int  donvi= n % 10;
            n /= 10;
            int chuc = n % 10;
            int tram = n / 10;
            if (tram == 1)
                System.out.println("Mot");
            else if (tram == 2)
                System.out.println("Hai");
            else if (tram == 3)
                System.out.println("Ba");
            else if (tram == 4)
                System.out.println("Bon");
            else if (tram == 5)
                System.out.println("Nam");
            else if (tram == 6)
                System.out.println("Sau");
            else if (tram == 7)
                System.out.println("Bay");
            else if (tram == 8)
                System.out.println("Tam");
            else if (tram == 9)
                System.out.println("Chin");
            System.out.println(" Tram ");
            if (chuc == 2)
                System.out.println("Hai");
            else if (chuc == 3)
                System.out.println("Ba");
            else if (chuc == 4)
                System.out.println("Bon");
            else if (chuc == 5)
                System.out.println("Nam");
            else if (chuc == 6)
                System.out.printf("Sau");
            else if (chuc == 7)
                System.out.println("Bay");
            else if (chuc == 8)
                System.out.println("Tam");
            else if (chuc == 9)
                System.out.println("Chin");
            System.out.println(" Muoi ");
            if (donvi == 1)
                System.out.println("Mot");
            else if (donvi == 2)
                System.out.println("Hai");
            else if (donvi == 3)
                System.out.println("Ba");
            else if (donvi == 4)
                System.out.printf("Bon");
            else if (donvi == 5)
                System.out.println("Lam");
            else if (donvi == 6)
                System.out.println("Sau");
            else if (donvi == 7)
                System.out.printf("Bay");
            else if (donvi == 8)
                System.out.printf("Tam");
            else if (donvi == 9)
                System.out.println("Chin");
}
    }

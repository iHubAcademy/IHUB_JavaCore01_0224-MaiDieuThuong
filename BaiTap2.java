import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so tien USD: ");
        int usd = scanner.nextInt();

        System.out.println( usd  + " USD tuong duong voi " + (usd * 23000) + "VND" );



    }
}

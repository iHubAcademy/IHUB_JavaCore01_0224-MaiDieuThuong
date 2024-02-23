import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap ki tu bat ki: ");

        char ch = scanner.nextLine().charAt(0);
        int asciiCode = ch;
        int asciiValue = (int)ch;
        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}

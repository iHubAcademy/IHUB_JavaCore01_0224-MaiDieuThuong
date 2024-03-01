import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        int[] arr= {6,7,8,9,2};
        System.out.println("Nhap index: ");
        int index = scanner.nextInt();

        if (index >= arr.length) {
            System.out.println("Index khong hop le");
        }
        else  {
            arr[index]=0;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}

public class BaiTap4 {
    public static void main(String[] args) {
        int[] arr={4,6,7,9,10};
        if ( arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4] ) {
            System.out.println("Mang tang dan");
        }
        else if (arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3] && arr[3] > arr[4]) {
            System.out.println("Mang giam dan");
        }
        else {
            System.out.println("Mang binh thuong");
        }
    }
}

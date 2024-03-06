package baiTap;

public class Shape {
    public static String name = " hinh vuong " ;
    public static int area = 9 ;
    public static int count = 0;



    public Shape(String name){
        this.name = name;
        count++;
    }
    public Shape(String name, int area){
        this.name = name ;
        this.area = area ;
        count++;
    }

    public void showInfo() {
        System.out.println("Ten hinh : " + this.name);
        System.out.println("Dien tich : " + this.area);
    }

    public static void main(String[] args) {
        System.out.println("Ten hinh: " + name);
        System.out.println("Dien tich : " + area );
        System.out.println("so hinh duoc tao: " + count);
    }
}


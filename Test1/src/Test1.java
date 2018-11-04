import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean flag=true;
        System.out.println(flag);
        byte a=10;
        a =(byte)(a+1) ;
        System.out.println(a);
        int b=115656147;
        float b1=b;
        System.out.println(b1);         //int值转换为float值，丢失精度
        Scanner input = new Scanner(System.in);
    }
}

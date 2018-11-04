import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        System.out.println("输入天数：");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        System.out.println("周数："+day/7);
        System.out.println("剩余"+day%7+"天");
    }
}

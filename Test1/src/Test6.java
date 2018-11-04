import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        System.out.print("输入成绩：");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println(s >= 60?"及格":"重修");
    }
}

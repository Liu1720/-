import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        int len = arr.length;
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(20);
        }
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (a == arr[i]) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Win");
        else
            System.out.println("Lose");
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class Test5 {
    //选择排序
    public static void main(String[] args) {
        int[] arr = {24,55,30,78,12};
        int len = arr.length;
        for (int i = 0; i <len; i++) {
            int minIndex = i;
            for (int j = i+1; j < len; j++) {
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class Test4 {
    //冒泡排序1
//    public static void main(String[] args) {
//        int[] arr={41,58,24,68,30};
//        int len = arr.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len; j++) {
//                if (arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }System.out.println(Arrays.toString(arr));
//    }
    //2
    public static void main(String[] args) {
        int[] arr={41,58,24,68,30};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

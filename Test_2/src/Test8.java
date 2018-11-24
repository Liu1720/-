import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int[] arr={2,5,22,34,67,89,95};
        int index = Arrays.binarySearch(arr,22);
        System.out.println(index);
    }
}

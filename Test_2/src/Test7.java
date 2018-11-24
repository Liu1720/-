public class Test7 {
    public static void main(String[] args) {
        int[] arr = {3,7,12,34,56,78};
        int index = selection(arr,34);
        System.out.println(index);
    }
    public static int selection(int[] arr,int val){
        int start = 0;
        int end = arr.length;
        do {
            int i = (start + end)/2;
            if(val<arr[i]){
                end = i;
            }else if (val>arr[i]){
                start = i;
            }else
                return i;
        }while (start < end);
        return -1;
    }
}

public class U6_L4_Activity_Two {
    public static void swap(int[] arr, int i, int j) {
        int check = arr[j];
        arr[j] = arr[i];
        arr[i] = check;
    }
    public static void allSwap(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            int check = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = check;
        }
    }
}
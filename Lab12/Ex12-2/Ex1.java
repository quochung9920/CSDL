import java.util.Arrays;

public class Ex1 {
    int numberOfToys(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k - arr[i] >= 0) {
                count++;
                k -= arr[i];
            } else {
                break;
            }
        }
        return count;
    }
}


import java.util.Arrays;

public class Ex3 {
    int maximizeSum(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int result = 0;
        int[] temp = new int[arr.length];
        int index = 0;
        while (left <= right) {
            if (left == right) {
                temp[index++] = arr[left];
            } else {
                temp[index++] = arr[left];
                temp[index++] = arr[right];
            }
            left++;
            right--;
        }
        for (int i = 0; i < temp.length; i++) {
            result += Math.abs(temp[i] - temp[(i + 1) % temp.length]);
        }
        return result;
    }
}

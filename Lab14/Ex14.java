import java.util.Arrays;

public class Ex14 {
    int lDS1(int[] arr) {
        int result = 1;
        int[] count = new int[arr.length];
        Arrays.fill(count,1);
        for (int indexEnd = 0; indexEnd < arr.length; indexEnd++) {
            for (int i = 0; i < indexEnd; i++) {
                if (arr[i] > arr[indexEnd] && count[indexEnd] < count[i] + 1) {
                    count[indexEnd] = count[i] + 1;
                }
            }
            result = Math.max(count[indexEnd], result);
        }
        return result;
    }
}

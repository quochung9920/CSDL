import java.util.Arrays;

public class Ex4 {
    long decorateRoom(int r, int g, int b) {
        int[] lst = new int[] { r, g, b };
        Arrays.sort(lst);
        int max_res = (r + g + b) / 3;
        int a = lst[0];
        int b2 = lst[1];
        if (a + b2 >= max_res) {
            return max_res;
        } else {
            return a + b2;
        }

    }
}

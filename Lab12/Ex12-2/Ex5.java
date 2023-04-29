import java.util.HashMap;
import java.util.Map;

public class Ex5 {
    int numberOfSubArray(int[] arr) {
        int n = arr.length;
        int mx = 0;
        int[][] a = new int[n][n];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            a[i][i] = arr[i];
            m.put(a[i][i], m.getOrDefault(a[i][i], 0) + 1);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                a[i][j] = a[i][j - 1] + arr[j];
                m.put(a[i][j], m.getOrDefault(a[i][j], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> x : m.entrySet()) {
            int cs = -1, dem = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = i; j < n; ++j) {
                    if (a[i][j] == x.getKey()) {
                        if (i > cs) {
                            ++dem;
                            cs = j;
                        } else {
                            cs = Math.min(cs, j);
                        }
                    }
                }
            }
            mx = Math.max(dem, mx);
        }
        return mx;
    }
}

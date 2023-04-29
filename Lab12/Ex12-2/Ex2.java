import java.util.ArrayList;

public class Ex2 {
    public static int mettingRoom(int[] s, int[] f) {
        int i = 0;
        ArrayList<Integer> check = new ArrayList<>();
        int length = s.length;
        while (i < length) {
            int minIndex = 0;
            int minValue = f[0];
            for (int j = 1; j < f.length; j++) {
                if (f[j] < minValue) {
                    minIndex = j;
                    minValue = f[j];
                }
            }
            if (i == 0) {
                check.add(minValue);
            } else {
                if (s[minIndex] >= check.get(check.size() - 1)) {
                    check.add(minValue);
                }
            }
            i++;
            int[] newS = new int[s.length - 1];
            int[] newF = new int[f.length - 1];
            int index = 0;
            for (int j = 0; j < s.length; j++) {
                if (j != minIndex) {
                    newS[index] = s[j];
                    newF[index] = f[j];
                    index++;
                }
            }
            s = newS;
            f = newF;
        }
        return check.size();
    }
}

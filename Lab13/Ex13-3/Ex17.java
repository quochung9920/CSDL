import java.util.ArrayList;
import java.util.List;

public class Ex17 {
    long sumOfOnes(long n, long l, long r) {
        List<Long> listSurplus = new ArrayList<Long>();
        while (n > 1) {
            listSurplus.add(n%2);
            n /= 2;
        }
        listSurplus.add(n);
        long k = listSurplus.size();
        long count0 = 0;
        for (long i = 0; i < k; i++) {
            if (listSurplus.get((int)i) == 0) {
                long indexStart = (long)(Math.pow(2,k) / Math.pow(2,i+1));
                long d = (long) (Math.pow(2,k) / Math.pow(2,i));
                long x = (long)(l - indexStart) / d;
                x = (long)(x * d + indexStart);
                for (long j = x; j <= r; j = j + d) {
                    if (j >= l) {
                        count0++;
                    }
                }
            }
        }
        return (r - l + 1) - count0;
    }
}

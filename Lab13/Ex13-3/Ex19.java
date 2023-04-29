import java.util.Map;
import java.util.TreeMap;

public class Ex19 {
    static long count = 0;

    long countOccurrencePairs(int[] arr) {
        Map<Integer, Long> m = new TreeMap<Integer, Long>();
        for (int x : arr) {
            if (m.containsKey(x))
                m.put(x, m.get(x) + 1);
            else
                m.put(x, (long) 1);
        }
        Map<Integer, Long> m1 = new TreeMap<Integer, Long>(m);
        for (int x : arr) {
            m1.put(x, m1.get(x) - 1);
            long temp = m.get(x) - m1.get(x);
            if (temp < 2)
                continue;
            for (int value : m1.keySet()) {
                if (temp > m1.get(value))
                    count += m1.get(value);
                else
                    count += temp - 1;
            }
            if (m1.get(x) == 0)
                m1.remove(x);
        }
        return count;
    }
}

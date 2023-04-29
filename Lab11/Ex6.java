import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    int digitsProduct(int product) {
        if (product == 0) {
            return 10;
        }
        if (product == 1) {
            return 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 9; i >= 2; i--) {
            while (product % i == 0) {
                res.add(i);
                product /= i;
            }
        }
        if (product > 1) {
            return -1;
        }
        int result = 0;
        for (int i = res.size() - 1; i >= 0; i--) {
            result = result * 10 + res.get(i);
        }
        return result;
    }
}

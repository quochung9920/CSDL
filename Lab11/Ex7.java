public class Ex7 {
    int pagesNumbering(int n) {
        int digits = 1;
        int page = 1;
        int res = 0;
        while (page <= n) {
            int lastPage = page + 9 * (int) Math.pow(10, digits - 1) - 1;
            if (lastPage >= n) {
                res += (n - page + 1) * digits;
                break;
            }
            res += (lastPage - page + 1) * digits;
            page = lastPage + 1;
            digits++;
        }
        return res;
    }
}

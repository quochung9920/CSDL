public class Ex5 {
    int lastDigitDiffZero(int n) {
        int res = 1; 
        int f = 10;
        for(int i = 1; i <= n; i++){
            res *= i;
            if(res % f == 0)
                f *= 10;
            res = res % f;
        }
        while(res % 10 == 0) 
            res = res / 10; 
        return res;
    }
}

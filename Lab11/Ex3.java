public class Ex3 {
    int greatestCommonPrimeDivisor(int a, int b) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                while (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;
                }
            }
        }
        return (gcd > 1) ? gcd : -1;
    }
}

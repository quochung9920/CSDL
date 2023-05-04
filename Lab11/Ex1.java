public class Ex1 {
    // Số nguyên tố là số chỉ chia hết cho 1 và chính nó 
    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
    
        // Chỉ cần kiểm tra đến n/2 là đủ 
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
    
        return true;
    }
}

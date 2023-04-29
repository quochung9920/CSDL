public class Ex4 {
    int maxFraction(int[] numerators, int[] denominators) {
        int maxIndex = 0;
        double maxFraction = (double)numerators[0] / denominators[0];
        for (int i = 1; i < numerators.length; i++) {
            double fraction = (double)numerators[i] / denominators[i];
            if (fraction > maxFraction) {
                maxFraction = fraction;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

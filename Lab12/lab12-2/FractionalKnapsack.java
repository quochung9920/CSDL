// import java.util.Scanner;
// import java.util.Arrays;

// public class FractionalKnapsack {
//     private static double getOptimalValue(int capacity, int[] values, int[] weights) {
//         double value = 0;
//         double[] valuePerWeight = new double[values.length];
//         for (int i = 0; i < values.length; i++) {
//             valuePerWeight[i] = (double) values[i] / weights[i];
//         }
//         int[] indices = new int[values.length];
//         for (int i = 0; i < values.length; i++) {
//             indices[i] = i;
//         }
//         // Sort indices in descending order of value per weight sử dụng bubble sort
//         for (int i = 0; i < indices.length; i++) {
//             for (int j = i + 1; j < indices.length; j++) {
//                 if (valuePerWeight[indices[i]] < valuePerWeight[indices[j]]) {
//                     int temp = indices[i];
//                     indices[i] = indices[j];
//                     indices[j] = temp;
//                 }
//             }
//         }

       
//         for (int i = 0; i < indices.length; i++) {
//             int index = indices[i];
//             if (capacity == 0) {
//                 return value;
//             }
//             int amount = Math.min(capacity, weights[index]);
//             value += amount * valuePerWeight[index];
//             capacity -= amount;
//         }
//         return value;
//     }

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int capacity = scanner.nextInt();
//         int[] values = new int[n];
//         int[] weights = new int[n];
//         for (int i = 0; i < n; i++) {
//             values[i] = scanner.nextInt();
//             weights[i] = scanner.nextInt();
//         }
//         System.out.println(getOptimalValue(capacity, values, weights));
//     }
// }

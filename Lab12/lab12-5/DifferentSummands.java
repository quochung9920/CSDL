// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class DifferentSummands {
//     private static List<Integer> optimalSummands(int n) {
//         List<Integer> summands = new ArrayList<Integer>();
//         int l = 1;
//         while (n > 0) {
//             if (n <= 2 * l) {
//                 summands.add(n);
//                 break;
//             }
//             summands.add(l);
//             n -= l;
//             l++;
//         }
//         return summands;
//     }
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         List<Integer> summands = optimalSummands(n);
//         System.out.println(summands.size());
//         for (Integer summand : summands) {
//             System.out.print(summand + " ");
//         }
//     } 
// }

// import java.util.Scanner;

// public class Change {
//     private static int getChange(int m) {
//         int n1 = 0, n5 = 0, n10 = 0;
//         while (m > 0) {
//             if (m >= 10) {
//                 n10++;
//                 m -= 10;
//             } else if (m >= 5) {
//                 n5++;
//                 m -= 5;
//             } else {
//                 n1++;
//                 m -= 1;
//             }
//         }
//         m = n1 + n5 + n10;
//         return m;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int m = scanner.nextInt();
//         System.out.println(getChange(m));

//     }
// }
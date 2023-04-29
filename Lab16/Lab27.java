import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    
    for (int i = n; i >= 1; i--) {
      list.add(i);
    }
    
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }
    list.remove(n);
    
    ListIterator<Integer> iterator = list.listIterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}

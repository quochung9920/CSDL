import java.util.LinkedList;
import java.util.List;

public class Ex15 {

    static List<Integer> list = new LinkedList<Integer>();

    int lDS2(int[] arr) {
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < list.get(list.size() - 1))
                list.add(arr[i]);
            else if (arr[i] > list.get(0)) {
                list.remove(0);
                list.add(0, arr[i]);
            } else {
                int n = getIndex(arr[i]);
                list.remove(n);
                list.add(n, arr[i]);
            }
        }
        return list.size();
    }

    int getIndex(int value) {
        int index = 0;
        for (int x : list) {
            if (value < x)
                index++;
            else
                return index;
        }
        return index;
    }
}

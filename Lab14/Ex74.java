import java.util.*;

//THUAT TOAN:
//Vi du: 2 3 4 1 2 3 4 5
//dung mang 2 chieu de luu ket qua
//kiem tra neu a[i]<a[i+1] -> luu vao mang 1 -> luc nay ta duoc mang: [[2, 3, 4], ]
//neu khac -> luu vao mang 2 -> lap lai buoc 1. -> luc nay ta duoc mang: [[2, 3, 4], [1, 2, 3, 4, 5]]
//kiem tra xem mang nao dai nhat thi lay.


public class Ex74 {                                                  
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Integer n = cin.nextInt(), tmp;
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {tmp=cin.nextInt(); a.add(tmp);} //Nhap mang
        cin.close();
        if(n<2) {System.out.println(a.get(0)); System.exit(0);} //neu day chi co 1 phan tu

        List<ArrayList<Integer>> b = new ArrayList<>(); //mang 2 chieu de luu ket qua
        List<Integer> flag = new ArrayList<>(); //mang flag de dem size moi phan tu cua mang b
        b.add(new ArrayList<>()); //[[], ]
        Integer k = 0; //bien k la vi tri moi mang trong mang b
        b.get(k).add(a.get(0)); //them phan tu dau tien vao mang: [[1], ] 
        for(int i=1; i<n; i++) {
            if(a.get(i-1)<=a.get(i)) { //neu a[i]<=a[i+1] thi push vao mang b
                if(i==n-1) {flag.add(b.get(k).size()+1);} //neu den phan tu cuoi cung thi push size vao flag
                b.get(k).add(a.get(i)); //push vao mang b: [[1, 2], ]
            } else { //neu a[i]>a[i+1]
                k++; 
                b.add(new ArrayList<>()); //them 1 mang khac vao b [[1, 2], [], ]
                flag.add(b.get(k-1).size()); //push size vao flag
                b.get(k).add(a.get(i)); //push vao mang b: [[1, 2], [1], ]
            }
        }


        List<Integer>flag2 = new ArrayList<>(flag); //tao flag2 de sort len ma ko lam  thay doi flag
        Collections.sort(flag2);

        List<Integer>result = new ArrayList<>(b.get(flag.indexOf(flag2.get(flag2.size()-1))));
        //in ket qua
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

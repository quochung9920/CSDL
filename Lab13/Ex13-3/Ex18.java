public class Ex18 {
    boolean similarStrings(String a, String b) {
        if (a.equals(b))
            return true;
        int x = a.length();
        int y = b.length();
        if (x != y || x % 2 == 1 || y % 2 == 1)
            return false;
        String a1 = a.substring(0, x / 2);
        String a2 = a.substring(x / 2);
        String b1 = b.substring(0, y / 2);
        String b2 = b.substring(y / 2);
        if (similarStrings(a1, b1) && similarStrings(a2, b2))
            return true;
        if (similarStrings(a1, b2) && similarStrings(a2, b1))
            return true;
        return false;
    }
}

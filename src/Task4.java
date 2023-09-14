public class Task4 {
    public static void main(String[] args) {
        int a = -5, b = 5, c = 0;
        if (a == 0 || b == 0) {
            c = 0;
        } else if (b > 0) {
            for (int i = 0; i < b; i++) {
                c += a;
            }
        } else if (b < 0) {
            for (int i = 0; i < -b; i++) {
                c -= a;
            }
        }
        System.out.println(c);
    }
}

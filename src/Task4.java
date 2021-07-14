public class Task4 {
    public static void main(String[] args) {
        int a = -6, b = 2, c = 0;
        if (b > 0) {
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

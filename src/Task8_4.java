public class Task8_4 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("   ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

public class Task8_5 {
    public static void main(String[] args) {
        int n  = 9, a = n / 2, b = n / 2 + 1;
        int numberOfStars = 1;
        for (int i = 0; i < 10; i++) {
            int spaceWidth = a;
            for(int j = 0; j < a + numberOfStars; j++){
                if (spaceWidth > 0) {
                    System.out.print("   ");
                    spaceWidth--;
                } else {
                    System.out.print("*  ");
                }
            }
            a--;
            numberOfStars += 2;
            System.out.println();
        }
    }
}

public class Task8_5 {
    public static void main(String[] args) {
        int n  = 5;
        int numberOfSpaces = n;
        int numberOfStars = 1;
        for (int i = 0; i <= n; i++) {
            int spaceWidth = numberOfSpaces;
            for(int j = 0; j < numberOfSpaces + numberOfStars; j++){
                if (spaceWidth > 0) {
                    System.out.print("   ");
                    spaceWidth--;
                } else {
                    System.out.print("*  ");
                }
            }
            numberOfSpaces--;
            numberOfStars += 2;
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            int spaceWidth = numberOfSpaces + 2;
            for(int j = 0; j < numberOfSpaces + numberOfStars - 2; j++){
                if (spaceWidth > 0) {
                    System.out.print("   ");
                    spaceWidth--;
                } else {
                    System.out.print("*  ");
                }
            }
            numberOfSpaces++;
            numberOfStars -= 2;
            System.out.println();
        }
        /*int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k > i; k--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            for (int t = 0; t < i; t++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("   ");
            }
            for (int j = n - 1; j > i; j--) {
                System.out.print("*  ");
            }
            for (int t = n - 2; t > i; t--) {
                System.out.print("*  ");
            }
            System.out.println();
        }*/
    }
}

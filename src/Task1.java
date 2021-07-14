public class Task1 {
    public static void main(String[] args) {
        double way = 10, full = way;
//        for (int i = 0; i < 7; i++) {
//            full += way;
//            way *= 1.1;
//        }
        for (int i = 0; i < 6; i++) {
            way *= 1.1;
            full += way;
        }
        System.out.println(full);
    }
}
public class Condition {
    public static void main(String[] args) {
        int loop = 0;
        while (loop < 6) {
            System.out.println("Looping:" + loop);
            loop++;
            if (loop == 5) {
                System.out.println("running");
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Thread  d = new Thread(new Elevator(i));
            d.setName("Thread "+i);
            if (i%2==0) d.setPriority(Thread.MAX_PRIORITY);
            else d.setPriority(Thread.MIN_PRIORITY);
            d.start();
        }
    }
}

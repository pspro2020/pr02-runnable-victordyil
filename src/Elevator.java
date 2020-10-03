public class Elevator implements Runnable {
    private final int numb;
    public Elevator(int numb) {
        this.numb = numb;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d ^ %d = %.0f\n",Thread.currentThread().getName(),numb,i,Math.pow(i,numb));
        }

    }
}
public class Thread2 implements Runnable {
    int amount = 0;
    public void run() {
        if (amount <0) {
            
        }
        amount = amount + 500;
    }

    public static void main(String[] args) {
        Thread2 th = new Thread2();
        Thread thread = new Thread(th);
        if(th.amount==0)
        thread.start();
        th.amount=th.amount-60;
        while(thread.isAlive());
        System.out.println("Amount:"+ th.amount);

    }

}

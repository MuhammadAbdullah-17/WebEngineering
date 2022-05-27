
public class Main extends Thread{
    public void run()
    {
        System.out.println("Thread Function...");
    }
    public static void main(String[] args) {
        Main th = new Main();
        th.start();
        while(th.isAlive());
        //System.out.println("Waiting...");
        System.out.println("Running...");
    }
    
}
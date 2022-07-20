package threads_example;

public class runnable1 implements Runnable{
	 
    public static int myCount = 0;
    public runnable1(){
         
    }
    public void run() {
        while(runnable1.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++runnable1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runnable1 mrt = new runnable1();
        Thread t = new Thread(mrt);
        t.start();
        while(runnable1.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++runnable1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

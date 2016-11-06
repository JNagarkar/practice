package src.JavaBasics.MultiThreading;

/**
 * Created by jaydatta on 8/24/16.
 */
public class RunnableDemo implements Runnable {

    private Thread myThread;
    private String threadName;
    private int priority;

    public static int staticVariable;

    public RunnableDemo(String name, int newPriority){
        threadName=name;
        System.out.println("Creating:"+threadName);
        priority=newPriority;
        staticVariable=newPriority;
        System.out.println(staticVariable);
    }

    @Override
    public void run() {
    System.out.println("Running "+threadName);
        for(int i=4; i > 0; i --){
            System.out.println(threadName+":"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(threadName+""+i+" interrupted");
            }
        }
    }

    public void start(){
        if(myThread==null){
            myThread=new Thread(this,threadName);
            myThread.setPriority(priority);
            myThread.start();
        }
    }
}


class Counter{
    int count;
    // if t_1 thread is going on then t_2 thread has to wait
    // defined by keyword 'synchronized'to synchronize threads 
    public synchronized void Increment(){
        count++;
    }
}

public class PRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        
        Counter counter = new Counter();
        // counter.Increment();
        
        Runnable t1 = () ->
        {
            for(int i=0;i<=100;i++)
            {
                counter.Increment();
            }   
        };
        Runnable t2 = () ->
        {
            for(int i=0;i<=100;i++)
            {
                counter.Increment();
            }
        };

        // We used t1 & t2 as object reference in t_1 & t_2
        // So we can use .start() under Thread class
        Thread t_1 = new Thread(t1);
        Thread t_2 = new Thread(t2);

        t_1.start();
        t_2.start();

        // main stack will wait for some time untill other threads join 
        t_1.join();
        t_2.join();

        System.out.println(counter.count);
    }
}


// Need to inherit Thread to run our threads in different different cores
// Main thread will be bypassed and two more threads will start

class test1 extends Thread{
    // Need to use method run, which is a subclass of Thread
    public void run(){
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class test2 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multiple_Threads {
    public static void main(String[] args) {
        test1 t1 = new test1();
        test2 t2 = new test2();

        t1.start();
        // introduced 2 millis gap to start thread
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {e.printStackTrace();}
        t2.start();

        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // try {
        //     t2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}

/*
 *  Here Main thread will transfer the activity in other two threads
 *  But same time when task transfer done, main thread will print "Bye"
 *  Which can make collision inside other two thread
 *  "Bye" is part of main thread, t1.start() and t2.start() each part of individual thread
 *  Total 3 threads at same time  
 */

// Instead of extends Thread we can use implements Runnable
// As Thread constructor implements Runnable
class test1 implements Runnable{
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
class test2 implements Runnable{
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

public class PRunnablevsThread {
    public static void main(String[] args) {
        // Runnable interface can be taken
        // test class can be used
        // As Thread constructor implements Runnable
        Runnable t1 = new test1();
        Runnable t2 = new test2();

        // We used t1 & t2 as object reference in t_1 & t_2
        // So we can use .start() under Thread class
        Thread t_1 = new Thread(t1);
        Thread t_2 = new Thread(t2);

        t_1.start();
        t_2.start();
    }
}



/*
 * We can shorten the code below by using lamda expression.
 * Because Runnable constructor also a @FunctionalInterface 
 */

// public class PRunnablevsThread {
//     public static void main(String[] args) {
//         Runnable t1 = () ->
//         {
//             for(int i=0;i<=100;i++)
//             {
//                 System.out.println("Hi");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }   
//         };
//         Runnable t2 = () ->
//         {
//             for(int i=0;i<=100;i++)
//             {
//                 System.out.println("Hello");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         };

//         // We used t1 & t2 as object reference in t_1 & t_2
//         // So we can use .start() under Thread class
//         Thread t_1 = new Thread(t1);
//         Thread t_2 = new Thread(t2);

//         t_1.start();
//         t_2.start();
//     }
// }


class PrintEven implements Runnable {
    public void run() {
        System.out.println("Even Numbers:");
        try{
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i + " ");
            Thread.sleep(500);
        }
        System.out.println();
    }catch(Exception e){
       System.out.println("Exception "+e); 
    }
    finally{
        System.out.println("Even Thread completed");
    }
    }
}

class PrintOdd implements Runnable {
    public void run() {
        System.out.println("Odd Numbers:");
        try{
        for (int i = 1; i < 100; i += 2) {
            System.out.println("        "+i + " ");
            Thread.sleep(500);
        }
        System.out.println();
    }catch(Exception e){
        System.out.println("Exception "+e);
    }
    finally{
        System.out.println("odd thread completed");
    }
    }
}

public class OddEvenMultithreading {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new PrintEven());
        Thread oddThread = new Thread(new PrintOdd());

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

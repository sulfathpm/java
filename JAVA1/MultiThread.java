import java.util.Random;

// Thread to generate random numbers
class RandomGenerate extends Thread {
    private volatile int n; // Shared data

    public int getNumber() {
        return n; // Safely access the shared number
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            n = random.nextInt(100) + 1;
            System.out.println("Generated number: " + n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Thread to calculate square of the number
class SqrNum extends Thread {
    private final RandomGenerate random;

    public SqrNum(RandomGenerate random) {
        this.random = random;
    }

    @Override
    public void run() {
        while (true) {
            int num = random.getNumber();
            System.out.println("Square of " + num + " = " + (num * num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Thread to calculate cube of the number
class CubeNum extends Thread {
    private final RandomGenerate random;

    public CubeNum(RandomGenerate random) {
        this.random = random;
    }

    @Override
    public void run() {
        while (true) {
            int num = random.getNumber();
            System.out.println("Cube of " + num + " = " + (num * num * num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class to execute threads
public class MultiThread {
    public static void main(String[] args) {
        RandomGenerate rg = new RandomGenerate(); // Generate random numbers
        SqrNum sqrThread = new SqrNum(rg);       // Calculate square
        CubeNum cubeThread = new CubeNum(rg);    // Calculate cube

        rg.start();
        sqrThread.start();
        cubeThread.start();
    }
}

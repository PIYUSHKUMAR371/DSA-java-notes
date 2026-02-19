public class CalculateExecutionTime {

    public static void main(String[] args) throws InterruptedException {
        
        // 1. Capture the exact start time
        long start = System.nanoTime();

        // --------- Program logic goes here ---------
        // We are simulating a task that takes 3 seconds
        Thread.sleep(3000); 
        // -------------------------------------------

        // 2. Subtract start from current time
        // 3. Divide by 1,000,000 to convert Nanoseconds to Milliseconds
        long duration = (System.nanoTime() - start) / 1000000;
        
        System.out.println("Execution Time: " + duration + "ms");
    }
}

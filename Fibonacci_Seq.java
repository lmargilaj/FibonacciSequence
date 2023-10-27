public class Fibonacci_Seq {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please input a positive integer to compute the Fibonacci Sequence:");
        }
            // Valid input result
        try {
            int n = Integer.parseInt(args[0]);
            long result = fibonacci(n);
            System.out.println(result + "is the fibonacci number at that position.");


            // Invalid input result
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please input a valid integer.");
        }
    }
            // Fibonacci Sequence
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0, b = 1, temp;
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    } 
}
public class TestFactorial {
    public static void main(String[] args) {
        // Test Case 1: Factorial of 5 should be 120
        int input1 = 5;
        long expected1 = 120;
        long actual1 = calculateFactorial(input1);
        if (actual1 == expected1) {
            System.out.println("Test Case 1 Passed");
        } else {
            System.out.println("Test Case 1 Failed: expected " + expected1 + ", got " + actual1);
        }

        // Test Case 2: Factorial of 0 should be 1
        int input2 = 0;
        long expected2 = 1;
        long actual2 = calculateFactorial(input2);
        if (actual2 == expected2) {
            System.out.println("Test Case 2 Passed");
        } else {
            System.out.println("Test Case 2 Failed: expected " + expected2 + ", got " + actual2);
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

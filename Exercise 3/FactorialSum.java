public class FactorialSum {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long sumOfFactorials(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        long result = sumOfFactorials(n);
        System.out.println("Sum of the series up to " + n + "! is: " + result);
    }
}

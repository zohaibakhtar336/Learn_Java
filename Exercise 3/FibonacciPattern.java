public class FibonacciPattern {

    public static void main(String[] args) {
        int rows = 4;
        int num1 = 1, num2 = 1; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num1 + " ");
                
                int nextNum = num1 + num2;
                num1 = num2;
                num2 = nextNum;
            }
            System.out.println();
        }
    }
}

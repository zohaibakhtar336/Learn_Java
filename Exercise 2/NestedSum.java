public class NestedSum {
    public static void main(String[] args) {
        int n = 5;
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                totalSum += j;
            }
        }

        System.out.println(totalSum);
    }
}

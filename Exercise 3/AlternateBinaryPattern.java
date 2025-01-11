public class AlternateBinaryPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {  
            int num = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }
}

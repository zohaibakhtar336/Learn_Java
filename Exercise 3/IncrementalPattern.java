public class IncrementalPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
    }
}

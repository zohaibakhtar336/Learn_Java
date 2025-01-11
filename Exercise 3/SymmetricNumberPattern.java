public class SymmetricNumberPattern {

    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                System.out.print("  ");
            }

            for (int j = rows - i + 1; j >= 1; j--) {

                if (i != rows || j != rows - i + 1) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}

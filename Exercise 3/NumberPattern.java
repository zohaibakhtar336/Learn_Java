public class NumberPattern {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

public class NumberPyramidPattern {

    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }

            for (int k = i; k >0 ; k--) {
                System.out.print(k);
            }

            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

public class TwoDArrayAddition {
    public static void main(String args[]) {
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int result[][] = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Resultant array is: ");
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

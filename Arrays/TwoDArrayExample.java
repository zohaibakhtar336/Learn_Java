// A 2D array is an array of arrays, meaning it is an array where each element is another array.
// It is also known as a matrix, where the data is stored in rows and columns.
// The size of a 2D array is represented by two dimensions: the number of rows and the number of columns.
// In Java, a 2D array can be declared and initialized as follows:
// Syntax: type[][] arrayName = new type[rowSize][columnSize];
//
// Example: 
// int[][] matrix = new int[3][3]; // Creates a 3x3 matrix (3 rows, 3 columns)
//
// Elements of a 2D array are accessed using two indices: one for the row and one for the column.
// Syntax: arrayName[rowIndex][columnIndex];
//
// 2D arrays are useful for storing and manipulating data in tabular form such as matrices, grids, etc.

class TwoDArrayExample {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},  // First row
            {4, 5, 6},  // Second row
            {7, 8, 9}   // Third row
        };
        
        // Print the elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < 3; i++) {  // Loop through rows
            for (int j = 0; j < 3; j++) {  // Loop through columns
                System.out.print(matrix[i][j] + " ");  // Access element at row i and column j
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}

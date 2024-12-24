    // **Arrays in Java**:
    // An array is a data structure that stores multiple values of the same type in a single variable.
    // It allows efficient storage and retrieval of data.
    // The array elements are stored in contiguous memory locations.
    // Arrays in Java are of fixed size, meaning their size is determined when they are created and cannot be changed.
    // Array indices in Java are zero-based, meaning the first element of the array has an index of 0.
    
    // **Key Points**:
    // 1. All elements in an array must be of the same data type (homogeneous).
    // 2. Arrays are of fixed size once created.
    // 3. The length of the array can be accessed using the 'length' property.
    // 4. The index of an array starts from 0 and goes up to (length - 1).
    
    // **Types of Arrays in Java**:
    // Arrays can be classified into two main types:
    
    // 1. **Single-Dimensional Array**:
    // A single-dimensional array is a list of elements in a linear sequence.
    // It can be thought of as a collection of variables of the same type, accessed via a single index.
    
    // Syntax:
    // dataType[] arrayName;
    // or
    // dataType arrayName[];

    // Example of Single-Dimensional Array:
    // int[] numbers = {1, 2, 3, 4, 5};
    // Access elements using an index:
    // numbers[0];  // Access the first element

    // 2. **Multi-Dimensional Array**:
    // A multi-dimensional array is an array of arrays. The most common type is a 2D array (matrix).
    // In Java, multi-dimensional arrays can have two or more dimensions.

    // Syntax for 2D array:
    // dataType[][] arrayName;
    // or
    // dataType arrayName[][];

    // Example of Multi-Dimensional Array:
    // int[][] matrix = {
    //     {1, 2, 3},
    //     {4, 5, 6},
    //     {7, 8, 9}
    // };
    // Access elements using two indices:
    // matrix[0][1];  // Access element in the first row, second column

    // You can also create arrays with three or more dimensions.
    // For example, a 3D array:
    // int[][][] cube = new int[3][3][3];

    // **Array Declaration and Initialization**:
    // 1. Declare the array variable:
    // dataType[] arrayName;
    
    // 2. Initialize the array with a specific size:
    // arrayName = new dataType[size];
    
    // Or declare and initialize the array in a single step:
    // dataType[] arrayName = new dataType[size];
    // Example: int[] numbers = new int[5];  // Array of 5 integers

    // Or initialize the array with values:
    // dataType[] arrayName = {value1, value2, value3, ...};
    // Example: int[] numbers = {1, 2, 3, 4, 5};  // Array with 5 elements

    // **Array Access**:
    // You can access an array element by specifying the index in square brackets.
    // Example: int firstNumber = numbers[0];  // Access the first element

    // **Array Indexing**:
    // - Arrays in Java use zero-based indexing, meaning the first element is at index 0.
    // - The last element's index is (length of array - 1).

    // **Important Points**:
    // - Arrays in Java are of fixed size. The size is specified when the array is created.
    // - Once an array is created, its size cannot be changed.
    // - Arrays store elements in contiguous memory locations for efficient access.
    // - An array's length can be accessed using the 'length' property. Example: array.length

    public class ArrayExample {
        public static void main(String[] args) {
            // Declare and initialize an array of integers
            int[] numbers = {1, 2, 3, 4, 5};
    
            // Print the array elements using a for loop
            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
    
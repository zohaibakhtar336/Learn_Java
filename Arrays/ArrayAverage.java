public class ArrayAverage {
    public static void main(String args[]) {
        int arr[] = {11, 22, 33, 44, 55};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of array elements is: " + avg);
    }
}

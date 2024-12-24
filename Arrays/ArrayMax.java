public class ArrayMax{
    public static void main(String args[]){
        int arr [] = {23, 65, 44, 58, 89, 77};
        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: "+ max);
    }
}
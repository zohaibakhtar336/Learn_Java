public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverse(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        return new String(charArray);
    }
}

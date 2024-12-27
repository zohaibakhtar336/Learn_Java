public class CountVowels {
    public static void main(String args[]){
        String str ="Hello, World!";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    public static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}

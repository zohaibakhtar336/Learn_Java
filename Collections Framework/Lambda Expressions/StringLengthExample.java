interface StringLength {
    int length(String str);
}

public class StringLengthExample {
    public static void main(String[] args) {
        StringLength stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.length("Hello"));
    }
}

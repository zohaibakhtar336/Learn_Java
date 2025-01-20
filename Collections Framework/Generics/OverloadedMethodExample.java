public class OverloadedMethodExample {
    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T, U> void print(T data1, U data2) {
        System.out.println(data1 + " " + data2);
    }

    public static void main(String[] args) {
        print("Hello");
        print(1, "Generics");
    }
}

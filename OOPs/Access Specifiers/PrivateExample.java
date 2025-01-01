public class PrivateExample {
    private String password;

    // Setter for private variable
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for private variable
    public String getPassword() {
        return this.password;
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.setPassword("abcde");
        System.out.println("Private Password: " + obj.getPassword()); // Accessing private variable through getter
    }
}

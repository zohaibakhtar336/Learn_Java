class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void displayCollegeName() {
        System.out.println("College Name: " + collegeName);
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        College college = new College("CMR University");
        college.displayCollegeName();
    }
}

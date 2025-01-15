import java.util.*;

public class WebsiteVisitorTracker {
    public static void main(String[] args) {
        LinkedHashSet<String> visitors = new LinkedHashSet<>();
        
        visitors.add("Amit");
        visitors.add("Priya");
        visitors.add("Ravi");
        visitors.add("Amit");  // Duplicate, won't be added
        
        System.out.println("Visitors in order of arrival: " + visitors);
        
        System.out.println("Is Priya a visitor? " + visitors.contains("Priya"));
        
        visitors.remove("Ravi");
        System.out.println("Visitors after removal: " + visitors);
        
        System.out.println("Current visitors in order: ");
        for (String visitor : visitors) {
            System.out.println(visitor);
        }
    }
}

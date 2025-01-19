import java.util.*;

public class MergeListsExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        
        System.out.println("Merged List: " + mergedList);
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class CollectionsAndMathDemoB {
    public static void main(String[] args) {
        System.out.println("\n-- Demonstrating Set Interface --");
        Set<String> uniqueColors = new HashSet<>();
        uniqueColors.add("Red"); 
        uniqueColors.add("Green");
        uniqueColors.add("Blue");
        uniqueColors.add("Red");
        System.out.println("Initial Set: " + uniqueColors);
        uniqueColors.remove("Green");
        System.out.println("Set after removing Green: " + uniqueColors);
        System.out.println("Does set contain Blue? " + uniqueColors.contains("Blue"));
        System.out.println("Size of the set: " + uniqueColors.size());
        System.out.println("Is the set empty? " + uniqueColors.isEmpty()); 
        System.out.print("Iterating over the set: ");
        Iterator<String> iterator = uniqueColors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
}
        System.out.println();
        Set<String> moreColors = new HashSet<>();
        moreColors.add("Yellow");
        moreColors.add("Blue");
        uniqueColors.addAll(moreColors); 
        System.out.println("Set after adding more colors: " + uniqueColors);
        
    }
    
}

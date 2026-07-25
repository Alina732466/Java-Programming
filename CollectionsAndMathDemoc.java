package collectionsandmathdemoc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class CollectionsAndMathDemoc {
    public static void main(String[] args) {
      System.out.println("\n--- Demonstrating Map Interface ---");
      Map<String, Integer> studentScores = new HashMap<>();
      studentScores.put("Alice", 95);
      studentScores.put("Bob", 88);

      studentScores.put("Charlie", 76);
      studentScores.put("Alice", 98); 
      System.out.println("Initial Map: " + studentScores);
      System.out.println("Bob's score: " + studentScores.get("Bob"));
      studentScores.remove("Charlie"); 
      System.out.println("Map after removing Charlie: " + studentScores);
      System.out.println("Does map contain key Bob? " + studentScores.containsKey("Bob")); //
      System.out.println("Does map contain value 98? " + studentScores.containsValue(98)); //
      System.out.println("Keys in the map: " + studentScores.keySet());
      System.out.println("Values in the map: " + studentScores.values());
      System.out.println("Entries in the map: " + studentScores.entrySet()); 
      System.out.println("Size of the map: " + studentScores.size()); 
      studentScores.clear(); 
      System.out.println("Map after clearing: " + studentScores);
    }
    
}

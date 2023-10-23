import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        
        phoneBook.put("Alice", new ArrayList<>(Arrays.asList("111", "112")));
        phoneBook.put("Bob", new ArrayList<>(Arrays.asList("113")));
        phoneBook.put("Charlie", new ArrayList<>(Arrays.asList("114", "115", "116")));

        
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

       
        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.println("Name: " + entry.getKey() + ", Phones: " + entry.getValue());
        }
    }
}

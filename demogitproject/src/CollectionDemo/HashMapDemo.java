package CollectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) 
    {
       // LinkedHashMap<String, Integer> stuMarks = new LinkedHashMap<>();
        TreeMap<String, Integer> stuMarks = new TreeMap<>();

        //HashMap<String, Integer> stuMarks = new HashMap<>();

        stuMarks.put("English", 78);
        stuMarks.put("Math", 88);
        stuMarks.put("Science", 90);
        stuMarks.put("History", 72);
        
        System.out.println(stuMarks);
        System.out.println(stuMarks.get("Math"));
        
        for (Entry<String, Integer> mark : stuMarks.entrySet()) {
            System.out.println(mark.getKey() + ": " + mark.getValue());
        }
        
    }
}
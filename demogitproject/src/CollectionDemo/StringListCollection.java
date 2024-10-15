package CollectionDemo;

import java.util.*;

public class StringListCollection 
{
    public static void main(String[] args) 
    {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana", "Grapes"));
        
        System.out.println("Original List: " + strList);
        Collections.sort(strList);
        System.out.println("Sorted List: " + strList);
        Collections.reverse(strList);
        System.out.println("Reversed List: " + strList);
        Collections.shuffle(strList);
        System.out.println("Shuffled List: " + strList);
        String max = Collections.max(strList);
        System.out.println("Maximum Element: " + max);
        String min = Collections.min(strList);
        System.out.println("Minimum Element: " + min);
        Collections.fill(strList, "Mango");
        System.out.println("Filled List: " + strList);
    }
}

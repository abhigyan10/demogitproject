package CollectionDemo;

import java.util.*;

public class ArrayListCollection 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(33, 7, 10, 59));
        
        System.out.println("Original List: " + intList);
        Collections.sort(intList);
        System.out.println("Sorted List: " + intList);
        Collections.reverse(intList);
        System.out.println("Reversed List: " + intList);
        Collections.shuffle(intList);
        System.out.println("Shuffled List: " + intList);
        int max = Collections.max(intList);
        System.out.println("Maximum Element: " + max);
        int min = Collections.min(intList);
        System.out.println("Minimum Element: " + min);
        Collections.fill(intList, 10);
        System.out.println("Filled List: " + intList);
    }
}

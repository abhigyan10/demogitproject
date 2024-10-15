package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemoLaptop {

    public static void main(String[] args) {

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(101, 8, "Model A", 50000));
        laptops.add(new Laptop(102, 16, "Model B", 70000));
        laptops.add(new Laptop(103, 4, "Model C", 30000));

        // Sort by price using the natural ordering of Laptop objects
        Collections.sort(laptops);
        System.out.println("Sorted by price: " + laptops);

        

        // Fill the ArrayList with new Laptop objects
//        Collections.fill(arrEmp, new Laptop(444, "Kim Smith", 500000));
//        System.out.println(arrEmp);
        
        Comparator<Laptop> cmp = new Comparator<Laptop>() 
        {
            @Override
            public int compare(Laptop o1, Laptop o2) 
            {
                return o1.name.compareTo(o2.name);
            }
        };
        
        Collections.sort(laptops,cmp);
        System.out.println("Sorted by name: " + laptops);

    }
}
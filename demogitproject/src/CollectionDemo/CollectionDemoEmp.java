package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemoEmp {

    public static void main(String[] args) {

        ArrayList<Employee> arrEmp = new ArrayList<>();
        Employee emp1 = new Employee(111, "Stancy", 345677);
        Employee emp2 = new Employee(100, "Jones", 120000);
        Employee emp3 = new Employee(333, "Smith", 2500000);

        arrEmp.add(emp1);
        arrEmp.add(emp2);
        arrEmp.add(emp3);

        Collections.sort(arrEmp);
        for (Employee emp : arrEmp) {
            System.out.println(emp);
        }

        // Find and print maximum and minimum employees
        System.out.println(Collections.max(arrEmp));
        System.out.println(Collections.min(arrEmp));

        // Fill the ArrayList with new Employee objects
//        Collections.fill(arrEmp, new Employee(444, "Kim Smith", 500000));
//        System.out.println(arrEmp);
        
        Comparator<Employee> comp = new Comparator<Employee>() 
        {
            @Override
            public int compare(Employee o1, Employee o2) 
            {
                if (o1.getEmpId() > o2.getEmpId()) 
                {
                    return 1;
                } else 
                {
                    return -1;
                }
            }
        };
    }
}
package CollectionDemo;

import java.util.*;
import java.util.Map.Entry;

public class MapDemoBankDetails 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Customer, Accounts> customerDetails = new LinkedHashMap<>();

        customerDetails.put(new Customer(1111, "Kim Smith"), new Accounts(12345, 10000));
        customerDetails.put(new Customer(2222, "Stancy"), new Accounts(12346, 20000));
        customerDetails.put(new Customer(3333, "Blake"), new Accounts(12347, 30000));
        customerDetails.put(new Customer(4444, "Jones"), new Accounts(12348, 40000));
        customerDetails.put(new Customer(5555, "June"), new Accounts(12340, 50000));

        Set<Entry<Customer, Accounts>> entrySet = customerDetails.entrySet();

        for (Entry<Customer, Accounts> item: entrySet) {
            Customer key = item.getKey();
            Accounts value = item.getValue();
            System.out.println(key.getCustomerName() + "::" + value.getAccountno());
        }
    }
}

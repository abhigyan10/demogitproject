package CollectionDemo;

public class Customer implements Comparable<Customer>
{
    int CustomerId;
    String CustomerName;

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Customer(int customerId, String customerName) 
    {
        super();
        CustomerId = customerId;
        CustomerName = customerName;
    }

	@Override
	public int compareTo(Customer o)
	{
		return Integer.compare(this.CustomerId, o.CustomerId);
	}
}

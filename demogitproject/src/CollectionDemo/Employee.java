package CollectionDemo;

public class Employee implements Comparable<Employee>
{
	int empId;
    String empName;
    double salary;
	
    public Employee(int empId, String empName, double salary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee obj) 
	{
        if (this.getEmpId() > obj.getEmpId()) 
        {
            return 1;
        } else 
        {
            return -1;
        }
    }

    @Override
    public String toString() 
    {
        return "Employee Details are: [Emp ID: " + empId +
                " Emp Name: " + empName +
                " Salary is: " + salary + "]";
    }

}

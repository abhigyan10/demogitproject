package CollectionDemo;

public class Laptop implements Comparable<Laptop>
{

    int modelNum;
    int ramconfig;
    String name;
    long price;

    public Laptop(int modelNum,int ramconfig, String name, long price) {
        this.modelNum = modelNum;
        this.ramconfig = ramconfig;
        this.name = name;
        this.price = price;
    }

    

    public int getRamconfig() {
		return ramconfig;
	}



	public void setRamconfig(int ramconfig) {
		this.ramconfig = ramconfig;
	}



	public int getModelNum() {
		return modelNum;
	}



	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
    public int compareTo(Laptop o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }

	@Override
    public String toString() {
        return "Laptop{" +
                "modelNum=" + modelNum +
                "ramconfig=" + ramconfig +
                ", name= " + name + 
                ", price=" + price 
                ;
    }
}
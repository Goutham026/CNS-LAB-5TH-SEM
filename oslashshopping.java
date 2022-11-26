
public class oslashshopping {

	
	
    
    private String pname;  
    private int qty;  
    private double price;  
    private double totalPrice;  
    
    oslashshopping(String pname,int qty,double price,double totalPrice){
    	this.pname=pname;
    	this.qty=qty;
    	this.price=price;
    	this.totalPrice=totalPrice;
    }
    String getpname()
    {
    	return pname;
    }
    int getqty()
    {
    	return qty;
    }
    double getprice()
    {
    	return price;
    }
    double gettotal()
    {
    	return totalPrice;
    }
    void displayFormat() {
    	System.out.println("..........................................................................................................................");
    	System.out.println("\t itemName \t\t Quantity\t\t\tPrice\t\t\t\t totalPrice");
    	System.out.println("..........................................................................................................................");
    }
    void display() {
    	System.out.println(pname+" "+qty+" "+price+" "+totalPrice);
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

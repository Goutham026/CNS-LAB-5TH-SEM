import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clothing extends Stationary{
	 String productName;  
	    int Quantity;  
	     double price;  
	     double totalPrice; 
	     double Discount=0.0;
	     double overallPrice=0.0;
	     double tax=0.0;
	     char choice='\0';
	     double halfDisc_amount=0.0;
	     double Disc_amount=0.0;
	     double total_amt=0.0;
		Scanner s=new Scanner(System.in);
		
		public Clothing(){
		List<oslashshopping> bill=new ArrayList<oslashshopping>();
do {
			
			System.out.println("Enter the details");
		
		
				System.out.print("productName:");
				
				productName=s.nextLine().toUpperCase();
				
			    System.out.print("Quantity:");
			    
		     	Quantity=s.nextInt();
		     	
		     	if(Quantity>=3)
		     		
			{
				System.out.println("ERROR_QUANTITY_EXCEEDED \n now control will directly get into the Stationary category/Stationary class through stdata() method`");
				
				stdata();
				 System.out.println("\n");
				break;
			}
		     	System.out.println("ADD_ITEM :"+productName+" "+Quantity);
		     	
			System.out.print("price :");
			
			price=s.nextDouble();
			
//			System.out.println("price: "+price);
			totalPrice=Quantity*price;
			
//			System.out.println("totalPrice: "+totalPrice);
			
			if(totalPrice>=999 && totalPrice<=3000) {
				
				System.out.print("Discount :");
				
				Discount = s.nextDouble();
				
				
				Disc_amount=totalPrice*this.Discount/100;
				
				}
				else if(totalPrice>3000) {
					
					this.Discount =s.nextDouble();
					
					 this.halfDisc_amount=this.totalPrice*(this.Discount+5)/100;
					 
                  	this.Disc_amount=this.Disc_amount+this.halfDisc_amount;
                  	
				}
//				
			overallPrice=this.totalPrice-this.Disc_amount;
			this.tax=overallPrice*10/100;
			this.total_amt=this.tax+overallPrice;
			System.out.println("ITEM_ADDED");
			System.out.println("Total Price :"+this.totalPrice);
			System.out.println("Discount :"+this.Discount+"%");
			System.out.println("Total Discount :"+this.Disc_amount);
			System.out.println("overallPrice :"+overallPrice);
			System.out.println("Tax :"+this.tax);
			System.out.println("Total Amount to be Paid :"+this.total_amt);
			
		
				
				bill.add(new oslashshopping(productName,Quantity,price,totalPrice));
				
				System.out.println("still uwant to add item:");
				
				 choice=s.next().charAt(0);
				 
				s.nextLine();
			
			
		}while(choice=='Y'||choice=='y');

		for(oslashshopping o :bill) {
			o.display();
		}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothing c=new Clothing();
//		Stationary st=new Stationary();
	}

}

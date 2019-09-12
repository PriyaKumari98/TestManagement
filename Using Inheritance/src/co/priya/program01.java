package co.priya;

import co.priya.entity.Product;
import co.priya.entity.Television;

public class program01 {
	
  public static void main(String[] args) {
	 
	 
	   
	  Television tv1= new Television();
	  tv1.setId(1);
	  tv1.setName("Optical Mouse");
	  tv1.setPrice(950.0);
	  tv1.setScreenType("LED");
	  tv1.setScreenSize(40);
	  tv1.print();
	  
	  
	
}

}

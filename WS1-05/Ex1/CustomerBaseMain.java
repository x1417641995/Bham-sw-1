/**
 * The class can show the test
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerBaseMain {

	public static void main(String[] args) {
		Customer customerAnne = new Customer("Anne", "5 Bull Ring", "0121 555555");
		Customer customerJohn = new Customer("John", "5 Bull Ring", "0121 555555");
		Customer customerTom = new Customer("Tom", "3 Bull Ring", "0123 775555");
		
		Good good1 = new Good("phone Finder", 1800);
		Good good2 = new Good("iphone X", 45000);
		Good good3 = new Good("S7", 25000);

		ArrayList<Good> goods1 = new ArrayList<Good>(Arrays.asList(good1));
		CustomerWithGoods CustomerWithGoods1 =
				new CustomerWithGoods("Anne", "5 Bull Ring", "0121 555555", goods1);
		ArrayList<Good> goods2 = new ArrayList<Good>(Arrays.asList(good2, good3));
		CustomerWithGoods CustomerWithGoods2 =
				new CustomerWithGoods("John", "4 Bull Ring", "0122 566555", goods2);
		ArrayList<Good> goods3 = new ArrayList<Good>(Arrays.asList(good1,good2,good3));
		CustomerWithGoods CustomerWithGoods3 = 
				new CustomerWithGoods("Tom", "3 Bull Ring", "0123 775555",goods3);
		
		ArrayList<CustomerWithGoods> allCustomers1=new ArrayList<CustomerWithGoods>();
		CustomerBase CustomerBase1=new CustomerBase(allCustomers1);
		
		allCustomers1.add(CustomerWithGoods1);
		allCustomers1.add(CustomerWithGoods2);
		allCustomers1.add(CustomerWithGoods3);
		
		for (int i=0; i<allCustomers1.size(); i++) {
			System.out.println(allCustomers1.get(i));	
		}
		
		
		System.out.println("AAAAAAAAAAAAA");
		System.out.println(CustomerWithGoods1.valueOfGoods());
		System.out.println(CustomerWithGoods1);
		System.out.println(customerAnne.getCustomerName());
		
		System.out.println("AAAAAAAAAAAAA");
		CustomerWithGoods2.buy(good2);
		for (int i=0; i<allCustomers1.size(); i++) {
			System.out.println(allCustomers1.get(i));		
		}
		System.out.println("vip1 "+CustomerBase1.filterLoyal());
		System.out.println("vip2 "+CustomerBase1.filterValued());
	}


}

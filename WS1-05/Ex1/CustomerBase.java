/**
 * The class can show the allCustomers, vip1, vip2
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
import java.util.function.Function;
import java.util.ArrayList;
public class CustomerBase{
	/**
	 *  @param ArrayList<CustomerWithGoods> allCustomers is the allCustomers.
	 *  @param ArrayList<CustomerWithGoods> vip1 is the vip1
	 *  @param ArrayList<CustomerWithGoods> vip2 is the vip1
	 */
	private ArrayList<CustomerWithGoods> allCustomers = new ArrayList<CustomerWithGoods>();
	private ArrayList<CustomerWithGoods> vip1 = new ArrayList<CustomerWithGoods>();
	private ArrayList<CustomerWithGoods> vip2 = new ArrayList<CustomerWithGoods>();
	public CustomerBase(ArrayList<CustomerWithGoods> allCustomers) {
		this.allCustomers = allCustomers;
	}
	/**
	 * add customer to allCustomers
	 * @return allCustomers
	 */
	public void addCustomer(CustomerWithGoods customer) {
		int a = 0;
		for(int i = 0; i < allCustomers.size(); i++) {
			if (customer == allCustomers.get(i)) {
				a++;
			}
		}
		if(a==0) {
			allCustomers.add(customer);
		}		
	}
	/**
	 * add vip1 customer to vip1
	 * @return vip1
	 */
	public ArrayList<CustomerWithGoods> filterLoyal(){
		int b = 0;
		for(int i = 0; i < allCustomers.size(); i++) {
			b = b + allCustomers.get(i).goods.size();
		}
		for(int j = 0; j < allCustomers.size(); j++) {
			if (allCustomers.get(j).goods.size() > b/(allCustomers.size())) {
				vip1.add(allCustomers.get(j));
			}
		}
		return vip1;
	}
	/**
	 * add vip2 customer to vip2
	 * @return vip2
	 */
	public ArrayList<CustomerWithGoods> filterValued(){
		int c = 0;
		for(int i = 0; i < allCustomers.size(); i++) {
			c = c + allCustomers.get(i).valueOfGoods();
		}
		for(int j = 0; j < allCustomers.size(); j++) {
			if (allCustomers.get(j).valueOfGoods() > c/(allCustomers.size())) {
				vip2.add(allCustomers.get(j));
			}
		}
		return vip2;
	}
}
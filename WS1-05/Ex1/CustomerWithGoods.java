/**
 * The class can show the value
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
import java.util.function.Function;
import java.util.ArrayList;
public class CustomerWithGoods extends Customer{
	
	/**
	 *  @param String customerName is the customerName.
	 *  @param String address is the address
	 *  @param String telephoneNumber is the telephoneNumber
	 *  @param ArrayList<Good> goods is the goods
	 */
	ArrayList<Good> goods = new ArrayList<Good>();
	
	public CustomerWithGoods(String customerName, String address,
            String telephoneNumber, ArrayList<Good> goods) {
		super(customerName, address, telephoneNumber);
		this.goods = goods;
		
	}
	/**
	 * add good to goods
	 * @return goods
	 */
	public void buy(Good good) {
		goods.add(good); 
	}
	/**
	 * calculate value
	 * @return value
	 */
	public int valueOfGoods() {
		int value = 0;
		for(int i = 0 ; i < goods.size() ; i++) {
			value = value + goods.get(i).getPrice();
		}
		return value;
	}
	/**
	 * this method says to print
	 * 
	 * @return A String how the object is printed.
	 */
	public String toString() {
		 return "Customer" + " " + super.getCustomerName() + " " + valueOfGoods();
	 }
	
}
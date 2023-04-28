package product;

import java.util.Arrays;

public class Product {
	private String[] list = {"item1","item2","item3","item4"};
	private int price = 1000;
	
	public String[] getList() {
		return list;
	}
	public void setList(String[] list) {
		this.list = list;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getInfo() {
		return this.list[0] + list[1]; 
	}
	@Override
	public String toString() {
		return "Product [list=" + Arrays.toString(list) + ", price=" + price + "]";
	}
	
	
	
}

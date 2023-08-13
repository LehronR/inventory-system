package inventorysystem;

public class Product {
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	

	public static void main(String[] args) {
		Inventory<Product> myInventory = new Inventory<>();
		myInventory.addItem(new Product("computer", 1700.99));
		myInventory.addItem(new Product("Electric bike", 800.47));
		myInventory.addItem(new Product("Monitor", 300.32));
		
		double priceTotal = myInventory.getItems().stream().mapToDouble(product -> product.price).sum();
		
		System.out.println(priceTotal);
		System.out.println(myInventory.totalItems());
	}

}

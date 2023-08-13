package inventorysystem;

import java.util.*;

public class Inventory <T> {
	ArrayList<T> inventory;
	
	public Inventory() {
		inventory = new ArrayList<>();
	}
	
	public ArrayList<T> getItems() {
		return inventory;
	}
	
	public void addItem(T item) {
		inventory.add(item);
	}
	
	public ArrayList<T> removeFromList(T item) {
		inventory.remove(item);
		return inventory;
	}
	
	public int totalItems() {
		return inventory.size();
	}
}

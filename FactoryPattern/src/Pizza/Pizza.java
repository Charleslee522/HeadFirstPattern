package pizza;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Sauce;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams clam;
	List<String> toppings = new ArrayList<String>();

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

package pizza;

@Deprecated
public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
//		dough = "Thin Crust Dough";
//		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for (int i = 0; i < toppings.size(); ++i) {
			System.out.println("    " + toppings.get(i));
		}
	}

}

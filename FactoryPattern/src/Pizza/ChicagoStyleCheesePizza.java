package pizza;

@Deprecated
public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";
		//dough = "Extra Thick Crust Dough";
		//sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

}

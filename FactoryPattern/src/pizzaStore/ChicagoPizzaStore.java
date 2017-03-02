package pizzaStore;

import factory.ChicagoPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {


	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type == "cheese") {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
//		} else if (type == "vegie") {
//			pizza = new NYStyleCheesePizza();
		} else if (type == "clam") {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
//		} else if (type == "pepperonni") {
//			pizza = new NYStyleCheesePizza();
		} else {
			System.out.println(this.getClass().getName() + ": Can't find type " + type);
		}
		return pizza;
	}

}

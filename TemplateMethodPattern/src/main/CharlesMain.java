package main;

import beverage.Coffee;
import beverage.Tea;

public class CharlesMain {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();

		Tea tea = new Tea();
		tea.prepareRecipe();
	}

}

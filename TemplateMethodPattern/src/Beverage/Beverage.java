package beverage;

public abstract class Beverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		add();
	}

	abstract protected void add();

	abstract protected void brew();
	
	public void boilWater() {
		System.out.println("Boiling Water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

}

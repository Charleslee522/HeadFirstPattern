package myclass;

public class EagerInstantiationSingleton {
	private static EagerInstantiationSingleton uniqueInstance = new EagerInstantiationSingleton();

	private EagerInstantiationSingleton() {
	}

	public static EagerInstantiationSingleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
}

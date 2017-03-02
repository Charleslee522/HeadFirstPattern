package myclass;

public class DoubleCheckedLockingSingleton {
	private static DoubleCheckedLockingSingleton uniqueInstance;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}

	// other useful methods here
}

package SINGLETON;

public class Management {
	private int count = 0;
	private static Management instance = null;
	
	private Management() {
		System.out.println("Create Managerment");
		instance = new Management();
	}
	
	public static Management getInstance() {
		if(instance == null) {
			instance = new Management();
		}
		return instance;
	}
	

	public int getCount() {
		return count;
	}

	public void add(int count) {
		this.count += count;
	}
}

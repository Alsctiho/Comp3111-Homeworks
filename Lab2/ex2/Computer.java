package Lab2.ex2;

public class Computer implements Chargeable {
	protected String secret;
	
	public Computer() {
		this.secret = "computer secret";
	}
	
	public void work() {
		System.out.println("A computer is working");
	}

	@Override
	public void charge() {
		System.out.println("Charge this computer");
	}
}

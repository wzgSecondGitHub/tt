package c05.dessert;

public class Cookie {
	public Cookie() {
		System.out.println("Cookie constructor");
	}

	protected void foo() {
		System.out.println("foo");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

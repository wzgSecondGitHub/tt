import java.util.Vector;

class Cat {
	private int catNumber;

	Cat(int i) {
		catNumber = i;
	}

	void print() {
		System.out.println("Cat #" + catNumber);
	}
}

class Dog {
	private int dogNumber;

	Dog(int i) {
		dogNumber = i;
	}

	void print() {
		System.out.println("Dog #" + dogNumber);
	}
}

public class CatsAndDogs {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0; i<7; i++) {
			v.addElement(new Cat(i));
		}
		v.addElement(new Dog(0));
		for(int j=0; j<v.size(); j++) {
			Cat c = (Cat)v.elementAt(j);
			c.print();
		}
	}
}

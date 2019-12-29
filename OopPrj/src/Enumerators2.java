import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

class Hamster{
	
}
public class Enumerators2 {

	private static void printData(Enumeration e) {
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) {
		Vector v = new Vector();
		Hashtable h = new Hashtable();
		for(int i=0; i<10; i++) {
			v.add(new MouseTrap());
		}
		for(int i=0; i<10; i++) {
			h.put(new Integer(i), new Hamster());
		}
		printData(v.elements());
		printData(h.elements());
	}
}

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class Stacks {
	static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	public static void main(String[] args) {
		Stack stk = new Stack();
		for (int i = 0; i < months.length; i++)
			stk.push(months[i] + " ");
		System.out.println("stk = " + stk);
		// Treating a stack as a Vector:
		stk.addElement("The last line");
		System.out.println("element 5 = " + stk.elementAt(5));
		System.out.println("popping elements:");
		
		System.out.println(stk.pop());
		
	}
}

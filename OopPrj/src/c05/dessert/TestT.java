package c05.dessert;

import java.util.ArrayList;
import java.util.List;

/**
 * ≤‚ ‘∑∫–Õ
 */
public class TestT<T> {

	public static void main(String[] args) throws Exception{
		//==============≤‚ ‘∑∫–Õ1================
		List<String> ls = new ArrayList<String>();
		List<Integer> lt = new ArrayList<Integer>();
//		System.out.println(ls.getClass());
//		System.out.println(lt.getClass());
//		System.out.println(ls.getClass()==lt.getClass());
		//==============≤‚ ‘∑∫–Õ2================
		List<Integer> lInteger = new ArrayList<Integer>();
		lInteger.add(1);
		lInteger.getClass().getMethod("add", Object.class).invoke(lInteger, "hello");
		for(int i=0; i< lInteger.size(); i++) {
			System.out.println(lInteger.get(i));
		}
	
		
	}
}

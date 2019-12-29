package c05.dessert.another;

public class TestFinally {

	public static void main(String[] args) {
//		try {
//			JabberServer j = new JabberServer(1);
//		} finally {
//			System.out.println("1");
//		}
		int i = 2/9;
		try {
			int j = 2/0;
		} catch (Exception e) {
			System.out.println("catch");
		}finally {
			System.out.println("1");
		}
	}
}

package c05.dessert;

import java.net.InetAddress;

public class WhoAmI {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("Usage: WhoAmI MachineName");
			System.exit(1);//“Ï≥£÷’÷π
		}
		InetAddress a = InetAddress.getByName(null);
		System.out.println(a);
	}
}

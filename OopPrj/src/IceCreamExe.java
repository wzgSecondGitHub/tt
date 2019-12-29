public class IceCreamExe {

	static String[] flav = { "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
			"Praline Cream", "Mud Pie" };
	public static String[] flavSet(int n) {
		String[] result = new String[n];
		int[] picks = new int[n];
		for(int i=0; i<picks.length; i++) {
			picks[i]=-1;
		}
		for(int i=0; i<picks.length; i++) {
			a:while(true) {
				int t = (int)(Math.random()*n);
				for(int j=0; j<i; j++) {
					if(picks[j]==t) {
						continue a;
					}
				}
				picks[i]=t;
				result[i] = flav[t];
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			System.out.println("flavSet("+i+")=");
			int len = flav.length;
			String[] results = flavSet(len);
			for(int j=0; j<results.length; j++) {
				System.out.println(results[j]);
			}
		}
	}
}

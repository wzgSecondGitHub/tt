import java.util.HashMap;

class NumOfAppear{
	int num=1;
	@Override
	public String toString() {
		return Integer.toString(num);
	}
}
public class StatisticsExe {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		for(int i=0; i<10000; i++) {
			int num = (int)(Math.random()*20);
			if(h.containsKey(num)) {
				((NumOfAppear)h.get(num)).num++;
			}else {
				h.put(num, new NumOfAppear());
			}
		}
		System.out.println(h);
	}
}

import java.util.Hashtable;
import java.util.Properties;

class ObjKey{
	int i;
	public ObjKey(int j) {
		this.i=j;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof ObjKey) {
//			ObjKey ok = (ObjKey)obj;
//			return ok.i == this.i;
//		}
//		return false;
		return (obj instanceof ObjKey) && (((ObjKey)obj).i==this.i);
	}
	
}
class ObjVal{
	boolean shdow = Math.random()>0.5;
	@Override
	public String toString() {
		String str;
		if(shdow) {
			str = "Six more weeks of Winter!";
		}else {
			str = "Early Spring!";
		}
		return str;
	}
}
public class SpringDetector {

	public static void main(String[] args) {
		Hashtable<ObjKey, ObjVal> h = new Hashtable<ObjKey, ObjVal>();
		for(int i=0; i<10; i++) {
			h.put(new ObjKey(i), new ObjVal());
		}
		h.put(new ObjKey(11), new ObjVal());
		System.out.println(h);
		ObjKey k = new ObjKey(3);
		if(h.containsKey(k)) {
			System.out.println(h.get(k));
		}
		Properties p = System.getProperties();
		p.list(System.out);
	}
}

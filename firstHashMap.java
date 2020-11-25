package firstquestionJava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class fortttttest {

	public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>() {{
		put(1,"사과");
		put(2,"포도");
		put(3,"바나나");
	}};
	//entrySet().iterator()
	Iterator<Entry<Integer,String>> entries = map.entrySet().iterator();
	while(entries.hasNext()) {
		Entry<Integer,String> entry = entries.next();
		System.out.println("[key]"+entry.getKey()+"[value]"+entry.getValue());
	}
	//keySet().Iterator()
	Iterator<Integer> keys = map.keySet().iterator();
	while(keys.hasNext()) {
		int key = keys.next();
		System.out.println("[key]:"+key+ " [value]: "+map.get(key));
	}
	}
}

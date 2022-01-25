import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("neeraj");
		list.add("dsj");
		list.add("bshdj");
		list.add("sdbvj");
		list.add("kjsd");
		for (String s : list) {
			if (s.startsWith("n")) {
				System.out.println(s);
			}
		}
		
		
		list.stream().filter((t)->t.startsWith("n")).forEach(t-> System.out.println(t));
		System.out.println("=======================");
		
		for (String s : list) {
			System.out.println(s);
		}

		list.stream().forEach((t) -> System.out.println(t));

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "sndv");
		map.put(2, "isdhi");
		map.put(3, "osdhi");

		
		map.forEach((key, value) -> System.out.println(key + " " + value));
		map.entrySet().stream().forEach(ibj -> System.out.println(ibj));
		System.out.println("===============================");
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(ibj->System.out.println(ibj));

	}

}

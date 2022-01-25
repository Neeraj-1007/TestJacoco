import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
//		Consumer<Integer> con = (t) ->System.out.println(t + "  accept method");
//		con.accept(100);
		
		
		List<Integer> list1=Arrays.asList(1,2,3,5,4,6,7,3);
		
	

		list1.stream().forEach( (t) ->System.out.println(t + "  accept method"));
	}
}

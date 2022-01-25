import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {


	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("1","3","4","2","5","43");
		
		System.out.println(list1.stream().findAny().orElseGet(()->  "Hi Its me ."));
		
	}

}

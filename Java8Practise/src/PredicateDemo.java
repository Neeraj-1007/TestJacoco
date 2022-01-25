import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,4,3,5,6,4);
		
		list1.stream().filter((t) -> t % 2 == 0).forEach(t -> System.out.println("print even "+t));
//filter implemn=ents predicate interface mwhich is a functional inetrface
//		forEACH implements consumer interface which
	}
}

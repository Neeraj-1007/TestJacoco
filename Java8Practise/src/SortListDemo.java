import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import EmployeeRecord.DataBase;
import EmployeeRecord.Employee;

public class SortListDemo {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(5);
		
		
		List<Employee> employee=DataBase.getEmployee();
		Collections.sort(employee,(o1,o2) -> (int) o2.getSalary()-(o1.getSalary()));
		System.out.println(employee);
		
		DataBase.getEmployee().stream().sorted((o1,o2) -> (int) o2.getSalary()-(o1.getSalary())).forEach(System.out::println);
		
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		
//		
//		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
//		
		
		
		
	}

}

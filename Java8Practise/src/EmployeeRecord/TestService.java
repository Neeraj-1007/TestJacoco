package EmployeeRecord;

import java.util.List;
import java.util.stream.Collectors;

public class TestService {

	public static List<Employee> evaluateTaxUser(String input) {

//		if(input.equalsIgnoreCase("tax")) {
//	return	DataBase.getEmployee().stream().filter(emp->emp.getSalary()>5000).collect(Collectors.toList());
//		}else {
//			return	DataBase.getEmployee().stream().filter(emp->emp.getSalary()<5000).collect(Collectors.toList());
//		}

		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmployee().stream().filter(emp -> emp.getSalary() > 5000).collect(Collectors.toList())
				: DataBase.getEmployee().stream().filter(emp -> emp.getSalary() < 5000).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUser("no tax"));
	}

}

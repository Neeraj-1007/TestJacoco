package EmployeeRecord;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployee(){
	List<Employee> list=new ArrayList<Employee>();
	
	list.add(new Employee(1,"sh","hj",9000));
	list.add(new Employee(1,"sh","hj",3000));
	list.add(new Employee(1,"sh","hj",8000));
	list.add(new Employee(1,"sh","hj",90000));
	list.add(new Employee(1,"sh","hj",34000));
	list.add(new Employee(1,"sh","hj",7000));
	return list;
	
	}
}

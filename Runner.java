package SqlAssignment;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class Runner {
Runner(){
		loaddata();
	}
	List<Employee> employee=new ArrayList<>();
    List<User> users=new ArrayList<>();
    public void loaddata() {
	employee.add(new Employee(1,"Suresh","Hyderabad","HR","Team A"));
	employee.add(new Employee(2,"Raju","Delhi","IT","Team B"));
	employee.add(new Employee(3,"SaiBabu","Delhi","finance","Team C"));
	employee.add(new Employee(4,"Chandu","Mumbai","HR","Team A"));
	employee.add(new Employee(5,"Ramesh","Mumabai","finance","Team D"));
	employee.add(new Employee(6,"Ramphani","Delhi","HR","Team A"));
	employee.add(new Employee(7,"Mani","Hyderabad","HR","Team B"));
	employee.add(new Employee(8,"Rakesh","Pune","HR","Team C"));
	employee.add(new Employee(9,"Rajesh","Pune","finance","Team D"));
	employee.add(new Employee(10,"Malli","Hyderabad","IT","Team A"));
	employee.add(new Employee(11,"Ravi","Mumbai","IT","Team A"));
	employee.add(new Employee(12,"Kiran","Delhi","HR","Team B"));
	employee.add(new Employee(13,"Hithish","Hyderabad","IT","Team A"));
	employee.add(new Employee(14,"Naga","Pune","finance","Team C"));
	employee.add(new Employee(15,"Mathi","Hyderabad","HR","Team A"));
	employee.add(new Employee(16,"Teja","Pune","Finance","Team A"));
	employee.add(new Employee(17,"Phani","Hyderabad","IT","Team A"));
	
	User user1=new User(1,"John",null,"IT",null);
	User user2=new User(2,"Tom","Delhi",null,"Team C");
	User user3=new User(3,"Adam","Pune","finance",null);
    User user4=new User(4,"Lina","Mumbai","HR",null);
	users.add(user1);
	users.add(user2);
	users.add(user3);
   	users.add(user4);
    }

public List<Employee> getByUserid(int n) {
	 Stream<Employee> str=employee.stream();
List<Employee> list=new ArrayList<>();
if(n==1) {
	  List<Employee> list1=employee.stream().filter(i->i.getDepartment().equalsIgnoreCase("IT")).collect(Collectors.toList());
return list1;
}
else if(n==2) {
	List<Employee> list2=employee.stream().filter(i->(i.getTeam().equalsIgnoreCase("Team C") && i.getOffice().equalsIgnoreCase("delhi"))).collect(Collectors.toList());
	return list2;
}
else if(n==3)
{
	
	List<Employee> list3=employee.stream().filter(i->(i.getDepartment().equalsIgnoreCase("Finance") && i.getOffice().equalsIgnoreCase("Pune"))).collect(Collectors.toList());
	return list3;
	
}
else if(n==4) {
	
	List<Employee> list4=employee.stream().filter(i->(i.getDepartment().equalsIgnoreCase("HR") && i.getOffice().equalsIgnoreCase("mumbai"))).collect(Collectors.toList());
	return list4;
	
}
else {
	System.out.println("invalid user input");
}
return list;
    }
}
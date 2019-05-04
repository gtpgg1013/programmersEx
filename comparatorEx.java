package programmers;

import java.math.BigInteger;
import java.util.*;


class Employee{
	int num;
	String name;
	String dept;
	String work;
	BigInteger salaly;
	public Employee(int num, String name, String dept, String work, BigInteger salaly) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.work = work;
		this.salaly = salaly;
	}
	
}

public class comparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, "jdk", "솔루션개발1", "연구원", new BigInteger("2800"));
        Employee employee2 = new Employee(2, "jeong", "솔루션개발1", "선임연구원", new BigInteger("3200"));
        Employee employee3 = new Employee(3, "amateur", "솔루션개발2", "연구원", new BigInteger("2800"));
        Employee employee4 = new Employee(4, "pro", "솔루션개발2", "수석연구원", new BigInteger("7000"));
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        System.out.println(list);
        System.out.println("###################");
        Comparator<Employee> salesComparator = new Comparator<Employee>() {
        	public int compare(Employee o1, Employee o2) {
        		return o2.salaly.intValue() - o1.salaly.intValue();
        	}
        };
        Collections.sort(list,salesComparator);
        for(int i=0;i<4;i++) {
        	System.out.println(list.get(i).salaly);
        }
        
	}

}

package dev.selvam.assignment11;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.selvam.assignment11.models.Employee;
import dev.selvam.assignment11.models.EmployeeDAO;

public class Assignment11Application {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dev/selvam/assignment11/config/context.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("empdao");
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "emp1", 21000, 9000, 1000, 1400);
		emplist.add(e1);
		Employee e2 = new Employee(2, "emp2", 22000, 9000, 1000, 1400);
		emplist.add(e2);
		Employee e3 = new Employee(3, "emp3", 23000, 9000, 1000, 1400);
		emplist.add(e3);
		Employee e4 = new Employee(4, "emp4", 24000, 9000, 1000, 1400);
		emplist.add(e4);
		Employee e5 = new Employee(5, "emp5", 25000, 9000, 1000, 1400);
		emplist.add(e5);
		Employee e6 = new Employee(6, "emp6", 26000, 9000, 1000, 1400);
		emplist.add(e6);
		Employee e7 = new Employee(7, "emp7", 27000, 9000, 1000, 1400);
		emplist.add(e7);
		Employee e8 = new Employee(8, "emp8", 28000, 9000, 1000, 1400);
		emplist.add(e8);
		Employee e9 = new Employee(9, "emp9", 29000, 9000, 1000, 1400);
		emplist.add(e9);
		Employee e10 = new Employee(10, "john marquee", 30000, 9000, 1000, 1400);
		emplist.add(e10);
		
		// saving 10 employees
		for ( Employee emp: emplist) {
			dao.saveEmployee(emp);
		}
		
		// list out saved employees
		Employee empjohn = dao.findEmployee("john marquee");
		int grosssalary = empjohn.getBasic() + empjohn.getHra() + empjohn.getDa();
		int netsalary = (grosssalary -((grosssalary*15/100) + empjohn.getDeductions()));
		System.out.println("Gross salary = "+grosssalary);
		System.out.println("Net salary = "+netsalary);

		
		// get john marquee 
//		dao.findEmployee("john marquee");
		
		
		((ConfigurableApplicationContext)context).close();

	}

}

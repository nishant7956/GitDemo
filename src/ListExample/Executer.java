package ListExample;

import java.util.ArrayList;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1= new Employee("Emp1", "05/06/2012", 35, 19500);
		Employee E2= new Employee("Emp2", "05/06/2015", 45, 11500);
		Employee E3= new Employee("Emp3", "05/06/2018", 37, 14500);
		Employee E4= new Employee("Emp4", "05/06/2010", 50, 12500);
		Employee E5= new Employee("Emp5", "05/06/2020", 55, 1500);
		ArrayList<Employee> listemp=new ArrayList<>();
		listemp.add(E1);
		listemp.add(E2);
		listemp.add(E3);
		listemp.add(E4);
		listemp.add(E5);
		int maxsalary=0;
		String Name="";
		for (Employee employee : listemp)
		{
			
			if(employee.salary>maxsalary)
			{
				maxsalary=employee.salary;
				Name=employee.Name;
				//System.out.println(employee.Name);
			}
			
		}
		System.out.println("Employee with max salary is "+Name);
		
	}

}

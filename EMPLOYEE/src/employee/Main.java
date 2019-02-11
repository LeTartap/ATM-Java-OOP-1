package employee;


import java.util.*;

public class Main {

	public static void main(String[] args) {
	ArrayList<Employee> emList = new ArrayList<Employee>();
	
	Employee Vasile = new Employee("Vasile Dragos", 32);
	emList.add(Vasile);
	Employee Dorin = new Employee("Dorin Strugur", 53);
	emList.add(Dorin);
	Employee Anabela = new Employee("Anabela Gheorghe", 28);
	emList.add(Anabela);
	
	Collections.sort(emList,new Comparator<Employee>() {
	    @Override
	    public int compare(Employee a, Employee b) {
	        return a.getName().compareTo(b.getName());
	    }
	});
	
	for(Employee e : emList) {
		System.out.println(e.name);
	}
	

	
	
	}

}

package predicate;

public class PredicateExample {
	
	String employeeName;
	int age;
	Double Salary;
	public PredicateExample(String employeeName, int age, Double salary) {
		super();
		this.employeeName = employeeName;
		this.age = age;
		Salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}

}

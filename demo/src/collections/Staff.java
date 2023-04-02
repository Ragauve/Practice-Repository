package collections;

public class Staff {
	 int id;
	 String name;
	 int salary;
	public  Staff(int id,String name, int  salary) {
		
		
		System.out.println(+id  +name +salary);
		// TODO Auto-generated constructor stub
	}
	public Staff(String name , int salary) {
		// TODO Auto-generated constructor stub
		this.name="Ragav";
		this.salary=2000;		
		System.out.println(name +salary);
	}

	public static void main(String[] args) {
		
		Staff s = new Staff(10,"siva",10000);
		
		
		
		System.out.println(s.id);
	}
}

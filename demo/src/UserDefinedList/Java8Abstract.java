package UserDefinedList;

public abstract class Java8Abstract {
	
	public abstract void display();
	
	public void hide() {
		System.out.println("non abs method in abstract class");
	}

 public static void main(String[] args) {
	Java8Abstract j = new Java8Abstract() {

		@Override
		public void display() {
			System.out.println("Abstract method in Abstract class");
			
		}
		
	};
	
	j.display();
	j.hide();
}
}


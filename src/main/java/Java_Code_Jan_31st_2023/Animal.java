package Java_Code_Jan_31st_2023;

public class Animal {

	public static void main(String[] args) {
		System.out.println("I am coding");
		secret();
		Animal.secret();
		
		flower();
		Animal.flower();
		
		Animal animal=new Animal();   //create object like this one
		animal.loginTest();
		
		animal.displayScreen();
		

	}
	private static void secret() {
		
		System.out.println("I have written some secret code here in this method");
	}
	
	protected static void flower() {
		System.out.println("I have written some secret code here in this method");
		
	}
	
	void loginTest() {
		System.out.println("I have written some secret code here in this method");
		
	}

	public void displayScreen() {
		System.out.println("Sumsung 4k");
	}
}

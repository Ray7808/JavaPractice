/*package whatever //do not write package name here */

class GFG {

	public String geek; // Declared Instance Variable

	public GFG() { // Default Constructor

		this.geek = "Shubham Jain"; // initializing Instance Variable
	}

//Main Method
	public static void main(String[] args) {

		// Object Creation
		GFG name = new GFG();
		// Displaying O/P
		System.out.println("Geek name is: " + name.geek);
	}
}
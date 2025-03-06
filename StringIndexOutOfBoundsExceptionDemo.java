import java.util.Scanner;

class StringIndexOutOfBoundsExceptionDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		System.out.println("Demonstrating StringIndexOutOfBoundsException:");
		try{
			generateException(text);
		}
		catch(Exception e){
			System.out.println("Caught Exception in main: " + e);
		}
		System.out.println("\nHandling StringIndexOutOfBoundsException:");
		handleException(text);
	}
	public static void generateException(String str){
		int invalidIndex=str.length();
		 System.out.println("Character at invalid index " + invalidIndex + ": " + str.charAt(invalidIndex));
	}
	public static void handleException(String str) {
        int invalidIndex = str.length(); // Accessing index beyond valid range
        try {
            System.out.println("Character at invalid index " + invalidIndex + ": " + str.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index " + invalidIndex + " is out of bounds for string of length " + str.length());
        }
    }
}

		
		
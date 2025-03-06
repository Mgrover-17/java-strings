import java.util.Scanner;

class CharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter a string:");
        String str = sc.next();  

        // Getting characters using split() method
        String extractedByMethod = returnCharacters(str);

        // Getting characters using toCharArray() and converting to String
        String extractedByToCharArray = new String(str.toCharArray());

        // Compare the results
        boolean areEqual = compareStrings(extractedByMethod, extractedByToCharArray);

        // Displaying results
        System.out.println("Characters using split(): " + extractedByMethod);
        System.out.println("Characters using toCharArray(): " + extractedByToCharArray);

        if (areEqual) {
            System.out.println("Both methods return the same characters.");
        } else {
            System.out.println("The methods return different results.");
        }
    }

    public static String returnCharacters(String s) {
        String characters[] = s.split(""); // Splitting string into an array of single characters
        String result = ""; 

        for (String ch : characters) {
            result += ch; // Append each character to the result string
        }

        return result; 
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
}

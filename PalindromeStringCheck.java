import java.util.Scanner;

class PalindromeStringCheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("original string is: ");
		String str=sc.next();
		String reversedStr=palindrome(str);
		System.out.println("reversed string is: "+reversedStr);
		if(str.equals(reversedStr)){
			System.out.println("Given string is a palindrome.");
		}
		else{
			System.out.println("Given string is not a palindrome.");
		}
	}
	public static String palindrome(String s){
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			res+=ch;
		}
		return res;
	}
}
/*
sample test cases

original string is: madam
reversed string is: madam
Given string is a palindrome.

original string is: 1231
reversed string is: 1321
Given string is not a palindrome.
*/

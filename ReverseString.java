import java.util.Scanner;

class ReverseString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.next();
		System.out.println("Reversed string is: "+reverse(str));
	}
	public static String reverse(String s){
		String res="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			res+=ch;
		}
		return res;
	}
}
/*
sample test case
Enter string: bridgelabz
Reversed string is: zbalegdirb
*/
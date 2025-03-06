import java.util.Scanner;

class Uppercase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String convertUsingMethod=text.toUpperCase();
		String convertUsingCharAt=convertToUpperCase(text);
		System.out.println("Uppercase string is: "+convertUsingCharAt);
		System.out.println("Comparing both methods: "+convertUsingMethod.equals(convertUsingCharAt));
	}
	public static String convertToUpperCase(String str){
		String res="";
		for(int i=0;i<str.length();i++){
			int typecast=(int)str.charAt(i);
			if(typecast>=97 &&	typecast<=122){
				typecast-=32;
			}
			char ch=(char)typecast;
			res+=ch;
			System.out.println(ch);	
		}
		return res;
	}
}
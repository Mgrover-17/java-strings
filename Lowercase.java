import java.util.Scanner;

class Lowercase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String convertUsingMethod=text.toLowerCase();
		String convertUsingCharAt=convertToLowerCase(text);
		System.out.println("Uppercase string is: "+convertUsingCharAt);
		System.out.println("Comparing both methods: "+convertUsingMethod.equals(convertUsingCharAt));
	}
	public static String convertToLowerCase(String str){
		String res="";
		for(int i=0;i<str.length();i++){
			int typecast=(int)str.charAt(i);
			if(typecast>=65 && typecast<=90){
				typecast+=32;
			}
			char ch=(char)typecast;
			res+=ch;
			System.out.println(ch);
		}
		return res;
	}
}

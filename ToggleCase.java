import java.util.Scanner;

class ToggleCase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=sc.next();
		System.out.println("toggled case string is: "+toggleCase(str));
	}
	public static String toggleCase(String s){
		String res=""; //empty string to store the characters
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)){
				res+=Character.toLowerCase(ch);
			}
			else{
				res+=Character.toUpperCase(ch);
			}
		}
		return res;
	}
}
/*
enter string: mAnVi
toggled case string is: MaNvI
*/			
				
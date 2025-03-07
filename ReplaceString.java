import java.util.Scanner;

class ReplaceString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=sc.nextLine();
		System.out.print("enter the word which has to be replaced: ");
		String replaceWord=sc.next();
		System.out.print("enter the word which has to be replaced with: ");
		String replacedWith=sc.next();
		String replacedString=str.replace(replaceWord,replacedWith);
		System.out.println("Replaced string is: "+replacedString);
	}
}
	
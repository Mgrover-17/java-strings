import java.util.Scanner;

class LengthOfString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("length of string using built in method is: "+str.length());
		System.out.println("length of string without using built in method is: "+findLength(str));
	}
	public static int findLength(String s){
		int count=0;
		try{
			while(true){
				s.charAt(count);
				count++;
		}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Index Out Of Bounds Exception");
		}
		return count;
	}
}
		
			
import java.util.Scanner;

class LongestWord{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String str=sc.nextLine();
		System.out.println(longest(str));
	}
	public static String longest(String s){
		String[] ch=s.split(" ");
		int max=0;
		int idx=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i].length()>max){
				max=ch[i].length();
				idx=i;
			}
		}
			return ch[idx];
		
	}
}
/*
hello my name is dfdfdd
dfdfdd
*/

				
	
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=sc.next();
		System.out.println("string after removing duplicates is: "+removeDuplicates(str));
	}
	public static String removeDuplicates(String s){
		String res="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(res.indexOf(ch)==-1){
				res+=ch;
			}
		}
		return res;
	}
}

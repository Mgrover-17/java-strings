import java.util.Scanner;

class CompareStrings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		boolean charAtComparison = compare(str1, str2);
        boolean equalsComparison = str1.equals(str2);
		if(charAtComparison&&equalsComparison){
			System.out.println("Results are same.");
		}
		else{
			System.out.println("Results are not same");
		}
	}
	public static boolean compare(String s1,String s2){
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)==s2.charAt(i)){
					return true;
				}
					return false;
			}
			return true;
		}
			return false;
	}
}
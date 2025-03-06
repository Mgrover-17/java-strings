import java.util.Scanner;

class CountVowelsConsonants{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string: ");
		String str=sc.nextLine();
		int[] result=count(str);
		System.out.println("vowels: "+result[0]+", consonants: "+result[1]);
	}
	//count number of vowels and consonants
	public static int[] count(String s){
		s=s.toLowerCase();
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
					vowelCount++;
				}
				else{
					consonantCount++;
				}
			}
		}
		return new int[]{vowelCount,consonantCount};
	}
}
/*
sample test case
enter string: hey there
vowels: 3, consonants: 5
*/

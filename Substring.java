import java.util.Scanner;

class Substring{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int startIndex=sc.nextInt();
		int endIndex=sc.nextInt();
		String substringCharAt=createSubstring(str,startIndex,endIndex);
		if(substringCharAt.equals("Invalid")){
			System.out.println("Invalid");
		}
		else{
			String substringMethod=str.substring(startIndex,endIndex);
		
		// Display the results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringMethod);
		
		boolean areEqual=compareStrings(substringCharAt,substringMethod);

        if (areEqual) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Substrings are not equal.");
        }
		}
	}
	public static String createSubstring(String s,int start,int end){
		if(start<0 || end>s.length() || start>=end){
			return "Invalid";
		}
		String result="";
		for(int i=start;i<end;i++){
			result+=s.charAt(i);
		}
		return result;
	}
	public static boolean compareStrings(String s1,String s2){
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
	

		
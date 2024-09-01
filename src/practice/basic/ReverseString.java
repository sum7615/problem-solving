package practice.basic;

public class ReverseString {
//	Write a method that takes a string as input and returns the reversed string.
	
	public static void main(String[] args) {
//		System.out.println(reverse("Suman"));
		System.out.println(palindrome("madam"));
	}
	
	public static String reverse(String str) {
		StringBuilder res = new StringBuilder();
		
		for(int i=str.length()-1; i>=0;i--){
			res.append(str.charAt(i));
		}
		
		return res.toString();
		
	}
	
	
	
	public static boolean palindrome(String str) {
		int length = str.length()-1;
		for(int i =0; i<=length;i++) {
			if(str.charAt(i)!=str.charAt(length-i)) {
				return false;
			}
		}
		
		return true;
	}

}

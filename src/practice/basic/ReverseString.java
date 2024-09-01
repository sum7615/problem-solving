package practice.basic;

import java.math.BigInteger;

public class ReverseString {

	
	public static void main(String[] args) {
//		System.out.println(reverse("              f                      "));
//		System.out.println(palindrome("              f                      "));
		
//		System.out.println(maximumNumber(new int[] {12,342,12,345}));
		
//		System.out.println(factorialNumber(4));
		
//		System.out.println(factorialNumberRecouson(new BigInteger("2400")));
		
		System.out.println(primeNumber(24));
		
	}
	
	
	public static boolean primeNumber(int number){
		
		if(number==0||number==1) {
			return false;
			
		}
		int sqrt = (int)Math.sqrt(number);
		while(sqrt>1) {
			if(number%sqrt==0) {
				return false;
			}
			sqrt--;
		}
		return true;
		
	}
	
//	Write a function to calculate the factorial of a given number using both iterative and recursive approaches.
	public static long factorialNumberIteration(int nmbr) {
		long fact = nmbr;
		nmbr--;
		while(nmbr>0) {
			fact*=nmbr;
			nmbr--;
		}
		return fact;
	}
	
	public static BigInteger factorialNumberRecouson(BigInteger nmbr) {
		System.out.println("Number: "+nmbr);
		if(nmbr.compareTo(new BigInteger("1"))<=0) {
			return new BigInteger("1");
		}
		
		return (nmbr.multiply(factorialNumberRecouson(nmbr.subtract(new BigInteger("1")))));
		
		
		
	}
	
	
	
//	Write a method that takes a string as input and returns the reversed string.
	public static String reverse(String str) {
		if(str==null || (str.trim().isEmpty())) {
			return "";
		}
		str=str.trim();
		StringBuilder res = new StringBuilder();
		int i=str.trim().length()-1;
		while(i>=0){
			res.append(str.charAt(i));
			i--;
		}
		
		return res.toString();
		
	}
	
	
//	Write a method to find the maximum number in an array of integers.
	public static int maximumNumber(int[] arr) {
		if(arr==null || arr.length<1) {
			return Integer.MIN_VALUE;
		}
		
		int max=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		return max;
	}
	
//	Write a method that checks if a given string is a palindrome.
	public static boolean palindrome(String str) {
		if(str==null || (str.trim().isEmpty())) {
			return false;
		}
		str=str.trim();
		int length = str.length()-1;
		for(int i =0; i<=length;i++) {
			if(str.charAt(i)!=str.charAt(length-i)) {
				return false;
			}
		}
		
		return true;
	}

}

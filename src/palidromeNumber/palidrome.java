package palidromeNumber;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 */
public class palidrome {
	public static boolean isPalindrome(int x) {
        if ( x < 0 ) {
        	return false;
        } else {
        	String[] a = String.valueOf(x).split("");
        	String b = "";
        	for(int i = a.length - 1; i >= 0; i--) {
        		b = b + a[i];
        	}
        	int c = Integer.valueOf(b);
        	return x == c;
        }
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(1244521));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(-11));
		System.out.println(isPalindrome(0));
	}
}

package IntegerToRoman;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 */
public class IntToRoman {
	public static String intToRoman(int num) {
		String output = "";
		if(num%1000 >= 0) {
			int a = Integer.valueOf(num/1000);
			for(int i=0; i<a; i++) {
				output = output + "M";
			}
			num = num - 1000*a;
		} 
        if(num%900 >= 0) {
			int a = Integer.valueOf(num/900);
			for(int i=0; i<a; i++) {
				output = output + "CM";
			}
			num = num - 900*a;
		}
		if(num%500 >= 0) {
			int a = Integer.valueOf(num/500);
			for(int i=0; i<a; i++) {
				output = output + "D";
			}
			num = num - 500*a;
		}
        if(num%400 >= 0) {
			int a = Integer.valueOf(num/400);
			for(int i=0; i<a; i++) {
				output = output + "CD";
			}
			num = num - 400*a;
		}
		if(num%100 >= 0) {
			int a = Integer.valueOf(num/100);
			for(int i=0; i<a; i++) {
				output = output + "C";
			}
			num = num - 100*a;
		}
        if(num%90 >= 0) {
			int a = Integer.valueOf(num/90);
			for(int i=0; i<a; i++) {
				output = output + "XC";
			}
			num = num - 90*a;
		}
		if(num%50 >= 0) {
			int a = Integer.valueOf(num/50);
			for(int i=0; i<a; i++) {
				output = output + "L";
			}
			num = num - 50*a;
		}
        if(num%40 >= 0) {
			int a = Integer.valueOf(num/40);
			for(int i=0; i<a; i++) {
				output = output + "XL";
			}
			num = num - 40*a;
		}
		if(num%10 >= 0) {
			int a = Integer.valueOf(num/10);
			for(int i=0; i<a; i++) {
				output = output + "X";
			}
			num = num - 10*a;
		}
        if(num%9 >= 0) {
			int a = Integer.valueOf(num/9);
			for(int i=0; i<a; i++) {
				output = output + "IX";
			}
			num = num - 9*a;
		}
		if(num%5 >= 0) {
			int a = Integer.valueOf(num/5);
			for(int i=0; i<a; i++) {
				output = output + "V";
			}
			num = num - 5*a;
		}
		if(num%4 >= 0) {
			int a = Integer.valueOf(num/4);
			for(int i=0; i<a; i++) {
				output = output + "IV";
			}
			num = num - 4*a;
		}
		if(num >= 0) {
			int a = Integer.valueOf(num/1);
			for(int i=0; i<a; i++) {
				output = output + "I";
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(intToRoman(2635));
	}
}

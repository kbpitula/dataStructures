package longestCommonPrefix;

public class LongerCommonPrefix {
	public static String longestCommonPrefix(String[] x) {
		String output = "";
		String check = "";
        for (int i = 0; i <  x.length; i++) {
        	for (int j = 0; j < x.length; j++) {
        		if(x[i].length() == 0) {
        			return "";
        		} else if (x[j].length() == 0) {
        			return "";
        		}
        		if(i==j) {
        			//TO_DO nothign
        		} else {
        			String[] str = x[i].split("");
        			for(int w=0; w <= str.length; w++) {
        				
        				String test = x[i].substring(0, w);			
        				if(x[j].startsWith(test)) {
        					if (i==0 && j ==1) {
        						output = test;
        					}

        					check = test;
        				}
        				}
        				if(check.length() < output.length()) {
        					output = check;
        				}
        		}
        	}
        }
        return output;
    }
	
	public static void main(String[] args) {
		String[] a = {"a","a", "b"};

		System.out.println("ANSWER" + longestCommonPrefix(a));
	}
}

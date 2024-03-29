package model;

public class Utilities {
	
	public static String getSequence1a(int ft, int d, int n) {
		
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			result += term;
			if(i < n) {
				result += ", "; //not the last term
			}
			sum += term;
			term += d; //term = term + d	
			
		}
		result += ">";
		result += " has average " + ((double)sum / n); // cast has higher precedence, sum becomes double and then divide to n

		
		return result;
		
	}
	
	public static String getSequence1b(int ft, int d, int n) {
		
		String result = "";
		int term = ft;
		result += "<";
		int sum = 0;
		int i = 1;
		while(i <= n) {
			result += term;
			
			if(i < n) {
				result += ", "; //not the last term
			}
			sum += term;
			term += d; //term = term + d	
			i++;
			
		}
		result += ">";
		result += " has average " + ((double)sum / n); // cast has higher precedence, sum becomes double and then divide to n

		
		return result;
		
	}
	public static String getSequence2a(int ft, int d, int max) {
		
		String result = "";
		int term = ft;
		result += "<";
		int sum = 0;
		int n = 0;
		for(;term <= max;) {//exiting from the loop means: !(term ,+ max) is the case(i.e., term > max)
			n++;
			result += term;
			result += " ";
			sum += term;
			term += d; //term = term + d				
		}
		
		result += ">";
		result += " has average " + ((double)sum / n); // cast has higher precedence, sum becomes double and then divide to n

		
		return result;
		
	}
	
	public static String getSequence2b(int ft, int d, int max) {
		
		String result = "";
		int term = ft;
		result += "<";
		int sum = 0;
		int n = 0;
		while(term <= max) {//exiting from the loop means: !(term ,+ max) is the case(i.e., term > max)
			n++;
			result += term;
			result += " ";
			sum += term;
			term += d; //term = term + d	
			
		}
		result += ">";
		result += " has average " + ((double)sum / n); // cast has higher precedence, sum becomes double and then divide to n

		
		return result;
		
	}
	
	

}

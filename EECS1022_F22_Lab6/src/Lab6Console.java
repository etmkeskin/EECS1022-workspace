
import java.util.Arrays;
import java.util.Scanner;

public class Lab6Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 	
		
		//longestSeq()
		int[] a = {7,-9,10,-11,1,-2,-1,0};
		int result = Lab6.longestSeq(a);
		System.out.println(result);
		
		//getArrayStats()
		int[] a1 = {4,8,1,6,11};
		String result1 = Lab6.getArrayStats(a1);
		System.out.println(result1);
		
		//countArray()
		int[] a2 = {6,12,6,6,18,45};
		String result2 = Lab6.countArray(a2);
		System.out.println(result2);
		
		//swapElements()
		
		//validString
		String a3 = "aedreferam";
		String a4 = "adam";
		boolean result3 = Lab6.validString(a3, a4);
		System.out.println(result3);
		
		
		
		scan.close();
	}
}

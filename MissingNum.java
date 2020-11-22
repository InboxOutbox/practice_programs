package practice;

public class MissingNum {
	
	public static void main(String args[]) {
		int[] inp = {1, 3, 4};
		System.out.println("The missing number is: " + findMissing(inp));
	}
	
	public static int findMissing(int[] input) {
		
		int totalOfInput = 0;
		int totalActual=0;
		
		for(int i=0; i<input.length;i++) {
			totalOfInput = totalOfInput + input[i];
		}
		System.out.println(totalOfInput);
		// 1,3,4
		// total =8
		// total of 1,2,3,4 = 10
		// 10-8 is the missing number
		for(int i=1; i<=input.length+1;i++) {
			totalActual = totalActual + i;
		}
		System.out.println(totalActual);
		
		return totalActual-totalOfInput;
	}

}

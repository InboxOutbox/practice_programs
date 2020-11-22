package practice;

public class LargestInt {
	public static void main(String args[]) {
		int[] sample = {9,2,21,10,11};
		System.out.println(largest(sample));
	}	
	public static int largest(int[] sample) {
		int max = sample[0];
		for(int i=0;i<sample.length;i++) {
			if(sample [i] > max)
				max = sample[i];
		}
		return max;
	}
}

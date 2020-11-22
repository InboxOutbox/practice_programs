package practice;

public class Substrings {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //create an array of substrings of s with length k
        String substr[] = new String[s.length()-k+1];
        for(int i=0;i<=s.length()-k;i++){
        	substr[i] = s.substring(i,i+k);
        }
        smallest=substr[0];
        largest=substr[0];
        
        for(String m:substr) {
        	if(m.compareTo(smallest)<0)
        		smallest = m;
        	if(m.compareTo(largest)>0)
        		largest = m;
        }
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
}

package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringOper {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        List<String> input = new ArrayList<>();
        while(scan.hasNext()) {        
            input.add(scan.nextLine());
            if(++i > n)
            	break;
        }
        scan.close();
        
        for(int m=1;m<input.size();m++){
        	String temp1="", temp2="";
        	for(int j=0; j<input.get(m).length();j++) {
        		if(j%2==0)
        			temp1 = temp1+input.get(m).charAt(j);
        		else
        			temp2 = temp2+input.get(m).charAt(j);
        	}
        	System.out.println(temp1 + " "+temp2);
        }
    }
}

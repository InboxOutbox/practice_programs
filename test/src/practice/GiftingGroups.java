package practice;

import java.util.ArrayList;
import java.util.List;

public class GiftingGroups {
	public static void main(String[] args) {
		//input
		List<String> related= new ArrayList<String>();
		related.add("4");
		related.add("1100");
		related.add("1101");
		related.add("0010");
		related.add("1011");
		
		//size of the matrix
		int size = Integer.parseInt(related.get(0));
		
		//creating a matrix from the strings
		int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		matrix[i][j]= Integer.parseInt(String.valueOf(related.get(i+1).charAt(j)));
        	}
        }
        
        //checking for groups
        int groups=0;
        for(int m=0;m<size;m++) {
        	for(int n=0;n<size;n++) {
        		if(m==n)
        			continue;
        		else if(matrix[m][n]==1){
        			groups+=1;
        		}
        	}
        }
        System.out.println("There are "+groups+" groups");
	}
   }



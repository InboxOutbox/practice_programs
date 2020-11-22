package practice;

public class Arrays {
	
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1,4,3,2};
        
        String s="";
        for(int i=n-1;i>=0;i--){
            s= s+ arr[i]+" ";
        }
        System.out.println(s);
    }
}

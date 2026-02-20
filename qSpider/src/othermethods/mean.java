package othermethods;

public class mean {
	 public static void main(String[] args) {
	        mean sol = new mean();
	        
	        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
	        
	        int result = sol.findSpecialInteger(arr);
	        
	        System.out.println("Special Integer: " + result);
	    }
	

	    public int findSpecialInteger(int[] arr) {
	        int size = arr.length;
	        int qtr = size / 4;
	        int count = 1;
	        int x = arr[0];

	        for(int i = 1; i < size; i++){
	            if(x == arr[i]){
	                count++;
	            }
	            else{
	                count = 1;
	            }
	            if(count > qtr){
	                return arr[i];
	            }
	            x = arr[i];
	        }
	        return x;
	    
}
}

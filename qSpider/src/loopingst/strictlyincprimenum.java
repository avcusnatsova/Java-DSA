package loopingst;

public class strictlyincprimenum {
	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++) {
			if ( checkprime(i) && strictlyinc(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean checkprime(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		return count == 1;
	}
	public static boolean strictlyinc(int num) {
		int temp = 10;
		
		while (num > 0) {
			int rem = num % 10;
			if (rem < temp) 
				temp = rem;
			else
				return false;
			num /= 10;	
		}
		return true;
	}

}

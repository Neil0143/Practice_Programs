package newpack;

public class Test1 {
	public class ReverseNumber {
	    public static void main(String[] args) {
			
		
	        int num = 12345;


	        int rev = 0;
	        while (num > 0) 
		{
	            int new1 = num % 10;
	            rev = rev * 10 + new1;
	            num = num / 10;
	        }

	        System.out.println("Reversed number: " + rev);
	    }
	}

}

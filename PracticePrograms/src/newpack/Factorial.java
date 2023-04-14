package newpack;

public class Factorial {
	public static void main(String[] args) {
		long n,f;
		n= 20;
		f=1;
		
		for (long i=1; i<=n; i++)
			f=f*i;
		System.out.println("Factorial of "+n+" is "+f);
				
	}

}

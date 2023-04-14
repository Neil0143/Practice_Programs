package newpack;

public class DuplicateArray {
	public static void main(String[] args) {
		int a [] = {1,5,6,5,7,7,4,9,1};
		for (int i = 0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] == a[j]) 
						{
					System.out.println("Duplicate number " + a[i]);
						}
			}
		}
	}

}

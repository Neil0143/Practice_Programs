package newpack;

public class StringArrayDuplicate {
	public static void main(String[] args) {
		String a [] = {"Neil","Raju","NEil","Chenya","Chenya","Neil"};
		for (int i = 0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i].equalsIgnoreCase(a[j]))
						{
					System.out.println("Duplicate Word: " + a[i]);
						}
			}
		}
	}

}

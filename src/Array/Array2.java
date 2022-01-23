package Array;

public class Array2 {

	public static void main(String[] args) {
		int a[]= {12,5,84,94,45,36};
		     
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			if(a[i]==95)
			{
				System.out.println("I found the Number:"+a[i]);break;
			}
			else if(a[i]!=95) continue;
			{
				System.out.println("The value did not found:"+a[i]);
			}
			
				
		}
		
	int b[]= {1,2,3,4,5,6,7,8,9};
	for(int i=0;i<a.length;i++)
	{
		if(b[i]%2==0)
		{
			System.out.println("This is even number:"+b[i]);
		}
		else if(b[i]%2!=0)
			System.out.println("This is odd number:"+b[i]);
	}
	}

}

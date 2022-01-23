package ControlStatement;

public class IterationStatement {

	public static void main(String[] args) {
		//for Loop
		for(int i=1;i<=5;i++)
		{
			System.out.print("*");
		}
		System.out.println();
        // Nested for loop
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				}
				for(int k=5;k>=i;k--)
					System.out.print(" "+k);
				System.out.println();
			}
			//System.out.println();
		

	   // While loop
	int l=1;
	 while(l<=5)
	 {
		System.out.print(l);
		l++;
	 }
	 System.out.println();
	 // Do While
	 int m=6;
	 do
	 {
		 System.out.print(m);
		 m++;
	 }while(m<5);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 

}}

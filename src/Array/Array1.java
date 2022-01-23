package Array;

public class Array1 {

	public static void main(String[] args) {
		//Single Dimensional Array
		int a[]=new int[5];
		a[0]=20;
		a[1]=30;
		a[2]=40;
		a[3]=50;
		a[4]=60;
		
		System.out.println(a.length);
		System.out.println(a[4]);
		int b[]= {20,45,55,66,85,95};
		System.out.println(b.length);
		System.out.println(b[5]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for (int i : b) {
			System.out.print(i+" ");
		}

		// Two Dimensional Array
		int c[][]=new int[3][2];
		c[0][0]=25;
		c[0][1]=35;
		c[1][0]=45;
		c[1][1]=85;
		c[2][0]=75;
		c[2][1]=47;
		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(c[0][1]);
		int d[][]= {{20,30,40},{45,55,65}};
		System.out.println(d.length);
		System.out.println(d[0].length);
		System.out.println(d[1][1]);
		for(int i=0;i<d.length;i++)
		{
			//System.out.println(d[i]);
			for(int j=0;j<d[0].length;j++)
			{
				System.out.print("{"+d[i][j]+" "+"}");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}

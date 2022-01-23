package ControlStatement;

import java.util.Scanner;

public class ConditionalStatement {
     
     
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 to 7 of the day ");
		int n = s.nextInt();
		System.out.println("You entered :"+n);
		if(n==1)
		{
			System.out.println("You entered Sunday");
			
		}
		else if(n==2)
		{
			System.out.println("You entered Monday");
		}
		else if (n==3)
		{
			System.out.println("You entered Tuesday");
		}
		else if (n==4)
		{
			System.out.println("You entered Wednesday");
		}
		else if (n==5)
		{
			System.out.println("You entered Thursday");
		}
		else if (n==6)
		{
			System.out.println("You entered Friday");
		}
		else if (n==7)
		{
			System.out.println("You entered Saturday");
		}
		else
			System.out.println("None of the above");
		
		
		
		
		
		
		
		
		
		
		/*
		
		int day=5;
		switch(day) {
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;	
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednesday");break;
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saturday");break;
		default:System.out.println("None of the above");*/
		//8}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

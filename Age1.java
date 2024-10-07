package bca;

import java.util.Scanner;

public class Age1 {

	public static void main(String[] args) 
	{
		System.out.println("Please Enter your Age:");
		Scanner in =new Scanner(System.in);
		int age =in.nextInt();
		if(age<=0) 
		{
			System.out.println("Invalid Input");
		}
		else if(age >= 1 && age <= 12) 
		{
			System.out.println("Children");
		}
		else if(age >= 13 && age <= 18) 
		{
			System.out.println("Adult");
		}
			else if(age >= 19 && age <= 35)
			{
				System.out.println("Young");
			}
			
			else 
			{
      		System.out.println("Senior");
			}



		}

	}



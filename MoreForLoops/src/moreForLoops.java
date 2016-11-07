import java.util.Scanner;

public class moreForLoops
	
{

		
	public static void main(String[] args)
			
		{
//			chaLLengeOne();
//			chaLLengeTwo();
//			chaLLengeThree();
//			chaLLengeFour();
		}

	public static void chaLLengeOne()

		{
		Scanner userInput= new Scanner (System.in);
		int total = 0;
		for (int i =0; i <101; i=i+5)
		
			
			if (i %5==0)
				{
					System.out.println(i);
					System.out.println(total=total+i);
				}
				
			
				
			
		}
	
	public static void chaLLengeTwo()
	
	{
		{
			Scanner userInput= new Scanner (System.in);
			System.out.println("Please pick a lowerbound and an upperbound.");
			int number1 = userInput.nextInt();
			int number2 = userInput.nextInt();
			int sum = 0;
			for (int i= number1; i <= number2; i++)
				{
					sum+=i;
				}
				
			System.out.println("The total is " + sum);
					
	}
		
	
	
}
	
	public static void chaLLengeThree()
	
	{
		{
			Scanner userInput= new Scanner (System.in);
			System.out.println("Please pick a lowerbound and an upperbound.");
			int number1 = userInput.nextInt();
			int number2 = userInput.nextInt();
			int sum = 0;
			for (int i= number1; i <= number2; i++)
				
				{
			if (i %3==0)
				{
					System.out.println(i);
					System.out.println(sum+=i);
				}
					
				}
				
			
				
		
				
		}
	}
	
	public static void chaLLengeFour()
	
	{
		
		System.out.println("* * * * * * * * *");
		for (int i=0; i<10; i++)
			{
				System.out.println("*               *");
			}
		System.out.println("* * * * * * * * *");
		
		
		
	}
	
	
	
	
	
	
}
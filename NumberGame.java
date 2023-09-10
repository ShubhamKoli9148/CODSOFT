import java.util.*;
class NumberGame
{
	public static void main(String [] agrs)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		int score=0;
		System.out.println("Lets Play The Game :");
		
		
		
		
		int a;
		int ch;
		int s=0;
		do{
			System.out.println("**********************************************");
			System.out.println(" Choose Options ");
			System.out.println(" 1. START ");
			System.out.println(" 2. EXIT");
		
			System.out.println("**********************************************");
			a= sc.nextInt();
			sc.nextLine();
			switch(a)
		{
			case 1:
			{
				System.out.println("GUESS THE RANDOM NUMBER :");
				int g=sc.nextInt();
		
				int r=rand.nextInt((100-1+1)+1);
				
				
				int temp=r;
		
				System.out.println(" ");
				System.out.println(" GUESSED NUMBER : "+g);
				System.out.println(" ");
				System.out.println(" RANDOM NUMBER :"+r);
			
				if(g>=0 && g<=100)
				{
					if(temp<g)
					{	
						int diff=g-temp;
						if(diff<10)
						{
							score=score+20;
						System.out.println("GUESSED NUMBER IS NEAREST TO NUMBER : ");				
						}
						else if(diff>10)
						{
							score=score+10;
						System.out.println("GUESSED NUMBER IS TOO HIGH FROM RANDOM NUMBER : ");	
				
						}
					}
					else if (temp>g)
					{
						int diff=temp-g;
					
						if(diff<10)
						{
							score=score+20;
							System.out.println("GUESSED NUMBER IS NEAREST TO NUMBER : ");				
						}
						else if(diff>10)
						{
							score=score+10;
							System.out.println("GUESSED NUMBER IS TOO LOW FROM RANDOM NUMBER : ");	
				
						}
					}
					else if(g==temp)
					{
						score=score+30;
						System.out.println(" YOU WIN ");
			
					}
			
				}
				else
				{
				System.out.println("Enter valid Number in the Range Of 1 to 100 :");
				}
				break;
			}
			case 2:
			{
				break;
			}
			
		
		}
		System.out.println(" do u want to Play again :  ");
		System.out.println(" 1.Yes  ");
		System.out.println(" 2.No  ");
		
		
		ch=sc.nextInt();
		if(ch==1)
		{
			score=score*0;
		}
		}while(ch!=2);
		System.out.println("");
		System.out.println("*****************************************");
		System.out.println(" NAME :"+name);
		System.out.println(" SCORE : "+score+" OUT OF 30");
		System.out.println(" THANK YOU ");
		System.out.println("*****************************************");
		
		
		
		
		
		
	
	}
}
package forLoops;

public class forLoops
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				//showGeniusOne();
				//showGeniusTwo();
				//showGeniusThree();
				//showGeniusFour();
				//showGeniusFive();
				showGeniusSix();
			}
		public static void showGeniusOne()
			{
				for (int i = 1; i <=5; i++)
					{
						System.out.println(i);
					}
			}
		public static void showGeniusTwo()
			{
				for (int i = 2; i <=10; i = i+2)
					{
						System.out.println(i + " I love Mullen!");
					}
			}
		public static void showGeniusThree()
			{
				for (int i = 1; i<=5; i++)
					{
						System.out.print(i);
						if (i < 5)
							{
								System.out.print(", ");
							}
						else
							{
								System.out.print(" ");
							}
					}
			}
		public static void showGeniusFour()
			{
				for (int i = 10; i > 0; i --)
					{
						System.out.println(i);
					}
				System.out.println("Liftoff");
			}
		public static void showGeniusFive()
			{
				int sum = 0;
				for (int i = 5; i <= 100; i = i +5)
					{
						sum  = sum +i;
					}
				System.out.println(sum);
			}
		public static void showGeniusSix()
			{
				
			}
	}
//liam has ligma
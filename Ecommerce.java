public class Ecommerce
{
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
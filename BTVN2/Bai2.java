import java.util.Scanner;

public class Bai2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n, i;
		n = scanner.nextInt();
		int a[]= new int[100];
		for(i=0;i<n;i++) 
		{
			a[i]= scanner.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i%2!=0) 
			{
				if(i == n-1) 
				{
					a[i]+=Math.abs(a[i-1]);
				}
				else 
				{
				a[i]+=Math.abs(a[i-1]-a[i+1]);
				}
			}
		}
		for(i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

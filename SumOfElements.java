import java.util.*;
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array: ");
		n= scan.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		int flag=0;
		int sum=0;
		for (int i:array)
		{
			if(i==6)
			{
				flag=1;
			}
			if(flag ==1)
			{
				if(i==7)
				{
					flag=0;
				}
				continue;
			}
			else
			{
				if(i==7)
				{
					sum+=i+6;
				}
				else
				{
					sum+=i;
				}
			}
		}
		System.out.println(sum);
	}
}
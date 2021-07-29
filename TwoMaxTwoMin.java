import java.util.*;
public class TwoMaxTwoMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array: ");
		n=scan.nextInt();
		int []  array= new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		int max1,max2,min1,min2;
		max1= max2 = Integer.MIN_VALUE;
		min1 = min2 = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(max1<array[i])
			{
				max2=max1;
				max1=array[i];
			}
			else if(max2 < array[i])
			{
				max2 = array[i];
			}
		}
		System.out.println("The two maximum elements of the array are: " + max1 + " , "+ max2);
		for(int i=0;i<array.length;i++)
		{
			if(min1>array[i])
			{
				min2=min1;
				min1=array[i];
			}
			else if(min2>array[i])
			{
				min2=array[i];
			}
		}
		System.out.println("The two minimum elements of the array are: " + min1 + " , " + min2);
		
	}

}

import java.util.*;
public class SortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array" );
		n=scan.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			for (int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + "    ");
		}
		
	}

}

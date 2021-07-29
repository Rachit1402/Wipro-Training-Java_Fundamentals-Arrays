import java.util.*;
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array");
		n=scan.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the array from which duplicacy has to be removed= ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		int y=0;
		for(int i=0;i<array.length;i++)
		{
			for(int z=i+1;z<i;z++)
			{
				if(array[i]>array[z])
				{
					y=array[i];
					array[i]=array[z];
					array[z]=y;
				}
			}
		}
		System.out.println("The sorted array is: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + "    ");
		}
		int j=0;
		int [] temp= new int[array.length];
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i] != array[j])
			{
				temp[j++] =array[i];
			}
		temp[j++] = array[array.length-1];
		}
		for (int i=0;i<j;i++)
		{
			array[i]=temp[i];
		}
		System.out.println("The array after removing duplicacy= ");
		for(int i=0;i<j;i++)
		{
			System.out.print(array[i] + "    ");
		}
	}
}

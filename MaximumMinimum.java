import java.util.*;
public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array: ");
		n=scan.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
			if(min>array[i])
				min=array[i];
		}
		System.out.println("Maximum value of the array= "+ max + ". The Minimum value of the array= " + min+ ".");
		

	}

}

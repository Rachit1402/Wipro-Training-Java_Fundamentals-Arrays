import java.util.*;
public class SumAverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array= ");
		n=scan.nextInt();
		int [] array=new int[n];
		System.out.println("Enter the elements of the array= ");
		for(int i=0;i<n;i++)
		{
			array[i] = scan.nextInt();
		}
		int sum=0;
		float ave=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		ave=sum/array.length;
		System.out.println("The SUM of the array is= " + sum + " and the AVERAGE of the array element is= " + ave);
	}
}

import java.util.*;
public class CheckNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		int n;
		int i=0;
		System.out.println("Enter the number of elements of the array");
		n= scan.nextInt();
		int x;
		System.out.println("Enter the element to check if it is present in the array or not= ");
		x=scan.nextInt();
		System.out.println("Enter the array elements");
		int [] array = new int[n];
		for (i=0;i<n;i++)
		{
			array[i] = scan.nextInt();
		}
		for (i=0;i<n;i++)
		{
			if(array[i] == x)
			{
				flag=1;
				break;
			}
		}
		if(flag ==1)
		{
			System.out.println(x + " is at " + (i+1) + "rd position.");
		}
		else
		{
			System.out.println("-1");
		}

	}

}

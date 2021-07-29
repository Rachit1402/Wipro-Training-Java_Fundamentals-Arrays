import java.util.*;
public class ASCIItoCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of array: ");
		n=scan.nextInt();
		int [] array = new int [n];
		System.out.println("Enter the ASCII values for the array character: ");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print((char)(array[i])+"  ");
		}
	}

}


public class ReversingTwodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length<4)
			System.out.println("please enter 4 integer: ");
		int array[][] = new int[2][2];
		int revarray[][] = new int[2][2];
		int x=0;
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[0].length;j++)
			{
				array[i][j] = Integer.parseInt(args[x++]);
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				revarray[array.length-i-1][array.length-j-1]=array[i][j];
			}
			System.out.println();
		}
		//displaying the arrays
		System.out.println("The given array is: ");
		
		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The reverse array is:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(revarray[i][j]);
			}
			System.out.println();
		}
	}
}
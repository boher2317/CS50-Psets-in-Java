import java.util.Scanner;


public class Mario 
{
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) 
	{
		System.out.print("Please enter the height of your pyramid, a whole number between 0 and 23: ");
		int height = getHeight();


		while (height < 0 || height > 23)
		{
			System.out.print("\nThat's not between 0 and 23.  Try again: ");
			height = getHeight();
		}


		drawPyramid(height);
	}


	public static int getHeight()
	{
		while (!sc.hasNextInt())
		{
			sc.nextLine();  // eats any invalid input to clear stream
			System.out.print("\nThat's not a valid entry! Try again: ");
		}


		return sc.nextInt();
	}


	public static void drawPyramid(int height)
	{
		int spaces;
	    int hashes;   


	    for (int row = 0; row < height; row++)
	    {
	        for (spaces = 0; spaces < (height - row - 1); spaces++)
	        {
	            System.out.print(" ");
	        }


	        for (hashes = 0; ((hashes + spaces) <= height); hashes++)
	        {
	            if ((hashes + spaces) < height)
	                System.out.print("#");


	            else
	                System.out.print("#\n");
	        }


	     }
	}
}

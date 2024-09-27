package PatternPrinting;

public class pattern4 {

	public static void main(String[] args) {

		char ch = 'A';

		for (int i = 0; i < 5; i++) // row
		{
			for (int j = 0; j < 5; j++) // col
			{
				System.out.print((char) (ch + i + j)+" ");

			}

			System.out.println();
		}

	}

}

//OUTPUT
/*
  ABCDE 
  BCDEF 
  CDEFG 
  DEFGH 
  EFGHI
 */
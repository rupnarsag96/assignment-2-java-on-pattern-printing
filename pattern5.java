package PatternPrinting;

public class pattern5 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) // row
		{
			for (int j = 0; j < 4; j++) // col
			{
				System.out.print((i + j) % 2);
			}
			System.out.println();
		}

	}

}

//OUTPUT
/*
  0101 
  1010 
  0101 
  1010
 */
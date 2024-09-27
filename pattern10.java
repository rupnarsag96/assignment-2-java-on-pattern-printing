package PatternPrinting;

public class pattern10 {

	public static void main(String[] args) {
		int col = 1;
		for (int i = 1; i <= 5; i++) // row
		{
			for (int j = 0; j < col; j++) // col
			{
				System.out.print(i % 2 + " ");
			}
			col++;
			System.out.println();
		}

	}

}
//OUTPUT
/*
1 
0 0
1 1 1
0 0 0 0
1 1 1 1 1
 */

package PatternPrinting;

public class pattern6 {

	public static void main(String[] args) {
		int col = 1;
		for (int i = 0; i < 5; i++) // row
		{
			for (int j = 0; j < col; j++) // col
			{
				System.out.print('*');
			}
			col++;
			System.out.println();
		}

	}

}
//OUTPUT
/*
*
**
***
****
*****
*/
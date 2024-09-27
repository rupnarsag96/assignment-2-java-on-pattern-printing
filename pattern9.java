package PatternPrinting;

public class pattern9 {

	public static void main(String[] args) {
		int col=1;
		for(int i = 1;i<=5;i++) // row
		{
			for (int j =0 ; j <col; j++) // col
			{
				System.out.print(i+j+" ");
			}
			col++;
			System.out.println();
		}

	}

}
//OUTPUT
/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
*/

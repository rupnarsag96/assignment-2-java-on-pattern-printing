package PatternPrinting;

public class pattern8 {

	public static void main(String[] args) {
		int col=2;
		for(int i = 1;i<=5;i++) // row
		{
			for (int j =1 ; j <col; j++) // col
			{
				System.out.print(j+" ");
			}
			col++;
			System.out.println();
		}

	}

}
//OUTPUT
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
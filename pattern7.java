package PatternPrinting;

public class pattern7 {

	public static void main(String[] args) {
	int col=1;
		for(int i = 1;i<=5;i++) // row
		{
			for (int j = 0; j <col; j++) // col
			{
				System.out.print(i);
			}
			col++;
			System.out.println();
		}
	}

}
//OUTPUT
/*
1
22
333
4444
55555
*/
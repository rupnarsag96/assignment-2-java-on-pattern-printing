package PatternPrinting;

public class pattern20 {

	public static void main(String[] args) {
		   for (int i = 0; i < 5; i++) 
		   {
			for (int j = 0; j < 5; j++) 
			{
				if (i == 2 || j == 2)
					System.out.print("X");
				else
					System.out.print("O");
			}
			System.out.println();
		}
	}
}
//OUTPUT
/*
OOXOO
OOXOO
XXXXX
OOXOO
OOXOO 
*/
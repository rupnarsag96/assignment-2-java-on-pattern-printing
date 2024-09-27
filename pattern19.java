package PatternPrinting;

public class pattern19 {

	public static void main(String[] args) {
		//1st
		
	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
			if (i == 2 || j == 2)
				System.out.print("X");
			else
					System.out.print(" ");
		}
			System.out.println();
		}
	}
}


//OUTPUT
/*
  X  
  X  
XXXXX
  X  
  X  
*/
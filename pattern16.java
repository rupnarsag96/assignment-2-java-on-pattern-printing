package PatternPrinting;

public class pattern16 {

	public static void main(String[] args) {
 int i, j,n=6;
 int num = 2 * n - 2;

    for (i = n; i > 0; i--)
    {
    for (j = 0; j < n - i; j++) 
    {
    System.out.print(" ");
    }
     num = num - 2;
    for (j = 0; j < i; j++) 
     {
       System.out.print("*");
     }
     System.out.println();
	}
}
}
//OUTPUT
/*
******
 *****
  ****
   ***
    **
     *

*/
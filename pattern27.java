package PatternPrinting;

public class pattern27 {

	public static void main(String[] args) {
		   int i, j, k, n=6;
           for (i = 1; i <= n; i++) {
           for (j = i; j < n; j++) {
                System.out.print(" ");
            }
           for (k = 1; k <= (2 * i - 1); k++) {
              if (k == 1 || i == n || k == (2 * i - 1)) 
              System.out.print("*");
            else 
              System.out.print(" ");
            }
            System.out.println("");
	}
}
}
//OUTPUT
/*
     *
    * *
   *   *
  *     *
 *       *
***********

*/
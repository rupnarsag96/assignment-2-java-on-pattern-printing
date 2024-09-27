package PatternPrinting;

public class pattern18 {

	public static void main(String[] args) {
          int i, j,n=6;
           for (i = 1; i <= n; i++)
           {
           for (j = 1; j < i; j++) 
           {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
                  System.out.println();

	}
}
}
//OUTPUT
/*
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
*/
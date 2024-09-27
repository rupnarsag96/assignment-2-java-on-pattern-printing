package PatternPrinting;

public class pattern12{

	public static void main(String[] args) {
		
		int i,j,space,s;           
		
		for(space=4,i=1;space>=1 && i<=9;space--,i++)
		{
				for(s=1;s<=space;s++)
				System.out.print(" ");
			
			for(j=1;j<=i;j++)
			{
			 System.out.print('*'+" ");
			}
			System.out.println(" ");
			 	
		}
	}

}
/*

    *  
   * *  
  * * *  
 * * * *  
*/
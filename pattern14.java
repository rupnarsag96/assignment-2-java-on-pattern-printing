package PatternPrinting;

public class pattern14 {

	public static void main(String[] args) {
		
		int i,j,space,s;           
		int c=1;
		for(space=5,i=1;space>=1 && i<=9;space--,i++)
		{
				for(s=1;s<=space;s++)
				System.out.print(" ");
			
			for(j=1;j<=i;j++)
			{
			 System.out.print(c+" ");
			 c++;
			}
			System.out.println(" ");
			 	
		}
	}

}
/*

    1  
    2 3  
   4 5 6  
  7 8 9 10  
11 12 13 14 15  
  
*/
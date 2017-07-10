
public class math {
	
	public static double compute(int n)
	{
		double e = 1.0;
		int factor = 1;
		
		System.out.println("\nComputing with n = " + n);
		
		//System.out.printf("\n\ne is approx. : ", e);
        
        for (int i = 1; i <= n; i++)
         {        	
            factor = i * factor;
            e = e + (1.0 / factor);//1.0 / (double)i;
            System.out.printf("\nFactorial of %d is %d                e = %f", i, factor, e);
          }
        System.out.println("\ne = " + e);
              
        System.out.println();
		
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compute(12);
		//compute(5);
		
			
			       /*int factorial = 5;
			       double e = 1.0;
			       double ex = 10.0;
			 
			       ////////////// Part A ////////////////////
			        System.out.printf("%d! is : ", factorial);
			 
			        for (int count = 1; count < 5; count++)
			         {
			            factorial = factorial * count;
			            System.out.printf("%d.", factorial);
			         }
			        
			       
			        
			        ////////////// Part B ////////////////////
			 
			        System.out.printf("\n\ne is approx. : ", e);
			        
			        for (int factorials = 1; factorials <= 5; factorials++)
			         { 
			             e = e + 1.0 /(double)factorials;
			         }
			         System.out.printf("%f. ", e);
			        ////////////// Part C /////////////////////
			 
			        System.out.printf("\n\ne to the x is approx. : ");
			         for (int count=1; count < 5; count++)
			         {
			             ex = (ex + Math.pow(ex,count))/(factorial);
			         }
			         System.out.printf("%f. \n\n", ex);*/
			        
			    }
			}
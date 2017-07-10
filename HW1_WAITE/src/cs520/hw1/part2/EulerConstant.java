package cs520.hw1.part2;

public class EulerConstant {

	public static double n1 = 2.0;
	public static double n2 = 5.0;
	public static double n3 = 12.0;
	public static int factor = 1;
	public static int i = 0;
	public static double e = 1.0000000000;
	
	
	//set variables and data type
	public static double compute(double n)
	{
		//Variables  
		double e = 1.0000000000;
		int factor = 1;
		int i = 0;
		
		System.out.println("\nComputing with n = " + n);
				        
        for (i = 1; i <= n; i++)
         {        	
            factor = i * factor;
            e = e + (1.0 / factor);
            System.out.printf("\nFactorial of %d is %d                e = %.9f", i, factor, e);
          }
        System.out.printf("\ne = %.9f", e);
              
        System.out.println();
		
		return e;
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		double result1 = compute(n1);
		double result2 = compute(n2);
		//System.out.println(result1);
		
		/*for (i = 1; i <= n; i++)
        {        	
           factor = i * factor;
           e = e + (1.0 / factor);
           System.out.printf("\nFactorial of %d is %d                e = %f", i, factor, e);
         }*/
		
		
		
		
		
		//double result2 = compute(5);
		//double results3 = compute(12);
		
	}

}

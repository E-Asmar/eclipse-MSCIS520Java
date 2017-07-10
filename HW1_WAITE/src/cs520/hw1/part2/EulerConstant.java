package cs520.hw1.part2;

public class EulerConstant {

	//set variables and data type
	public static double compute(int n)
	{
		//Variables  
		double e = 1.0;
		int factor = 1;
		int i = 0;
		
		System.out.println("\nComputing with n = " + n);
				        
        for (i = 1; i <= n; i++)
         {        	
            factor = i * factor;
            e = e + (1.0 / factor);
            System.out.printf("\nFactorial of %d is %d                e = %f", i, factor, e);
          }
        System.out.println("\ne = " + e);
              
        System.out.println();
		
		return e;
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = compute(2);
		System.out.print(result1);
		double result2 = compute(5);
		double results3 = compute(12);
		
	}

}

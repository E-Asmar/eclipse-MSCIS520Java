/*Author: Patrick Waite
 *Description: METCS 520 O1 -- Assignment 1, Part 2
 *program to solve for e given variable n.*/

package cs520.hw1.part2;

public class EulerConstant {

	
	//compute method.
	public static double compute(double n)
	{
		//Variables  
		double e = 1.0000000000;
		int factor = 1;
		int i = 0;
		
		System.out.println("\nComputing with n = " + n);
				        
        for (i = 1; i <= n; i++)
         {        	
            factor = i * factor;//finds the factor for the equation
            e = e + (1.0 / factor);//uses looped factor to calculate e for the i iteration of the loop
            System.out.printf("\nFactorial of %d is %d                e = %.9f", i, factor, e);//prints output using i, factor and resulting e value for loop iteration.
          }
       
        System.out.println();
		
		return e;
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set variables and data type
		double n1 = 2.0;
		double n2 = 5.0;
		double n3 = 12.0;

		//Calling [compute] for the values n1, n2, and n3 (2, 5, and 12 respectively) and printing the results accordingly
		
		//n1 = 2
		double result1 = compute(n1);
		System.out.printf("%.9f\n",result1);
		//n2 = 5
		double result2 = compute(n2);
		System.out.printf("%.9f\n",result2);
		//n3 = 12
		double result3 = compute(n3);
		System.out.printf("%.9f\n", result3);
		
		
		//calculate the difference in e between result1 and result2
		double diff1 = result2 - result1;
		//calculate the difference in e between result2 and result3
		double diff2 = result3 - result2;
		
		//printing the differences 
		System.out.println();
		System.out.println("The difference in e between a factoral of 5 and factoral of 2 is " + diff1);
		System.out.println("The difference in e between a factoral of 12 and factoral of 5 is " + diff2);				
		
		
	}

}

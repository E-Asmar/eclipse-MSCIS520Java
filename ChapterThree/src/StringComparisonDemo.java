
public class StringComparisonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java isn't just for Breakfast.";
		String s2 = "JAVA isn't just for Breakfast.";
		
		if(s1.equals(s2))
			System.out.println("TheTew lines are equal.");
		else
			System.out.println("TheTwo lines are not equal.");
		
		if(s2.equals(s1))
			System.out.println("The two lines are not equal");
		else
			System.out.println("The two lines are not equal");
		if(s1.equalsIgnoreCase(s2))
			System.out.println("but the lines are equal, ignore");
		else
			System.out.println("Lines are not equal, ignore case");
		String s3 = "A cup of Java is a joy forever";
		
		if(s3.compareToIgnoreCase(s1) < 0)
		{
			System.out.println("\""+ s3 + "\"");
			System.out.println("precees");
			System.out.println("\"" + s1 + "\"");
			System.out.println("in alphabetical order");
		}
		else
			System.out.println("s3 doesn't precede s1.");
	}

}

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "get wrecked i am a truck fuckers");
		//String input1 = JOptionPane.showInputDialog("enter me fucksticks");
		//System.out.println(input1);
		
		String 
			first,
			second;
		int 
			num1,
			num2,
			sum;
		
		first = JOptionPane.showInputDialog("enter first number");
		second = JOptionPane.showInputDialog("enter second nubmer");
		
		num1 = Integer.parseInt(first);
		num2 = Integer.parseInt(second);
		
		sum = num1 + num2;
		
		JOptionPane.showMessageDialog(
				null, "Sum is "+sum, "fuckface", 
				JOptionPane.PLAIN_MESSAGE);
		System.exit(0);//
		
	}

}

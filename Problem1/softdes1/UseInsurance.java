package softdes1;

import javax.swing.JOptionPane;

public class UseInsurance
{
	public static void main(String[] args)
	{
		String UserInput;
		int Option;

		UserInput = JOptionPane.showInputDialog(null, "What kind of Insurance?\n 1 - Life \n 2 - Health");
		Option = Integer.parseInt(UserInput);

		if(Option == 1)
		{
			Life lifeInsurance = new Life();
			lifeInsurance.display();
		}
		else
		{
			Health healthInsurance = new Health();
			healthInsurance.display();
		}
	}
}
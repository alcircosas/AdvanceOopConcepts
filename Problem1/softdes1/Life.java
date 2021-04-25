package softdes1;

import javax.swing.JOptionPane;

public class Life extends Insurance
{
	private final double Life_Cost = 36;

	public Life()
	{
		super("Life");
		setCost();
	}

	public void setCost()
	{
		MonthlyCost = Life_Cost;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
	}
}
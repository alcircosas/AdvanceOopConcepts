package softdes1;
import javax.swing.JOptionPane;

public class Health extends Insurance
{
	private final double Health_Cost = 196;

	public Health()
	{
		super("Health");
		setCost();
	}

	public void setCost()
	{
		MonthlyCost = Health_Cost;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
	}
}
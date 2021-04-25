package softdes1;

public abstract class Insurance {
	private String InsuranceType;
	protected double MonthlyCost;
	
	public Insurance(String type)
	{
		InsuranceType = type;
	}

	public String getInsuranceType()
	{
		return InsuranceType;
	}

	public double getMonthlyCost()
	{
		return MonthlyCost;
	}

	public abstract void setCost();
	public abstract void display();
}

package cleancode.interest.constructioncost;

public class compoundinterest
{
	public Double calculate_compoundinterest(Double principle_amount,Double no_of_years,Double rate_of_interest)
	{
		Double compoundinterest;
		compoundinterest=principle_amount * Math.pow(1.0+rate_of_interest/100.0,no_of_years) - principle_amount;
		return compoundinterest;
	}

}


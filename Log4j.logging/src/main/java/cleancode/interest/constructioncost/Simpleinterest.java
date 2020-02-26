package cleancode.interest.constructioncost;

public class Simpleinterest
{
	public Double calculate_simpleinterest(Double principle_amount,Double no_of_years,Double rate_of_interest)
	{
		Double simpleinterest;
		simpleinterest=(principle_amount*no_of_years*rate_of_interest)/100;
		return simpleinterest;
	}

} 
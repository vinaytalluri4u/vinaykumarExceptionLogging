package cleancode.interest.constructioncost;

public class GenerateBill
{
	public double totalcost(String name,double Sqrfoot)
	{
		Gethousetype housetype = new Gethousetype();
		TotalAmount total = housetype.getPlan(name);  
		total.getRate();
		double d=total.calculateBill(Sqrfoot);
		return d;
	}

}

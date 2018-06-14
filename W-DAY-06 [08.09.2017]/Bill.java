abstract class Plan
{
	float rate;
	abstract void get_Rate();
	double calc_Bill()
	{
		return(250*rate);
	}
}

class CommercialPlan extends Plan
{
	void get_Rate()
	{
		rate=5.0f;
	}
}

class DomesticPlan extends Plan
{
	void get_Rate()
	{
		rate=2.5f;
	}
}


class Bill
{
	public static void main(String args[])
	{
		CommercialPlan c=new CommercialPlan();
		c.get_Rate();
		System.out.println("\nBill using Commercial Plan (Rate=5%) = "+c.calc_Bill());
		
		DomesticPlan d=new DomesticPlan();
		d.get_Rate();
		System.out.println("\nBill using Domestic Plan (Rate=2.5%) = "+d.calc_Bill());
	}
}
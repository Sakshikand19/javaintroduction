package bca;

public interface CreditCardMethod {
	void viewCreditAmount();
	void useCard();
	void payCredit();
	void increaseLimit();

}
class SilverCardCustomer implements CreditCardMethod
{
	String name;
	double Cardnumber;
	int creditamount=0;
	int creditlimit=50000;
	
	public static void main(String[] args)
	{ 
		
	}
		
}
class bank{
	static int dollar;

	static void setDollar(int a){
		dollar = a;
	}
	public void amount(int b){
		System.out.println("amounts "+ (b*dollar));
	}
}

class TestBank{
	public static void main(String args[]){
//refrence variable below
		bank hsbc,natwest,nbs;
// creates objects
		hsbc=new bank();
		natwest=new bank();
		nbs=new bank();

		hsbc.setDollar(100);
		nbs.setDollar(2);
		natwest.setDollar(2);
		natwest.amount(2);
	}
}
class Result{
	int phy,chem,total;

	public void students(){
		int total;
		total = phy+chem;
		System.out.println("total is: " + total);
		if (total > 300){
			System.out.println("passed");
		}
		else{
			System.out.println("not p");
		}
	}
}

class school{
	public static void main(String args[]){
		Result peter,james;
		peter = new Result();
		james = new Result();

		peter.chem=100;
		peter.phy=100;
		james.phy=50;
		james.chem=200;

		peter.students();
		james.students();
	}
}
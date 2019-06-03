class Results{
	public static void main(String args[]){
		float per;
		int chem,phys,bio,total;

		chem=10;phys=20;bio=30;
		total=chem+phys+bio;
		per=total+100/10;
		System.out.println("Total: " + total);
		System.out.println("percentage" + per);

		if (total >=60){
			System.out.println("passed");
		}
		else{
			System.out.println("not passed");
		}
	}
}
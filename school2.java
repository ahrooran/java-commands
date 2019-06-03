class Result{
	private int phy,chem,math;

	public void physics(int p){
		if (p>0 && p<=150){
			phy=p;
			System.out.println("Physics: " + p);
		}
		else{
			phy=-1;
			System.out.println("invlaid entry");
		}
	}

	public void chemistry(int c){
		if (c>0 && c<=150){
			chem=c;
			System.out.println("Chemistry: " + c);
		}
		else{
			chem=-1;
			System.out.println("invalid entry");
		}
	}

	public void maths(int m){
		if (m>0 && m<=150){
			math=m;
			System.out.println("Maths: " + m);
		}
		else{
			math=-1;
			System.out.println("invalid entry");
		}
	}
	public void showResult(){
		int total;
		total=phy+chem+math;
		if(phy ==-1 || chem ==-1 || math==-1){
			System.out.println("no results");
		}

		else{
			System.out.println("Total Score: "+ total);

		}
	}
}


class school2{
	public static void main(String args[]){
		Result peter,james;
		peter = new Result();
		james = new Result();

		peter.physics(100);
		peter.chemistry(100);
		peter.maths(100);

		james.physics(50);
		james.chemistry(100);
		james.maths(100);

		peter.showResult();
		james.showResult();
	}
}
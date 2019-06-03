class Result{
	private int twos,b;

	public void t_t(int t){
		if (t >=0 && t<=100){
			twos=t;
			System.out.println("The times tables for " + t + " is:");
			int c;
			c=1;
			while(c<=12){
				System.out.println(twos+" x "+c+" = "+ twos*c);
				c+=1;
			}
		}
		if (t>100){
			System.out.println("Number out of bounds");
		}	
	}
}

class timestables{
	public static void main(String args[]){
		Result peter;
		peter = new Result();

		peter.t_t(34);

		//peter.showResult();
	}
}

class exception{
	public static void main(String args[]){
		int a,b,c;
		a = b = c = 0;
		try{
			a =4;
			b = 0;
			c= a/b;
			System.out.println("fv");
		}
		catch(ArithmeticException eh1){
			System.out.println("issue with dividing");
		}
	}

}
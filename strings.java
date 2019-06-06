class text{

	public void message(){
		String a;
		a = ("RockStar");
	}
}

class format extends text{
	public void random(){
		System.out.println("EndsWith character 'r': " + a.endsWith("r"));
	}
}

class strings{
	public static void main (String args []){
		format x = new format();
		x.random();
	}
}


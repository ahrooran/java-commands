class math{
	int a;

	public void message(){
		int a;
		a = 20;
		this.a = 15;
		System.out.println("result a "+ a);
	}

	public void message2(){
		this.a=0;
		System.out.println(a);
	}
}

class math_this{
	public void main (String args []){
		math x = new math();
		math y = new math();
		x.a=25;
		x.message2(2);
		x.message(22);
	}
}


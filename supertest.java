class one extends first{
	public one(){
		System.out.println(1);
	}
}

class two extends one{
	public two(int a){
		System.out.println(2);
	}

	public two(){
		super(7);
		System.out.println(3);
	}
}
class first extends second{
	public first(){
		System.out.println(6);
	}
}

class second{
	public second(){
		System.out.println(7);
	}
}

class supertest{
	public static void main(String args[]){
		two x = new two();
	}
}
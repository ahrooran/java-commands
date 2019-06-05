class one{
	
	public void msg1(){
		System.out.println("hello");
	}
}

class two extends one{
	public void msg2(){
		System.out.println("manchester");
	}	
}

class ref_inheritence{
	public static void main(String args[]){
		one ref;
		ref = new two();
		ref.msg2();
	}
}
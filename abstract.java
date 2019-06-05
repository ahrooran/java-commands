abstract class calculations{
	abstract public void tax(int salary);

	public void msg(){
		System.out.println("hello");
	}
}

class calculations2 extends calculations{
	public void tax(int salary){
		float result;
		result=salary*21/100;
		System.out.println(result);
	}
}

class abstractt{
	public static void main(String args[]){
		calculations2 sal;
		sal = new calculations2();
		sal.tax(20000);
	}
}
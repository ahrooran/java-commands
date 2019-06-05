// class maths{
// 	public void add(int a, int b){
// 		int result=a+b;
// 		System.out.println("result" + result);
// 	}
// 	public void subtraction(int a, int b){
// 		System.out.println("a/b");
// 	}
// }

// class maths2{
// 	public void times(int x, int y){
// 		System.out.println("result: "+ (x+y));
// 	}

// 	public void subtraction(int x, int y){
// 		System.out.println("the result is "+ (x-y));
// 	}
// }

class inherit{
	public static void main(String args[]){

		maths2 num = new maths2();
	
		num.subtraction(10,10);


		maths2 num2 = new maths2();
		num2.times(10,10);

		maths2 num3 = new maths2();
		num3.msg();
	
	}
}
class Test{
	public static void main(String args[]){

		First Ref;

		Ref = new First();

		Ref.x=15;
		Ref.y=20;

		System.out.println(Ref.x+Ref.y);
	}
}
class First{
	int x;
	int y;
}

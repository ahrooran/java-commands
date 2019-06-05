abstract class draw{
	abstract public void drawing();
}

class line extends draw{
	public void drawing(){
		System.out.println("drawing line");
	}
}

class circle extends draw{
	public void drawing(){
		System.out.println("drawing circle");
	}
}

class testing{
	public static void main(String args []){
		line x = new line();
		letsDraw(x);
		circle c = new circle();
		letsDraw(c);
	}
	public static void letsDraw(draw d){
	d.drawing();
}

}
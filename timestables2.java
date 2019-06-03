import java.util.Scanner;

class timestables2{
	public static void main(String args[]){
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter three numbers: ");

	int firstNum = reader.nextInt();
	int secondNum = reader.nextInt();
	int numOf = reader.nextInt();
	int result;
	int i =1;

	while(i < numOf){
		result=firstNum*secondNum;
		System.out.println(firstNum + " x " + secondNum + " = " + result);
		firstNum++;
		i+=1;
	}
	}
}

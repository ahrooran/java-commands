import java.util.Scanner;

class Bank{
	private int amount;
	public void Deposit(int money){
		amount += money;
	}

	public void Widthraw (int money){
		if(money > amount){
			amount -= money;
		}
		else{
			System.out.println("not enough ");
		}
	}

	public void Balance(){
		System.out.println("your balance is "+amount);
	}

	public Bank(){
		System.out.println("hello");
	}
	public void showDash(){
		System.out.println("Total: "+ amount);

	}
}



class nbs{
	public static void main(String args[]){
	// Scanner reader = new Scanner(System.in);
	// System.out.println("Enter amount: ");
	// int amount = reader.nextInt();
	
	Bank ref;
	ref = new Bank();
	ref.Deposit(100);
	}
}
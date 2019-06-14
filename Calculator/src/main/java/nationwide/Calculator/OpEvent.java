package nationwide.Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpEvent implements ActionListener{
	TextField T1;
	int FirstNumber;
	int Second;
	int Result;
	String opt;
	
	public OpEvent(TextField A) {
		T1=A;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		FirstNumber=Integer.parseInt(T1.getText());
		Button btn =(Button) e.getSource();
		opt = btn.getLabel();
		if(opt.contentEquals("C")) {
			T1.setText("");
		}
		else {
			FirstNumber=Integer.parseInt(T1.getText());
			Second=Integer.parseInt(T1.getText());
			if (opt.contentEquals("=")) {
				if (opt.contentEquals("+")) {
					
					Result = FirstNumber + Second;
					
				}
				
				
			System.out.println(Result);
			//T1.setText(Integer.toString(Result));
			//Second=Integer.parseInt(T1.getText());
			//Result = FirstNumber + Second;
			}
			
			
			if (opt.contentEquals("+")) {
				T1.setText("");

				System.out.println(Result);
				
			}
		}
		
	}

}

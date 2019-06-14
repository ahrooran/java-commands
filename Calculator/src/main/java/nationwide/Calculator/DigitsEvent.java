package nationwide.Calculator;

import java.awt.Button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitsEvent implements ActionListener{
	TextField T1;
	
	public DigitsEvent(TextField T) {
	T1=T;
	}

	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		T1.setText(T1.getText() + btn.getLabel());
		
	}

}

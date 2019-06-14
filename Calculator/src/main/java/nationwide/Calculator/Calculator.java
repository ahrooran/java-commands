package nationwide.Calculator;

import java.awt.*;

public class Calculator {
    
    public static void main(String xyz[]) {
    Frame F = new Frame();
    Panel P1 = new Panel();
    Panel P2 = new Panel();
        
    TextField T1 = new TextField(20);
    DigitsEvent DE=new DigitsEvent(T1);
    OpEvent OE=new OpEvent(T1);
    
    Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
    Button Btn_Add, Btn_Subtract, Btn_Multiply, Btn_Divide;
    Button Btn_Equals, Btn_Clear;
    
   B0 = new Button("0");
   B1 = new Button("1");
   B2 = new Button("2");
   B3 = new Button("3");
   B4 = new Button("4");
   B5 = new Button("5");
   B6 = new Button("6");
   B7 = new Button("7");
   B8 = new Button("8");
   B9 = new Button("9");
   B1.addActionListener(DE);
   B2.addActionListener(DE);
   B3.addActionListener(DE);
   B4.addActionListener(DE);
   B5.addActionListener(DE);
   B6.addActionListener(DE);
   B7.addActionListener(DE);
   B8.addActionListener(DE);
   B9.addActionListener(DE);

   Btn_Add = new Button("+");
   Btn_Subtract = new Button("-");
   Btn_Multiply = new Button("x");
   Btn_Divide = new Button("/");

   Btn_Clear = new Button("C");
   Btn_Equals = new Button("=");

   Btn_Add.addActionListener(OE);
   Btn_Subtract.addActionListener(OE);
   Btn_Multiply.addActionListener(OE);
   Btn_Divide.addActionListener(OE);
   Btn_Clear.addActionListener(OE);
   Btn_Equals.addActionListener(OE);


    GridLayout G = new GridLayout(4,4);
    P2.setLayout(G);
        
    P1.add(T1);
    P2.add(B0);
    P2.add(B1);
    P2.add(B2);
    P2.add(Btn_Add);
    P2.add(B3);
    P2.add(B4);
    P2.add(B5);
    P2.add(Btn_Subtract);
    P2.add(B6);
    P2.add(B7);
    P2.add(B8);
    P2.add(Btn_Multiply);
    P2.add(B9);
    P2.add(Btn_Clear);
    P2.add(Btn_Equals);
    P2.add(Btn_Divide);
    
    F.add(P1,BorderLayout.NORTH);
    F.add(P2,BorderLayout.CENTER);
    
      
   F.setSize(400,400);
   F.setVisible(true);
    }
}
//	
//    int c,n;
//    String s1,s2,s3,s4,s5;
//
//
//
//    GridLayout g;
//    Calculator()
//    {
//        
//        T = new TextField(20);
//        P2.add(T);
//        g = new GridLayout(4,4,10,20);
//        P1.setLayout(g);
//        P1.add(b1);P1.add(b2);P1.add(b3);P1.add(b4);P1.add(b5);P1.add(b6);P1.add(b7);P1.add(b8);P1.add(b9);
//        P1.add(b10);P1.add(b11);P1.add(b12);P1.add(b13);P1.add(b14);P1.add(b15);P1.add(b16);P1.add(b17);
//        f.add(P1,BorderLayout.SOUTH);
//        f.add(P2,BorderLayout.NORTH);
//        f.setSize(300,300);
//        f.setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        if(e.getSource()==b1)
//        {
//            s3 = T.getText();
//            s4 = "0";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b2)
//        {
//            s3 = T.getText();
//            s4 = "1";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b3)
//        {
//            s3 = T.getText();
//            s4 = "2";
//            s5 = s3+s4;
//            T.setText(s5);
//        }if(e.getSource()==b4)
//        {
//            s3 = T.getText();
//            s4 = "3";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b5)
//        {
//            s3 = T.getText();
//            s4 = "4";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b6)
//        {
//            s3 = T.getText();
//            s4 = "5";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b7)
//        {
//            s3 = T.getText();
//            s4 = "6";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b8)
//        {
//            s3 = T.getText();
//            s4 = "7";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b9)
//        {
//            s3 = T.getText();
//            s4 = "8";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b10)
//        {
//            s3 = T.getText();
//            s4 = "9";
//            s5 = s3+s4;
//            T.setText(s5);
//        }
//        if(e.getSource()==b11)
//        {
//            s1 = T.getText();
//            T.setText("");
//            c=1;
// 
//        }
//        if(e.getSource()==b12)
//        {
//            s1 = T.getText();
//            T.setText("");
//            c=2;
// 
//        }
//        if(e.getSource()==b13)
//        {
//            s1 = T.getText();
//            T.setText("");
//            c=3;
// 
//        }
//        if(e.getSource()==b14)
//        {
//            s1 = T.getText();
//            T.setText("");
//            c=4;
// 
//        }
//        if(e.getSource()==b15)
//        {
//            s1 = T.getText();
//            T.setText("");
//            c=5;
// 
//        }
//        if(e.getSource()==b16)
//        {
//            s2 = T.getText();
//            if(c==1)
//            {
//                n = Integer.parseInt(s1)+Integer.parseInt(s2);
//                T.setText(String.valueOf(n));
//            }
//            else
//            if(c==2)
//            {
//                n = Integer.parseInt(s1)-Integer.parseInt(s2);
//                T.setText(String.valueOf(n));
//            }
//            else
//            if(c==3)
//            {
//                n = Integer.parseInt(s1)*Integer.parseInt(s2);
//                T.setText(String.valueOf(n));
//            }
//            if(c==4)
//            {
//                try
//                {
//                    int p=Integer.parseInt(s2);
//                    if(p!=0)
//                    {
//                                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
//                    T.setText(String.valueOf(n));
//                     }
//                     else
//                        T.setText("infinite");
// 
//                }
//                catch(Exception i){}
//            }
//            if(c==5)
//            {
//                n = Integer.parseInt(s1)%Integer.parseInt(s2);
//                T.setText(String.valueOf(n));
//            }
//        }
//        if(e.getSource()==b17)
//        {
//            T.setText("");
//        }
//    }
// 
//   // public static void main(String[] abc)
//    {
//        Calculator v = new Calculator();
//    }
//}
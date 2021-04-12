package laptask2;

import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener{

    //declaration component
    JLabel t1, t2, ans, total;
    JButton plus,minus, multiply, divide;
    JTextField num1, num2;

    Calculator(){
        JFrame f= new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create component and set position
        t1 = new JLabel("Input 1 : ");
        t1.setBounds(50,50,100,30);
        num1=new JTextField();
        num1.setBounds(150,50,250,30);
        t2 = new JLabel("Input 2 : ");
        t2.setBounds(50,100,100,30);
        num2=new JTextField();
        num2.setBounds(150,100,250,30);
        ans = new JLabel("Answer : ");
        ans.setBounds(50,150,100,30);
        total= new JLabel("ans");
        total.setBounds(150,150,250,30);
        //total.setEditable(false);//disabling text box
        plus=new JButton("+");
        plus.setBounds(50,250,50,50);
        minus=new JButton("-");
        minus.setBounds(150,250,50,50);
        multiply = new JButton("*");
        multiply.setBounds(250,250,50,50);
        divide = new JButton("/");
        divide.setBounds(350,250,50,50);

        //action listen for calculation
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        //add component to frame
        f.add(t1);
        f.add(t2);
        f.add(ans);
        f.add(num1);
        f.add(num2);
        f.add(plus);
        f.add(minus);
        f.add(multiply);
        f.add(divide);
        f.add(total);

        f.setSize(500,500); //frame size
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String n1=num1.getText();
        String n2=num2.getText();
        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        int c=0;

        //calculation
        if(e.getSource()==plus){
            c = a + b;
        }else if(e.getSource()==minus){
            c = a - b;
        }else if(e.getSource()==multiply){
            c = a * b;
        }else if(e.getSource()==divide){
            c = a / b;
        }
        //result and set text
        String result=String.valueOf(c);
        total.setText(result);
    }
    public static void main(String[] args) {

        new Calculator();//call constructor as frame
    }
}
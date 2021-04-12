package laptask2;

import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener{
    JButton plus,minus, multiply, divide;
    JTextField num1, num2, total;

    Calculator(){
        JFrame f= new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        num1=new JTextField();
        num1.setBounds(50,50,150,20);
        num2=new JTextField();
        num2.setBounds(50,100,150,20);
        total=new JTextField();
        total.setBounds(50,150,150,20);
        total.setEditable(false);
        plus=new JButton("+");
        plus.setBounds(50,200,40,40);
        minus=new JButton("-");
        minus.setBounds(120,200,40,40);
        multiply = new JButton("*");
        multiply.setBounds(190,200,40,40);
        divide = new JButton("/");
        divide.setBounds(160,200,40,40);

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        f.add(num1);
        f.add(num2);
        f.add(plus);
        f.add(minus);
        f.add(multiply);
        f.add(divide);
        f.add(total);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1=num1.getText();
        String s2=num2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==plus){
            c = a + b;
        }else if(e.getSource()==minus){
            c = a - b;
        }else if(e.getSource()==multiply){
            c = a * b;
        }else if(e.getSource()==divide){
            c = a / b;
        }
        String result=String.valueOf(c);
        total.setText(result);
    }
    public static void main(String[] args) {

        new Calculator();
    }
}
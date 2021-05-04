package laptask2;

import javax.swing.*;


class Calculator extends JFrame{

    //declaration component
    JLabel t1, t2, ans, total;
    JButton plus, minus, multiply, divide;
    JTextField num1, num2;

    public static void main(String[] args) {
        JFrame frame= new Calculator("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Calculator(String str){
        super(str);
        JFrame f= new JFrame("Calculator");

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

        plus=new JButton("+");
        plus.setBounds(50,250,50,50);

        minus=new JButton("-");
        minus.setBounds(150,250,50,50);

        multiply = new JButton("*");
        multiply.setBounds(250,250,50,50);

        divide = new JButton("/");
        divide.setBounds(350,250,50,50);


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

}
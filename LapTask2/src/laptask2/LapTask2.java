/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptask2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hafiz
 */
class Calculator extends JFrame {
    public static void main(String[] args) {
        JFrame f = new Calculator("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);//size for frame
        f.setVisible(true);
    }

    JButton plus,minus, multiply, divide;
    JTextField num1, num2, total;
    Dimension IN, BTN, T;

    public Calculator(String str){
        super(str);
        JFrame f = new JFrame();
        JPanel panelTitle = new JPanel();
        f.add(panelTitle, BorderLayout.CENTER);

        IN = new Dimension(30,50);
        BTN = new Dimension(30, 50);
        T = new Dimension(30, 50);



        //panel for input number
        JPanel inputNum = new JPanel(new GridLayout(1,2));
        num1 = new JTextField();
        num2 = new JTextField();

        //set size for input number
        num1.setSize(IN);
        num2.setSize(IN);

        inputNum.add(num1);
        inputNum.add(num2);

        //panel for button
        JPanel operationBtn = new JPanel(new GridLayout(1,4));
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");

        //set size for button
        plus.setSize(BTN);
        minus.setSize(BTN);
        multiply.setSize(BTN);
        divide.setSize(BTN);

        operationBtn.add(plus);
        operationBtn.add(minus);
        operationBtn.add(multiply);
        operationBtn.add(divide);

        //panel for total
        JPanel totalNum = new JPanel(new GridLayout(1,1));
        total = new JTextField();

        //set size for total number
        total.setSize(T);

        totalNum.add(total);

        add(inputNum, BorderLayout.NORTH);
        add(operationBtn, BorderLayout.CENTER);
        add(totalNum, BorderLayout.SOUTH);


    }
    
}

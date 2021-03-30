
package calculator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Calculator extends Frame{
    public static void main(String[] args) {
        Frame f = new Calculator("Calculator");
        f.setSize(600,600);
        f.setVisible(true);
    }

    public Calculator(String str){
        super(str);
        setLayout(new FlowLayout());

        TextField num1,num2;

        num1 = new TextField();
        num2 = new TextField();



    }
    
}

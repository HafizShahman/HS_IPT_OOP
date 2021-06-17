
/**
 *
 * @author Moo-Nitro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.border.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PizzaCalculator implements ActionListener, ItemListener {

    JRadioButton smallSize, mediumSize, largeSize, crust1, crust2, crust3;
    JCheckBox pepperoni, sausage, salami, mushrooms, anchovies, olives;
    JTextField txtTotal;
    JButton btnCalculate, btnExit;
    double price = 0.0;
    double smallPrice = 4.99;
    double mediumPrice = 6.99;
    double largePrice = 8.99;
    double Handtosses = 2.0;
    double thincrust = 1.0;
    double panpizza = 0.0;
    double pepperoniPrice = 0.3;
    double sausagePrice = 0.6;
    double salamiPrice = 1.0;
    double mushroomsPrice = 0.8;
    double anchoviesPrice = 0.4;
    double olivesPrice = 0.9;
    DecimalFormat decimal = new DecimalFormat("#.##");//set decimal format

    public PizzaCalculator() {
        //Create frame and panel title
        JFrame frame = new JFrame("Pizza Calculator");
        JPanel panelTitle = new JPanel();
        frame.add(panelTitle, BorderLayout.NORTH);

        //panel Crust
        JPanel panelCrust = new JPanel(new GridLayout(1, 3));
        crust1 = new JRadioButton("Hand tosses");
        crust2 = new JRadioButton("Thin crust");
        crust3 = new JRadioButton("Pan pizza");
        panelCrust.setBorder(new TitledBorder("Crust"));//set title border
        //add component to panel
        panelCrust.add(crust1);
        panelCrust.add(crust2);
        panelCrust.add(crust3);

        ButtonGroup bgCrust = new ButtonGroup();
        bgCrust.add(crust1);
        bgCrust.add(crust2);
        bgCrust.add(crust3);
        //End of panel Crust

        //panel Size
        JPanel panelSize = new JPanel(new GridLayout(1, 3));
        smallSize = new JRadioButton("Small");
        mediumSize = new JRadioButton("Medium");
        largeSize = new JRadioButton("Large");
        panelSize.setBorder(new TitledBorder("Size"));//set title border
        //add component to panel
        panelSize.add(smallSize);
        panelSize.add(mediumSize);
        panelSize.add(largeSize);
        //button group for radio button
        ButtonGroup bgSize = new ButtonGroup();
        bgSize.add(smallSize);
        bgSize.add(mediumSize);
        bgSize.add(largeSize);
        //End of panel Size

        //panel toppings
        JPanel panelToppings = new JPanel(new GridLayout(3, 2));
        pepperoni = new JCheckBox("Pepperoni");
        sausage = new JCheckBox("Sausage");
        salami = new JCheckBox("Salami");
        mushrooms = new JCheckBox("Mushrooms");
        anchovies = new JCheckBox("Anchovies");
        olives = new JCheckBox("Olives");
        //add component to panel
        panelToppings.setBorder(new TitledBorder("Toppings"));//set title border
        panelToppings.add(pepperoni);
        panelToppings.add(sausage);
        panelToppings.add(salami);
        panelToppings.add(mushrooms);
        panelToppings.add(anchovies);
        panelToppings.add(olives);
        //End of panel toppings

        JPanel newPanel = new JPanel(new BorderLayout());
        newPanel.add(panelCrust, BorderLayout.NORTH);
        newPanel.add(panelSize, BorderLayout.CENTER);
        newPanel.add(panelToppings, BorderLayout.SOUTH);
        frame.add(newPanel, BorderLayout.CENTER);

        //panel button
        JPanel panelButton = new JPanel();
        btnCalculate = new JButton("Calculate");
        btnExit = new JButton("Exit");
        txtTotal = new JTextField("$", 10);
        panelButton.add(btnCalculate);
        panelButton.add(txtTotal);
        panelButton.add(btnExit);
        frame.add(panelButton, BorderLayout.SOUTH);

        //add itemlistener to component
        smallSize.addItemListener(this);
        mediumSize.addItemListener(this);
        largeSize.addItemListener(this);
        crust1.addItemListener(this);
        crust2.addItemListener(this);
        crust3.addItemListener(this);
        pepperoni.addItemListener(this);
        sausage.addItemListener(this);
        salami.addItemListener(this);
        mushrooms.addItemListener(this);
        anchovies.addItemListener(this);
        olives.addItemListener(this);
        btnCalculate.addActionListener(this);
        btnExit.addActionListener(e -> System.exit(0));

        //add panel to frame
        frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //main method
    public static void main(String[] args) {

        PizzaCalculator Pizza = new PizzaCalculator();
    }

    //
    public void actionPerformed(ActionEvent ae) {
        String text = String.valueOf("$" + decimal.format(price));
        txtTotal.setText(text);
    }

    //
    public void itemStateChanged(ItemEvent ie) {
        //Size pizza
        if (smallSize.isSelected()) {
            price = smallPrice;
        } else if (mediumSize.isSelected()) {
            price = mediumPrice;
        } else if (largeSize.isSelected()) {
            price = largePrice;
        }

        //Crust type
        if (crust1.isSelected()) {
            price += Handtosses;
        }
        if (crust2.isSelected()) {
            price += thincrust;
        }
        if (crust3.isSelected()) {
            price += panpizza;
        }

        //Toppings type
        if (pepperoni.isSelected()) {
            price += pepperoniPrice;
        }
        if (sausage.isSelected()) {
            price += sausagePrice;
        }
        if (salami.isSelected()) {
            price += salamiPrice;
        }
        if (mushrooms.isSelected()) {
            price += mushroomsPrice;
        }
        if (anchovies.isSelected()) {
            price += anchoviesPrice;
        }
        if (olives.isSelected()) {
            price += olivesPrice;
        }

    }
}

/**
 *
 * @author
 */

import java.awt.*;

class PizzaOrderForm extends Frame{
    
    //main method
    public static void main (String []args){
        Frame frame = new PizzaOrderForm("Pizza Calculator");
        //add panel to frame
        frame.setSize(550, 400);
        frame.setVisible(true);
    }                
    
    
    Checkbox smallSize, mediumSize, largeSize;
    Checkbox pepperoni, italianSausage,salami,mushrooms,anchovies, olives;
    TextField txtTotal;
    Button btnCalculate,btnExit;
    Label lblPrice;
       
    public PizzaOrderForm(String str){   
        super(str);
        //Create frame and panel title
        Frame frame = new Frame("Pizza Order Form");
        Panel panelTitle = new Panel();
        frame.add(panelTitle, BorderLayout.NORTH);
        
        //panel Size
        Panel panelSize = new Panel(new GridLayout(1,3));
        CheckboxGroup sizegroup = new CheckboxGroup();
        
        //add component to panel
        panelSize.add(new Checkbox ("Small", sizegroup, true));
        panelSize.add(new Checkbox ("Medium", sizegroup, false));
        panelSize.add(new Checkbox ("Large", sizegroup, false));
        
        //panel toppings
        Panel panelToppings = new Panel(new GridLayout(4,2));    
        pepperoni = new Checkbox("Pepperoni");
        italianSausage = new Checkbox("Sausage");
        salami = new Checkbox("Salami");
        mushrooms = new Checkbox("Mushrooms");
        anchovies = new Checkbox("Anchovies");
        olives = new Checkbox("Olives");
        //add component to panel
        panelToppings.add(pepperoni);
        panelToppings.add(italianSausage);
        panelToppings.add(salami);
        panelToppings.add(mushrooms);
        panelToppings.add(anchovies);
        panelToppings.add(olives);
        //End of panel toppings

        //panel button
        Panel panelButton = new Panel(new GridLayout(1,3));        
        btnCalculate = new Button("Calculate");
        btnExit = new Button ("Exit");
        lblPrice = new Label("Total");
        txtTotal = new TextField("$");
        panelButton.add(btnCalculate);
        panelButton.add(txtTotal);
        panelButton.add(btnExit);
        
        
        Panel newPanel = new Panel(new BorderLayout(1,3));
        newPanel.add(panelSize, BorderLayout.NORTH);
        newPanel.add(panelToppings, BorderLayout.CENTER);
        newPanel.add(panelButton, BorderLayout.SOUTH);
        frame.add(newPanel, BorderLayout.CENTER);
        
        add(newPanel);
       }
       
}
package Button;

import java.awt.*;

class Bton extends Frame{

    public static void main(String[] args){
        Frame f = new Bton("New Button");
        f.setSize(400,700);
        f.setVisible(true);
    }

    public Bton(String str) {
        super(str);
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Name : ");
        TextField tname = new TextField(20);

        Button okButton = new Button("OK");

        add(nameLabel);
        add(tname);
        add(okButton);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1E;

/**
 *
 * @author hafiz
 */
import java.awt.*;

class Info extends Frame {

    public static void main(String[] args) {
        Frame f = new Info("Information of Student");
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public Info(String str) {
        super(str);
        setLayout(new FlowLayout());
        Label xLabel = new Label("Nama :");
        TextField tname = new TextField(20);
        Label yLabel = new Label("Semester :");
        TextField tsem = new TextField(2);
        Label zLabel = new Label("Alamat :");
        TextArea talamat = new TextArea(5, 20);

        Label gender = new Label("Gender:");
        Checkbox p1 = new Checkbox("Male");
        Checkbox p2 = new Checkbox("Female");
        Label warna = new Label("Favourite Colour");
        List warna1 = new List(5, false);
        String w[] = {"Black", "Blue", "Cyan", "Gray",
            "Green"};
        Button okbutton = new Button("OK");
        add(xLabel);
        add(tname);
        add(yLabel);
        add(tsem);
        add(zLabel);
        add(talamat);
        add(gender);
        add(p1);
        add(p2);
        add(warna);
        for (int i = 0; i < w.length; i++) {
            warna1.add(w[i]);
        }
        add(warna1);
        add(okbutton);
    }
}

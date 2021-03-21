/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act1G;

/**
 *
 * @author hafiz
 */
import java.awt.*;
import java.awt.geom.*;

class AWTDialog extends Frame {

    Dialog d1, d2;

    public AWTDialog() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setTitle("AWT Dialog in Java Example");

        // A dialog with current frame as parent
        d1 = new Dialog(this);

        // Set the title
        d1.setTitle("Dialog 1");

        d1.setSize(400, 400);

        // Hide title bar and borders
        d1.setUndecorated(true);

        // Set background for dialog
        d1.setBackground(Color.GRAY);

        // Set opacity
        d1.setOpacity(0.4f);

        // Set d1 location relative to desktop
        // d1 appears at center of screen
        d1.setLocationRelativeTo(null);

        // Set some shape to d1
        RoundRectangle2D.Double r = new RoundRectangle2D.Double(0, 0, 400, 400, 20, 20);

        // Set the rounded rectangle shape
        d1.setShape(r);

        d1.setVisible(true);

        // Create a dialog with current frame as parent
        // with title Simple Dialog
        d2 = new Dialog(d1, "Simple Dialog");
        // d1 cannot be made active if d2 isn't closed
        // this is theme behind setting a dialog modal
        // default value is false
        d2.setModal(true);

        // Set size
        d2.setSize(150, 150);

        // Set layout
        d2.setLayout(new FlowLayout());

        // Make it non resizable
        d2.setResizable(false);

        // Set d2 location relative to d1
        // d2 appears at center of d1
        d2.setLocationRelativeTo(d1);

        // Add some components
        d2.add(new Button("Button"));
        d2.add(new Checkbox("Checkbox"));
        d2.add(new TextField(20));

        // Show the dialog
        d2.setVisible(true);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        new AWTDialog();
    }
}

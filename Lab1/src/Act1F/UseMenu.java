package Act1F;

import java.awt.*;

class UseMenu extends Frame {

    public static void main(String[] args) {
        Frame f = new UseMenu("Fast Food");
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public UseMenu(String str) {

        super(str);
        MenuBar b = new MenuBar();
        Menu a = new Menu("Menu Pizza");
        a.add(new MenuItem("Large Pan Pizza"));
        a.addSeparator();
        a.add(new MenuItem("Medium Pan Pizza"));
        a.addSeparator();
        a.add(new MenuItem("Small Pan Pizza"));
        a.addSeparator();
        b.add(a);
        setMenuBar(b);
    }
}

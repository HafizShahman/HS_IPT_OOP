package exercise;

import java.awt.*;
class MenuButton extends Frame{

    public static void main(String[] args) {
        Frame f = new MenuButton("Menu Button");
        f.setSize(300,300);
        f.setVisible(true);
    }

    public MenuButton(String str){
        super(str);
        MenuBar bar = new MenuBar(); //create menu bar

        Menu a = new Menu("File");
        a.add(new MenuItem("New"));
        a.add(new MenuItem("Open"));
        a.addSeparator();
        a.add(new MenuItem("Save"));
        Menu c = new Menu ("Save As"); //add submenu in sub
        //a.add(c = new Menu("Save As.."));

        a.add(c);
        c.add(new MenuItem("PDF"));
        c.add(new MenuItem("Word"));
        c.add(new MenuItem("Slide"));


        Menu b = new Menu("Edit");
        b.add(new MenuItem("Color"));
        b.add(new MenuItem("Design"));
        b.addSeparator();
        b.add(new MenuItem("Copy"));
        b.add(new MenuItem("Paste"));

        bar.add(a);
        bar.add(b);
        setMenuBar(bar);
    }

}

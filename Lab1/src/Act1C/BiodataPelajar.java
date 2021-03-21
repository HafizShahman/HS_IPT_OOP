package Act1C;

import java.awt.*;


public class BiodataPelajar extends Frame{

    public BiodataPelajar (String str){
        super (str);
        setLayout(new FlowLayout());

        Label nameLabel = new Label("Name : ");
        TextField tname = new TextField(20);

        Label semLabel = new Label("Semester : ");
        TextField tsem = new TextField(4);

        Label icLabel = new Label("No. Kad Pengenalan : ");
        TextField tic = new TextField(12);

        Label telLabel = new Label("No. Telefon : ");
        TextField ttel = new TextField(15);

        add(nameLabel);
        add(tname);
        add(semLabel);
        add(tsem);
        add(icLabel);
        add(tic);
        add(telLabel);
        add(ttel);


    }

}
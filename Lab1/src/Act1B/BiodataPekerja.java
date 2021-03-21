package Act1B;


import java.awt.*;

public class BiodataPekerja extends Frame {

    public BiodataPekerja(String str) {
        super(str);
        setLayout(new FlowLayout());

        Label xLabel = new Label("Nama :");
        TextField tname = new TextField(20);
        Label yLabel = new Label("No. Staf :");
        TextField tstaf = new TextField(2);
        Label zLabel = new Label("No. Kad Pengenalan :");
        TextField tkp = new TextField(12);
        Label aLabel = new Label("Jawatan:");
        TextField tjawatan = new TextField(15);

        add(xLabel);
        add(tname);
        add(yLabel);
        add(tstaf);
        add(zLabel);
        add(tkp);
        add(aLabel);
        add(tjawatan);

    }
}

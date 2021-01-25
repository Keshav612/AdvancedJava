//Keshav Mishra
import java.awt.*;
import java.awt.event.WindowListener;
public class Awt extends Frame{
    public static void main(String[] args) {
        Awt a = new Awt();
       
    }
    Awt()
    {
        Button b = new Button("CLick me");
        setTitle("Hello! I am Frame");
        b.setBounds(30,200,80,30);
        add(b);
        setSize(600,300);
        setLayout(null);
        setVisible(true);

    }
    
}
//Closing frame on click of button
//Keshav Mishra
import java.awt.*;
import java.awt.event.*;

public class AWT_2 extends Frame  {
    AWT_2(){
        Frame f= new Frame("Title");
        f.setSize(300,600);
    Button b = new Button("CLick me");
    setTitle("Hello! I am Frame");
    b.setBounds(30,200,80,30);
    add(b);
    setSize(600,300);
    setLayout(null);
    setVisible(true);
        addWindowListener(new WindowAdapter() {
           
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }


        });

        
        
        
    }

    public static void main(String[] args) {
        new AWT_2();
        
        
    }
    
}

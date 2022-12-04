import javax.swing.*;
import java.awt.*;

public class BOX extends Chess{
    JPanel panel;
    JPanel CreateBox(int i, int j){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,10,10);
        if((i+j)%2 == 0)
            panel.setBackground(Color.BLUE);
        else
            panel.setBackground(Color.GREEN);
        if(i == 0 && j == 0) {
            panel.setBackground(Color.BLUE);
            panel.setSize(10,10);
        }
        panel.setVisible(true);
        return panel;
    }
}

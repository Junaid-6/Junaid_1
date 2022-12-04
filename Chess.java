import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chess extends Placement{
    public static void main(String[] args) {
        JFrame bord = new JFrame();
        bord.setLayout(null);
        bord.setBounds(0,0,1600,800);
        JPanel panel = new JPanel();
        panel.setSize(700,600);
        panel.setLayout(new GridLayout(8,8));
        JPanel[][] Box_no = new JPanel[8][8];
        BOX boxes = new BOX();
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                Box_no[i][j]  = boxes.CreateBox(i,j);
                panel.add(Box_no[i][j]);
            }
        // Placing
        starting(Box_no);
        passed(Box_no);
        panel.setVisible(true);
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(800,0,400,400);
        panel1.setBackground(Color.orange);
        panel1.setVisible(true);
        bord.add(panel1);
        bord.add(panel);
        bord.setVisible(true);
        bord.setTitle("Chess Game Developed By Junaid");
        bord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

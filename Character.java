import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Character extends Button{
    public static void move(JButton[] buttons, JPanel[][] Box_no, int p){
        for (int i = 0; i < 12; i++) {
            int x = i, X = 0, Y = 0;
            switch (p){
                case 1:
                    X = position1[i][0]+1;  Y = position1[i][1];
                    break;
                case 2:
                    X = position2[i][0]-1;  Y = position2[i][1];
            }
            int k = X, j=Y;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(p==1){
                        buttons[x].setVisible(false);
                        Box_no[k][j].add(buttons[x]);
                        buttons[x].setVisible(true);
                        position1[x][0]=k; position1[x][1]=j;
                        move(buttons,Box_no,p);
                    }
                    if(p==2){
                        buttons[x].setVisible(false);
                        Box_no[k][j].add(buttons[x]);
                        buttons[x].setVisible(true);
                        position2[x][0]=k; position2[x][1]=j;
                        move(buttons,Box_no,p);
                    }
                }
            });
        }
    }
}

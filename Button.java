import javax.swing.*;
import java.awt.*;

public class Button{
    public static int[][] position1 = new int[12][8];
    public static int[][] position2 = new int[12][8];
    public static JButton[] player1 = new JButton[12];
    public static JButton[] player2 = new JButton[12];
    JButton button;
    JButton Player1(){
        button = new JButton();
        button.setLayout(null);
        button.setBounds(15,10,50,50);
        button.setBackground(Color.white);
        button.setVisible(true);
        return button;
    }
    JButton Player2(){
        button = new JButton();
        button.setLayout(null);
        button.setBounds(15,10,50,50);
        button.setBackground(Color.red);
        button.setVisible(true);
        return button;
    }
    public static void setButton(JButton[] player1,JButton[] player2){
        Button player = new Button();
        for(int i = 0 ; i < 12; i++){
            player1[i] = player.Player1();
            player2[i] = player.Player2();
        }
    }
    public static void passed(JPanel[][] Box_no){
            Character G = new Character();
            G.move(player1,Box_no,1);
            G.move(player2,Box_no,2);
    }
}

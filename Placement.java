import javax.swing.*;

public class Placement extends Button{
    public static void starting(JPanel[][] Box_no){
        setButton(player1,player2);
        int n = 0, p = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 8; j += 2, n++, p++) {
                switch (i){
                    case 0:
                        ++j;
                        break;
                    case 2:
                        ++j;
                        break;
                }
                Box_no[i][j].add(player1[n]);
                position1[p][0] = i;
                position1[p][1] = j;
                switch (i) {
                    case 0:
                        j--;
                        break;
                    case 2:
                        j--;
                }
            }
        }
        n = 0; p = 0;
        for (int i = 5; i <= 7; i++) {
            for (int j = 0; j < 8; j += 2, n++,p++) {
                switch (i) {
                    case 6:
                        ++j;
                        break;
                }
                Box_no[i][j].add(player2[n]);
                position2[p][0] = i;
                position2[p][1] = j;
                switch (i) {
                    case 6:
                        j--;
                        break;
                }
            }
        }
    }
}

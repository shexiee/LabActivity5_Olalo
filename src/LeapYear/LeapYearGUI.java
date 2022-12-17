package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(String title) {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = true;
                int year = 0;

                try {
                    year = (int) Double.parseDouble(tfYear.getText());
                }
                catch(Exception a){
                    JOptionPane.showMessageDialog(null,"Enter a Number");
                    flag = false;
                }

                if(year == 0) {
                    JOptionPane.showMessageDialog(null,"Input must be nonzero");
                }else {
                    if (flag) {
                        if (year % 400 == 0) {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        } else if (year % 100 != 0 && year % 4 == 0) {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not a leap year");
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setTitle("Leap Year Checker");
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

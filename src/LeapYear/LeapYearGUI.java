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
                int year = 0;
                year = Integer.parseInt(tfYear.getText());
                if (year % 400 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else if (year % 100 != 0 && year % 4 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

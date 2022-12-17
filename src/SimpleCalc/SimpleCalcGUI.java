package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;


    public static void main(String[] args) {
        JFrame window = new SimpleCalcGUI("Simple Calculator");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public SimpleCalcGUI(String title) {
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        lblResult.setEditable(false);
    }
}

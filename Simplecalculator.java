package simplecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Simplecalculator extends JFrame implements ActionListener {

    JTextField display;
    double num1, num2, result;
    char operator;

    JButton[] buttons = new JButton[16];
    String[] buttonText = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"
    };

    public Simplecalculator() {

        setTitle("Simple Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        add(display, BorderLayout.NORTH);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonText[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        
        if (command.charAt(0) >= '0' &&
            command.charAt(0) <= '9') {

            display.setText(display.getText() + command);
        }

        
        else if (command.equals("C")) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        }

       
        else if (command.equals("+") ||
                 command.equals("-") ||
                 command.equals("*") ||
                 command.equals("/")) {

            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        }

        
        else if (command.equals("=")) {

            num2 = Double.parseDouble(display.getText());

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        display.setText("Error");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new Simplecalculator();
    }
}

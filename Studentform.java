package studentform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Studentform extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton submit;

    Studentform() {

        setTitle("Student Registration");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        l1 = new JLabel("Student ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Course:");
        l4 = new JLabel("Marks:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        submit = new JButton("Submit");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(new JLabel(""));
        add(submit);

        submit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root"
            );

            // SQL query
            String sql = "INSERT INTO student "
                    + "(id, name, course, marks) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            // Get values from text fields
            pst.setInt(1, Integer.parseInt(t1.getText()));
            pst.setString(2, t2.getText());
            pst.setString(3, t3.getText());
            pst.setInt(4, Integer.parseInt(t4.getText()));

            // Execute query
            pst.executeUpdate();

            JOptionPane.showMessageDialog(
                    this,
                    "Record inserted successfully!"
            );

            // Clear fields
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");

            pst.close();
            con.close();

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + ex.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        new Studentform();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask4;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


/**
 *
 * @author hafiz
 */
class PersonalDetail implements ActionListener {

    JLabel lblID, lblFirstName, lblMiddleName, lblLastName, lblEmail, lblPhoneNum;
    JTextField txtID, txtFirstName, txtMiddleName, txtLastName, txtEmail, txtPhoneNum;
    JButton newbtn, updatebtn, deletebtn, firstbtn, previousBtn, nextBtn, lastBtn, clearbtn;
    ResultSet resultSet;

    public static void main(String[] args) {
        // TODO code application logic here
        PersonalDetail perdetail = new PersonalDetail();
        perdetail.PersonalDetail();

    }

    private void PersonalDetail() {
        JFrame f = new JFrame("Person");

        JPanel panelInput = new JPanel(new GridLayout(6, 2));
        panelInput.setBorder(new TitledBorder("Personal Detail"));//set title border

        lblID = new JLabel("ID                :");
        txtID = new JTextField();

        lblFirstName = new JLabel("First Name        :");
        txtFirstName = new JTextField();

        lblMiddleName = new JLabel("Middle Name       :");
        txtMiddleName = new JTextField();

        lblLastName = new JLabel("Last Name         :");
        txtLastName = new JTextField();

        lblEmail = new JLabel("Email             :");
        txtEmail = new JTextField();

        lblPhoneNum = new JLabel("Phone Number      :");
        txtPhoneNum = new JTextField();

        panelInput.add(lblID);
        panelInput.add(txtID);
        panelInput.add(lblFirstName);
        panelInput.add(txtFirstName);
        panelInput.add(lblMiddleName);
        panelInput.add(txtMiddleName);
        panelInput.add(lblLastName);
        panelInput.add(txtLastName);
        panelInput.add(lblEmail);
        panelInput.add(txtEmail);
        panelInput.add(lblPhoneNum);
        panelInput.add(txtPhoneNum);

        JPanel panelButton = new JPanel(new GridLayout(1, 4));
        newbtn = new JButton("New");
        newbtn.addActionListener(this);
        newbtn.setActionCommand("New");
        updatebtn = new JButton("Update");
        updatebtn.addActionListener(this);
        updatebtn.setActionCommand("Update");
        deletebtn = new JButton("Delete");
        deletebtn.addActionListener(this);
        deletebtn.setActionCommand("Delete");
        clearbtn = new JButton("Clear");
        clearbtn.addActionListener(this);
        clearbtn.setActionCommand("Clear");

        JPanel panelButton2 = new JPanel(new GridLayout(1, 4));
        firstbtn = new JButton("First");
        firstbtn.addActionListener(this);
        firstbtn.setActionCommand("First");
        previousBtn = new JButton("Prev");
        previousBtn.addActionListener(this);
        previousBtn.setActionCommand("Prev");
        nextBtn = new JButton("Next");
        nextBtn.addActionListener(this);
        nextBtn.setActionCommand("Next");
        lastBtn = new JButton("Last");
        lastBtn.addActionListener(this);
        lastBtn.setActionCommand("Last");

        panelButton.add(newbtn);
        panelButton.add(updatebtn);
        panelButton.add(deletebtn);
        panelButton.add(clearbtn);
        panelButton2.add(firstbtn);
        panelButton2.add(previousBtn);
        panelButton2.add(nextBtn);
        panelButton2.add(lastBtn);

        JPanel pan = new JPanel(new BorderLayout());
        pan.add(panelInput, BorderLayout.CENTER);

        JPanel btn = new JPanel(new BorderLayout());
        btn.add(panelButton, BorderLayout.NORTH);
        btn.add(panelButton2, BorderLayout.SOUTH);
        f.add(pan, BorderLayout.NORTH);
        f.add(btn, BorderLayout.SOUTH);

        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        //Strig to represent the action
        String action = evt.getActionCommand();
        if (action.equals("New")) {
            addData();
        } else if (action.equals("Update")) {
            updateData();
        } else if (action.equals("Delete")) {
            deleteData();
        } else if (action.equals("Prev")) {
            previous();
        } else if (action.equals("Next")) {
            next();
        } else if (action.equals("First")) {
            first();
        } else if (action.equals("Last")) {
            last();
        } else if (action.equals("Clear")) {
            clear();
        }
    }

    private void addData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
            String mysql = "INSERT INTO person (ID, firstName, middleName, lastName, email, phoneNo) "
                    + "VALUES ('" + txtID.getText() + "',"
                    + "'" + txtFirstName.getText() + "',"
                    + "'" + txtMiddleName.getText() + "',"
                    + "'" + txtLastName.getText() + "',"
                    + "'" + txtEmail.getText() + "',"
                    + "'" + txtPhoneNum.getText() + "')";

            Statement statement = connection.createStatement();
            statement.execute(mysql);
            JOptionPane.showMessageDialog(null, "Record Added Succesfully.", "Record Added",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //Delete button
    private void deleteData() {
        int del = JOptionPane.showConfirmDialog(null,
                "Are you sure to delete the Record ?", "Delete Record",
                JOptionPane.YES_NO_OPTION);
        if (del == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
                String mysql = "DELETE FROM person WHERE ID = '" + txtID.getText() + "'";
                Statement statement = connection.createStatement();
                statement.execute(mysql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Record Deleted", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Operation Canceled", "Cancel",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateData() {
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
            String mysql = "SELECT * FROM person";

            JOptionPane.showMessageDialog(null, mysql, "Record Updated",
                    JOptionPane.INFORMATION_MESSAGE);
            Statement statement = connection.createStatement();
            statement.execute(mysql);

            JOptionPane.showMessageDialog(null, "Record Update Succesfully.",
                    "Record Updated", JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void first() {
        try {
            if (resultSet == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
                String mysql = "SELECT * FROM person ";
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
            if (resultSet.first()) {
                populateControls();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void last() {
        try {
            if (resultSet == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
                String mysql = "SELECT * FROM person ";
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
            if (resultSet.last()) {
                populateControls();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void previous() {
        try {
            if (resultSet == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
                String mysql = "SELECT * FROM person ";
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
            if (resultSet.previous()) {
                populateControls();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Next button navigation
    private void next() {
        try {
            if (resultSet == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
                String mysql = "SELECT * FROM person ";
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                resultSet = statement.executeQuery(mysql);
            }
            if (resultSet.next());
            {
                populateControls();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMiddleName.setText("");
        txtEmail.setText("");
        txtPhoneNum.setText("");
        txtID.setText("");
    }

    //Class to show value
    private void populateControls() {
        try {
            txtID.setText(resultSet.getString("ID"));
            txtFirstName.setText(resultSet.getString("firstName"));
            txtMiddleName.setText(resultSet.getString("middleName"));
            txtLastName.setText(resultSet.getString("lastName"));
            txtEmail.setText(resultSet.getString("email"));
            txtPhoneNum.setText(resultSet.getString("phoneNo"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

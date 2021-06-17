/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.*;
import project.engine.DBconnection;

/**
 *
 * @author hafiz
 */
class PersonalDetail extends JFrame {

    JLabel lblID, lblFirstName, lblMiddleName, lblLastName, lblEmail, lblPhoneNum;
    JTextField txtID, txtFirstName, txtMiddleName, txtLastName, txtEmail, txtPhoneNum;
    JButton newbtn, updatebtn, deletebtn, firstbtn, previousBtn, nextBtn, lastBtn;

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Person");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public PersonalDetail(String str) {
        super(str);
        JFrame f = new JFrame("Person");

        JPanel panelPerson = new JPanel(new FlowLayout());
        panelPerson.setBorder(new TitledBorder("Personal Detail"));

        lblID = new JLabel("ID                :");
        lblID.setBounds(100, 50, 100, 30);
        txtID = new JTextField();
        txtID.setBounds(100, 50, 250, 30);
        lblFirstName = new JLabel("First Name        :");
        lblFirstName.setBounds(100, 50, 100, 100);
        txtFirstName = new JTextField();
        txtFirstName.setBounds(100, 50, 250, 100);
        lblMiddleName = new JLabel("Middle Name       :");
        lblMiddleName.setBounds(100, 50, 100, 170);
        txtMiddleName = new JTextField();
        txtMiddleName.setBounds(100, 50, 250, 170);
        lblLastName = new JLabel("Last Name         :");
        lblLastName.setBounds(100, 50, 100, 230);
        txtLastName = new JTextField();
        txtLastName.setBounds(100, 50, 250, 230);
        lblEmail = new JLabel("Email             :");
        lblEmail.setBounds(100, 50, 100, 300);
        txtEmail = new JTextField();
        txtEmail.setBounds(100, 50, 250, 300);
        lblPhoneNum = new JLabel("Phone Number      :");
        lblPhoneNum.setBounds(100, 50, 100, 370);
        txtPhoneNum = new JTextField();
        txtPhoneNum.setBounds(100, 50, 250, 370);

        f.add(lblID);
        f.add(txtID);
        f.add(lblFirstName);
        f.add(txtFirstName);
        f.add(lblMiddleName);
        f.add(txtMiddleName);
        f.add(lblLastName);
        f.add(txtLastName);
        f.add(lblEmail);
        f.add(txtEmail);
        f.add(lblPhoneNum);
        f.add(txtPhoneNum);

        f.add(panelPerson, BorderLayout.CENTER);
        f.setVisible(true);
        f.setSize(600, 600);
        f.setLayout(null);
    }

}

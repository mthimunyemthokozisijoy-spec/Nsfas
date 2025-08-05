/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Student
 */
public class Login extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,300);
        setLocationRelativeTo(null);
        
        //main panel
        JPanel panel= new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(30,50,30,50));
        panel.setBackground(Color.WHITE);
        
        //JLabel welcome
        JLabel welcomeLbl=new JLabel("Welcome Back");
        welcomeLbl.setFont(new Font("Arial",Font.BOLD,18));
        welcomeLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(welcomeLbl);
        JLabel subtitle= new JLabel("Your journey starts here");
        subtitle.setFont(new Font("Arial",Font.PLAIN,12));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(subtitle);
        
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        
        //idField
        idField= new JTextField();
        idField.setMaximumSize(new Dimension(Integer.MAX_VALUE,30));
        idField.setBorder(BorderFactory.createTitledBorder("ID Number"));
        panel.add(idField);
        
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        //Password field
        passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        panel.add(passwordField);
        
        //Login button
        loginButton= new JButton("Login");
        loginButton.setBackground(new Color(153,0,0));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(loginButton);
        
        add(panel);
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String id =idField.getText();
                String password= new String(passwordField.getPassword());
                if(id.equals("12345")&&password.equals("tut2025"))
                {
                    JOptionPane.showMessageDialog(null,"Login successful");
                }else 
                {
                    JOptionPane.showMessageDialog(null, "Invalid ID or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        
        setVisible(true);
                
        
        
        
    }
    
    
    
}

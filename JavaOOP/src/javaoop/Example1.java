/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author user
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;// imports the event package for ActionListener and ActionEvent

public class Example1 extends JFrame implements ActionListener {
    Container c;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, addReset;

    Example1() {
        setSize(500, 700);
        setTitle("GUIProgram");
        setLocationRelativeTo(null); //to place the window in the centre of the screen
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = this.getContentPane(); // gets the content pane of the JFrame
        c.setBackground(Color.RED);

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");


        c.setLayout(null); // to set the location of label as our wish
        l1.setBounds(20, 50, 100, 20);
        l2.setBounds(20, 80, 100, 20);
        l3.setBounds(20, 140, 100, 20);

        c.add(l1); // Add components individually
        c.add(l2);
        c.add(l3);


        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t1.setBounds(120, 50, 100, 20);
        t2.setBounds(120, 80, 100, 20);
        t3.setBounds(120, 140, 100, 20);

        c.add(t1); // Add components individually
        c.add(t2);
        c.add(t3);
        //t3.setEditable(false); // Make it non-editable

        b1 = new JButton("Add");
        b1.setBounds(120, 110, 80, 20);
        c.add(b1);

        addReset = new JButton("Reset");
        addReset.setBounds(120, 170, 80, 20);
        c.add(addReset);
        // Add action listener for the button
        b1.addActionListener(this);
        addReset.addActionListener(this);

        setVisible(true);// this must always be written in the last line of the constructor

    }
        public void actionPerformed (ActionEvent e){ //here actionperformed is the method which overrides the ActionListener interface
            if (e.getSource()==addReset) {
                t1.setText("");
                t2.setText("");
                t3.setText("");

            }
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            t3.setText(""+ sum);

        }

        public static void main(String[] args) {
        new Example1();
    }
}
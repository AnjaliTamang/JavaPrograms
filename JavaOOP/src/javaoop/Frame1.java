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
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Frame1 extends JFrame
{
    JLabel l1;
    Container c;

Frame1(){
setTitle("Example");
setSize(500,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c= this.getContentPane();
c.setLayout(null);
ImageIcon icon = new ImageIcon("images.jpg");
l1= new JLabel(icon);
Font f = new Font("Times New Roman",Font.BOLD ,24);
l1= new JLabel("Example");
l1.setBounds(30,100, icon.getIconWidth(), icon.getIconHeight());
l1.setBounds(30, 180, 120,20);
        
l1.setFont(f);
c.add(l1);
setVisible(true);
}
    public static void main(String[] args) {
        new Frame1();
    }

}

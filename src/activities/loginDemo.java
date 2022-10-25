package activities;
import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class loginDemo extends JFrame implements MouseListener{
    private JTextField t1,t2;
    private JButton b1,b2;
    private JLabel l1,l2,l3,l4;
    private JPanel loginPanel;
    public loginDemo(){
        setLayout(null);

        //login
        l1= new JLabel("Login");
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(350,120,300,35);
        add(l1);

        // welcome
        l2= new JLabel("");
        l2.setBounds(400,240,300,30);
        add(l2);

        // exit button
        l3= new JLabel("X");
        l3.setFont(new Font("Noto Sans",Font.BOLD,24));
        l3.setForeground(Color.WHITE);
        l3.setBounds(750,4,25,25);
        add(l3);
        l3.addMouseListener(this);

        // popup when mouse is on close button
        l4= new JLabel();
        l4.addMouseListener(this);
        add(l4);

        //login panel
        JPanel loginPanel= new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setSize(500,350);
        loginPanel.setBackground(new Color(0,0,0,60));
        loginPanel.setBounds(215,175,360,300);


        //username
        t1= new JTextField("Username");
        t1.setFont(new Font("Times New Roman",Font.ITALIC,15));
        t1.setBounds(30,30,300,40);

        //password
        t2= new JPasswordField("Password");
        t2.setFont(new Font("Times New Roman",Font.ITALIC,15));
        t2.setBounds(30,110,300,40);

        //login button
        b1= new JButton("Login");
        b1.setBounds(130,200,90,30);

        b2= new JButton("SignUp");
        b2.setBounds(230,200,90,30);

        loginPanel.add(t1);
        loginPanel.add(t2);
        loginPanel.add(b1);
        loginPanel.add(b2);

        //background
        ImageIcon background_image= new ImageIcon("loginBackground.jpg");
        Image img= background_image.getImage();
        Image temp_img= img.getScaledInstance(775,550,Image.SCALE_SMOOTH);
        background_image= new ImageIcon(temp_img);
        JLabel background= new JLabel("",background_image,JLabel.CENTER);
        background.setBounds(0,0,775,550);

        background.add(loginPanel);
        add(background);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin")) {
                    l2.setText("Welcome");
                    l2.setFont(new Font("Times New Roman",Font.BOLD,10));
                    l2.setForeground(Color.WHITE);
                }
                else {
                      JOptionPane.showMessageDialog(b1, "wrong id or password","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUp s= new signUp();
                setVisible(false);
            }
        });


        this.setBounds(400,200,775,550);
        this.setUndecorated(true);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l4.setText("Close");
        l4.setFont(new Font("Times New Roman",Font.PLAIN,10));
        l4.setForeground(Color.WHITE);
        l4.setBounds(745,28,50,12);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l4.setText("");
        l4.setBounds(725,28,50,12);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
}


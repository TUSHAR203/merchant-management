package activities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class signUp extends JFrame implements ActionListener, MouseListener {
    private JLabel signUp,userName,name,phone,email,address,Gstin,password,cnfmPassword,exit;
    private JTextField userNameTF,nameTF,phoneTF,emailTF,addressTF,GstinTF;
    private JPasswordField passwordF,cnfmPasswordF;
    private JPanel Panel;
    private JButton signupbtn;

    public signUp()
    {
        setLayout(null);

        signUp = new JLabel("SignUp");
        signUp.setFont(new Font("Times New Roman",Font.BOLD,30));
        signUp.setForeground(Color.BLUE);
        signUp.setBounds(350,120,300,35);
        add(signUp);

        Panel= new JPanel();
        Panel.setLayout(null);
        Panel.setSize(700,700);
        Panel.setBackground(new Color(0,0,0,10));
        Panel.setBounds(50,100,700,700);
        add(Panel);

        userName = new JLabel("UserName");
        userName.setFont(new Font("Times New Roman",Font.BOLD,30));
        userName.setForeground(Color.BLUE);
        userName.setBounds(30,30,300,35);
        add(userName);

        name = new JLabel("Name");
        name.setFont(new Font("Times New Roman",Font.BOLD,30));
        name.setForeground(Color.BLUE);
        name.setBounds(30,70,300,35);
        add(name);

        phone = new JLabel("Phone No.");
        phone.setFont(new Font("Times New Roman",Font.BOLD,30));
        phone.setForeground(Color.BLUE);
        phone.setBounds(30,110,300,35);
        add(phone);

        email = new JLabel("Email ID");
        email.setFont(new Font("Times New Roman",Font.BOLD,30));
        email.setForeground(Color.BLUE);
        email.setBounds(30,150,300,35);
        add(email);

        address = new JLabel("Address");
        address.setFont(new Font("Times New Roman",Font.BOLD,30));
        address.setForeground(Color.BLUE);
        address.setBounds(30,190,300,35);
        add(address);

        Gstin = new JLabel("GSTIN");
        Gstin.setFont(new Font("Times New Roman",Font.BOLD,30));
        Gstin.setForeground(Color.BLUE);
        Gstin.setBounds(30,230,300,35);
        add(Gstin);

        password = new JLabel("Password");
        password.setFont(new Font("Times New Roman",Font.BOLD,30));
        password.setForeground(Color.BLUE);
        password.setBounds(30,270,300,35);
        add(password);

        cnfmPassword = new JLabel("Confirm Password");
        cnfmPassword.setFont(new Font("Times New Roman",Font.BOLD,30));
        cnfmPassword.setForeground(Color.BLUE);
        cnfmPassword.setBounds(30,310,300,35);
        add(cnfmPassword);

        userNameTF= new JTextField("Username");
        userNameTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        userNameTF.setBounds(30,30,300,40);

        nameTF = new JTextField("Username");
        nameTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        nameTF.setBounds(30,30,300,40);

        phoneTF= new JTextField("Username");
        phoneTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        phoneTF.setBounds(30,30,300,40);

        emailTF= new JTextField("Username");
        emailTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        emailTF.setBounds(30,30,300,40);

        addressTF= new JTextField("Username");
        addressTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        addressTF.setBounds(30,30,300,40);

        GstinTF= new JTextField("Username");
        GstinTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        GstinTF.setBounds(30,30,300,40);

        passwordF= new JPasswordField("Password");
        passwordF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        passwordF.setBounds(30,110,300,40);

        cnfmPasswordF= new JPasswordField("Password");
        cnfmPasswordF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        cnfmPasswordF.setBounds(30,160,300,40);

        signupbtn= new JButton("SignUp");
        signupbtn.setBounds(130,200,90,30);
        signupbtn.addActionListener(this);

        Panel.add(userNameTF);
        Panel.add(nameTF);
        Panel.add(phoneTF);
        Panel.add(emailTF);
        Panel.add(addressTF);
        Panel.add(GstinTF);
        Panel.add(passwordF);
        Panel.add(cnfmPasswordF);
        Panel.add(signupbtn);

        // exit button
        exit= new JLabel("X");
        exit.setFont(new Font("Noto Sans",Font.BOLD,24));
        exit.setForeground(Color.WHITE);
        exit.setBounds(750,4,25,25);
        add(exit);
        exit.addMouseListener( this);

        //background
        ImageIcon background_image= new ImageIcon("loginBackground.jpg");
        Image img= background_image.getImage();
        Image temp_img= img.getScaledInstance(775,550,Image.SCALE_SMOOTH);
        background_image= new ImageIcon(temp_img);
        JLabel background= new JLabel("",background_image,JLabel.CENTER);
        background.setBounds(0,0,775,550);

        background.add(Panel);
        add(background);

        this.setBounds(400,200,775,550);
        this.setUndecorated(true);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

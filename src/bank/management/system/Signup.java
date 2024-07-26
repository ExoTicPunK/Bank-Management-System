package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,M1,M2,M3;
    JButton next;
    JTextField textName,textFName,textEmail,textMs,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser; // imported Custom jar file 
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L; //or long first4=(ran.nextLong()%10000L);
    String first=" "+Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank-account.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Arial",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setBounds(400,80,600,30);
        label2.setFont(new Font("Arial",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(350,110,600,30);
        label3.setFont(new Font("Arial",Font.BOLD,22));
        add(label3);

        // Your Name
        JLabel labelName=new JLabel("Name: ");
        labelName.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelName.setBounds(100,150,200,30);
        add(labelName);

        textName=new JTextField();
        textName.setBounds(260,150,400,30);
        textName.setFont(new Font("Arial",Font.ITALIC,18));
        add(textName);

        // Fathers Name
        JLabel labelFName=new JLabel("Father's Name: ");
        labelFName.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelFName.setBounds(100,200,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setBounds(260,200,400,30);
        textFName.setFont(new Font("Arial",Font.ITALIC,18));
        add(textFName);

        // Date of Birth
        JLabel DOB=new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        DOB.setBounds(100,250,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(153,255,255));
        dateChooser.setBounds(260,250,400,30);
        add(dateChooser);

        // Gender
        JLabel labelG=new JLabel("Gender: ");
        labelG.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelG.setBounds(100,300,200,30);
        add(labelG);

        // radio buttons for gender
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Arial",Font.BOLD,14));
        r1.setBounds(260,300,80,30);
        r1.setBackground(new Color(192,192,192));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Arial",Font.BOLD,14));
        r2.setBounds(350,300,100,30);
        r2.setBackground(new Color(192,192,192));
        add(r2);

        r3=new JRadioButton("Others");
        r3.setFont(new Font("Arial",Font.BOLD,14));
        r3.setBounds(450,300,100,30);
        r3.setBackground(new Color(192,192,192));
        add(r3);

        ButtonGroup buttongroup= new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);
        buttongroup.add(r3);

        // Email
        JLabel labelEmail=new JLabel("Email: ");
        labelEmail.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelEmail.setBounds(100,350,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setBounds(260,350,400,30);
        textEmail.setFont(new Font("Arial",Font.ITALIC,18));
        add(textEmail);

        // marriage status
        JLabel labelMs=new JLabel("Marriage Status: ");
        labelMs.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelMs.setBounds(100,400,200,30);
        add(labelMs);

        M1=new JRadioButton("Married");
        M1.setFont(new Font("Arial",Font.BOLD,14));
        M1.setBounds(260,400,80,30);
        M1.setBackground(new Color(192,192,192));
        add(M1);

        M2=new JRadioButton("Unmarried");
        M2.setFont(new Font("Arial",Font.BOLD,14));
        M2.setBounds(350,400,100,30);
        M2.setBackground(new Color(192,192,192));
        add(M2);

        M3=new JRadioButton("Others");
        M3.setFont(new Font("Arial",Font.BOLD,14));
        M3.setBounds(450,400,100,30);
        M3.setBackground(new Color(192,192,192));
        add(M3);

        ButtonGroup buttongroup2= new ButtonGroup();
        buttongroup2.add(M1);
        buttongroup2.add(M2);
        buttongroup2.add(M3);

        // Address
        JLabel labelAdd=new JLabel("Address: ");
        labelAdd.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelAdd.setBounds(100,450,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setBounds(260,450,400,30);
        textAdd.setFont(new Font("Arial",Font.ITALIC,18));
        add(textAdd);

        // City
        JLabel labelCity=new JLabel("City: ");
        labelCity.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelCity.setBounds(100,500,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setBounds(260,500,400,30);
        textCity.setFont(new Font("Arial",Font.ITALIC,18));
        add(textCity);

        // pincode
        JLabel labelPin=new JLabel("Pin Code: ");
        labelPin.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelPin.setBounds(100,550,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin.setBounds(260,550,400,30);
        textPin.setFont(new Font("Arial",Font.ITALIC,18));
        add(textPin);

        // state
        JLabel labelState=new JLabel("State: ");
        labelState.setFont(new Font("Arial",Font.ITALIC|Font.BOLD,20));
        labelState.setBounds(100,600,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setBounds(260,600,400,30);
        textState.setFont(new Font("Arial",Font.ITALIC,18));
        add(textState);

        // Next Button
        next=new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.setBounds(620,680,80,30);
        next.setBorder(new LineBorder(Color.WHITE, 2));
        next.addActionListener(this);
        add(next);

        // Panel size
        getContentPane().setBackground(new Color(192,192,192));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(M1.isSelected()){
            marital="Married";
        }else if(M2.isSelected()){
            marital="Unmarried";
        }else if(M3.isSelected()){
            marital="Others";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();
        
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Connect con1=new Connect();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Signup();
    }
}

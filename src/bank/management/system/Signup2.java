package bank.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;
    Signup2(String formno){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;


        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Arial",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);


        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Arial",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Arial",Font.BOLD,22));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBounds(350,120,320,30);
        comboBox.setBackground(new Color(255, 255, 254));
        comboBox.setFont(new Font("Arial",Font.BOLD,14));
        add(comboBox);


        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Arial",Font.BOLD,22));
        l4.setBounds(100,170,100,30);
        add(l4);


        String category[]={"General","SC","ST","OBC","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBounds(350,170,320,30);
        comboBox2.setBackground(new Color(255, 255, 254));
        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
        add(comboBox2);



        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Arial",Font.BOLD,22));
        l5.setBounds(100,220,100,30);
        add(l5);


        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBounds(350,220,320,30);
        comboBox3.setBackground(new Color(255, 255, 254));
        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
        add(comboBox3);



        JLabel l6 = new JLabel("Educational Details");
        l6.setFont(new Font("Arial",Font.BOLD,22));
        l6.setBounds(100,270,250,30);
        add(l6);


        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setBackground(new Color(255, 255, 254));
        comboBox4.setFont(new Font("Arial",Font.BOLD,14));
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation");
        l7.setFont(new Font("Arial",Font.BOLD,22));
        l7.setBounds(100,320,320,30);
        add(l7);


        String occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBounds(350,320,320,30);
        comboBox5.setBackground(new Color(255, 255, 254));
        comboBox5.setFont(new Font("Arial",Font.BOLD,14));
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number");
        l8.setFont(new Font("Arial",Font.BOLD,22));
        l8.setBounds(100,370,320,30);
        add(l8);


        textPan = new JTextField();
        textPan.setFont(new Font("Arial",Font.BOLD,18));  
        textPan.setBounds(350,370,320,30);
        add(textPan);


        JLabel l9 = new JLabel("Aadhar Number");
        l9.setFont(new Font("Arial",Font.BOLD,22));
        l9.setBounds(100,420,320,30);
        add(l9);


        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Arial",Font.BOLD,18));  
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);


        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Arial",Font.BOLD,22));
        l10.setBounds(100,470,320,30);
        add(l10);


        r1 = new JRadioButton("Yes");
        r1.setBounds(350,470,80,30);
        r1.setFont(new Font("Arial",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        add(r1);


        r2 = new JRadioButton("No");
        r2.setBounds(470,470,80,30);
        r2.setFont(new Font("Arial",Font.BOLD,16));
        r2.setBackground(new Color(252,208,76));
       add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);




        JLabel l11 = new JLabel("Existing Account?");
        l11.setFont(new Font("Arial",Font.BOLD,22));
        l11.setBounds(100,520,320,30);
        add(l11);


        r3 = new JRadioButton("Yes");
        r3.setBounds(350,520,80,30);
        r3.setFont(new Font("Arial",Font.BOLD,16));
        r3.setBackground(new Color(252,208,76));
        add(r3);


        r4 = new JRadioButton("No");
        r4.setBounds(470,520,80,30);
        r4.setFont(new Font("Arial",Font.BOLD,16));
        r4.setBackground(new Color(252,208,76));
       add(r4);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);


        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Arial",Font.BOLD,18));
        l12.setBounds(650,10,100,30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Arial",Font.BOLD,18));
        l13.setBounds(740,10,60,30);
        add(l13);


        next = new JButton("Next");
        next.setBounds(650,600,80,30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Arial",Font.BOLD,16));
        next.setBorder(new LineBorder(Color.BLACK,1));
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setLocation(450,80);
        setSize(850,750);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r3.isSelected())){
            eAccount = "Yes";
        } else if (r4.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect c = new Connect();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}

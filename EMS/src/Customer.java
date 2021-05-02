import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Customer extends JFrame {

  
    /**
	 * 
	 */
	private static final long serialVersionUID = -981286030846569689L;
	public Customer() {
        initComponents();
txtdate.setEditable(false);
java.util.Date ob=new java.util.Date();
@SuppressWarnings("deprecation")
int a=ob.getDate();
@SuppressWarnings("deprecation")
int b=ob.getMonth();
@SuppressWarnings("deprecation")
int c=ob.getYear();
b=b+1;
c=c+1900;
String d=" "+a+"/"+b+"/"+c;
txtdate.setText(""+d);

   }

 
    private void initComponents() {

        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        panel3 = new  JPanel();
        panel4 = new  JPanel();
        txtname = new  JTextField();
        txtaddress = new  JTextField();
        txtmobileno = new  JTextField();
        txtusername = new  JTextField();
        txtbudget = new  JTextField();
        txtdate = new  JTextField();
        btnupdate = new  JButton();
        btnclear = new  JButton();
        panel5 = new  JPanel();
        label3 = new  JLabel();
        panel7 = new  JPanel();
        label5 = new  JLabel();
        panel6 = new  JPanel();
        label4 = new  JLabel();
        panel8 = new  JPanel();
        label6 = new  JLabel();
        panel9 = new  JPanel();
        label7 = new  JLabel();
        panel10 = new  JPanel();
        label8 = new  JLabel();
        panel11 = new  JPanel();
        label9 = new  JLabel();
        jMenuBar1 = new  JMenuBar();
        jMenu1 = new  JMenu();
        jMenu2 = new  JMenu();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png"))); 
        panel2.add(label1);
        label1.setBounds(70, 10, 128, 130);

        label2.setFont(new  Font("Trebuchet MS", 1, 36)); 
        label2.setForeground(new  Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(50, 150, 172, 42);

        panel1.add(panel2);
        panel2.setBounds(13, 10, 270, 460);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 297, 490);

        panel3.setBackground(new  Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new  Color(255, 255, 255));
        panel4.setPreferredSize(new  Dimension(600, 600));
        panel4.setLayout(null);

        txtname.setFont(new  Font("Trebuchet MS", 0, 14)); 
        txtname.setPreferredSize(new  Dimension(300, 50));
        txtname.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        panel4.add(txtname);
        txtname.setBounds(10, 98, 300, 50);

        txtaddress.setFont(new  Font("Trebuchet MS", 0, 14)); 
        txtaddress.setPreferredSize(new  Dimension(615, 50));
        txtaddress.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        panel4.add(txtaddress);
        txtaddress.setBounds(10, 184, 630, 50);

        txtmobileno.setFont(new  Font("Trebuchet MS", 0, 14)); 
        txtmobileno.setPreferredSize(new  Dimension(300, 50));
        panel4.add(txtmobileno);
        txtmobileno.setBounds(340, 98, 300, 50);

        txtusername.setFont(new  Font("Trebuchet MS", 0, 14)); 
        txtusername.setPreferredSize(new  Dimension(300, 50));
        panel4.add(txtusername);
        txtusername.setBounds(10, 263, 630, 50);

        txtbudget.setFont(new  Font("Trebuchet MS", 0, 14)); 
        txtbudget.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtbudgetActionPerformed(evt);
            }
        });
        panel4.add(txtbudget);
        txtbudget.setBounds(10, 340, 310, 50);
        panel4.add(txtdate);
        txtdate.setBounds(340, 340, 300, 50);

        btnupdate.setBackground(new  Color(75, 190, 237));
        btnupdate.setFont(new  Font("Trebuchet MS", 1, 14)); 
        btnupdate.setForeground(new  Color(255, 255, 255));
        btnupdate.setText("UPDATE INFO");
        btnupdate.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        panel4.add(btnupdate);
        btnupdate.setBounds(330, 400, 305, 50);

        btnclear.setBackground(new  Color(75, 190, 237));
        btnclear.setFont(new  Font("Trebuchet MS", 1, 14)); 
        btnclear.setForeground(new  Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panel4.add(btnclear);
        btnclear.setBounds(10, 400, 310, 50);

        panel5.setBackground(new  Color(75, 190, 237));
        panel5.setLayout(null);

        label3.setBackground(new  Color(255, 255, 255));
        label3.setFont(new  Font("Trebuchet MS", 1, 24)); 
        label3.setForeground(new  Color(255, 255, 255));
        label3.setText("CUSTOMER INFORMATION");
        panel5.add(label3);
        label3.setBounds(10, 11, 312, 29);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 630, 60);

        panel7.setBackground(new  Color(75, 190, 224));
        panel7.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 14)); 
        label5.setForeground(new  Color(255, 255, 255));
        label5.setText("MOBILE NO");
        panel7.add(label5);
        label5.setBounds(10, 0, 71, 18);

        panel4.add(panel7);
        panel7.setBounds(340, 79, 300, 20);

        panel6.setBackground(new  Color(75, 190, 224));
        panel6.setLayout(null);

        label4.setFont(new  Font("Trebuchet MS", 1, 14)); 
        label4.setForeground(new  Color(255, 255, 255));
        label4.setText("FULL NAME");
        panel6.add(label4);
        label4.setBounds(10, 0, 73, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 80, 300, 20);

        panel8.setBackground(new  Color(75, 190, 224));
        panel8.setLayout(null);

        label6.setFont(new  Font("Trebuchet MS", 1, 14)); 
        label6.setForeground(new  Color(255, 255, 255));
        label6.setText("ADDRESS");
        panel8.add(label6);
        label6.setBounds(10, 0, 58, 18);

        panel4.add(panel8);
        panel8.setBounds(10, 166, 630, 20);

        panel9.setBackground(new  Color(75, 190, 224));
        panel9.setLayout(null);

        label7.setFont(new  Font("Trebuchet MS", 1, 14)); 
        label7.setForeground(new  Color(255, 255, 255));
        label7.setText("USERNAME");
        panel9.add(label7);
        label7.setBounds(10, 0, 69, 18);

        panel4.add(panel9);
        panel9.setBounds(10, 245, 630, 20);

        panel10.setBackground(new  Color(75, 190, 224));
        panel10.setLayout(null);

        label8.setFont(new  Font("Trebuchet MS", 1, 14)); 
        label8.setForeground(new  Color(255, 255, 255));
        label8.setText("BUDGET");
        panel10.add(label8);
        label8.setBounds(10, 0, 52, 18);

        panel4.add(panel10);
        panel10.setBounds(10, 320, 310, 20);

        panel11.setBackground(new  Color(75, 190, 224));
        panel11.setLayout(null);

        label9.setFont(new  Font("Trebuchet MS", 1, 14)); // NOI18N
        label9.setForeground(new  Color(255, 255, 255));
        label9.setText("EVENT DATE");
        panel11.add(label9);
        label9.setBounds(10, 0, 82, 18);

        panel4.add(panel11);
        panel11.setBounds(340, 320, 300, 20);

        panel3.add(panel4);
        panel4.setBounds(10, 10, 650, 460);

        getContentPane().add(panel3);
        panel3.setBounds(297, 0, 677, 490);

        jMenu1.setText("Master");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-989)/2, (screenSize.height-552)/2, 989, 552);
    }

    private void txtaddressActionPerformed( ActionEvent evt) {  }

    private void txtbudgetActionPerformed( ActionEvent evt) {  }

    private void btnupdateActionPerformed( ActionEvent evt) {
      
 
        


    String t1=txtname.getText();
    String t2=txtmobileno.getText();
    String t3=txtaddress.getText();
    String t4=txtusername.getText();
    String t5=txtbudget.getText();
    String t6=txtdate.getText();










if( (t1.equals("")) || (t2.equals("")) || (t3.equals("")) || (t4.equals("")) || (t5.equals("")) || (t6.equals("")) ) 
{
JOptionPane.showMessageDialog(null,"Plzzz Enter All Fields");
}
else
{
	Pattern pattern=Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
	Matcher matcher=pattern.matcher(t1);
	 if(!(matcher.matches()))
                     {
                      JOptionPane.showMessageDialog(null,"Plzz Enter Valid Name:");
                     }
                          else 
	         {
		 Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
	 	 Matcher m=p.matcher(t2);
	 	if(!(m.find() && m.group().equals(t2)))
		  {
    		 JOptionPane.showMessageDialog(null,"Plzz Enter Valid Phone no:");
 		 }
                  	  else 
                 		  {
		           String ss="^[0-9]+.?[0-9]{2}?$";
		          Pattern paa=Pattern.compile(ss);
		          Matcher maa=paa.matcher(t5);
		          if(!(maa.matches()))
 		              {
   		               JOptionPane.showMessageDialog(null,"Plzz Enter Valid Amount:");
 		                   }
             		                  else
              		                      {

        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement st=con.createStatement();
            
           ResultSet rs=st.executeQuery("select * from customer where username='"+t4+"' ");

            if(!rs.next())
           {
               int k=st.executeUpdate("insert into customer values('"+t1+"','"+t2+"','"+t3+"','"+t4+"','"+t5+"','"+t6+"')");
               if(k>=1)
               {
               JOptionPane.showMessageDialog(null,"Record Inserted...");   
               }
          }else
                  {
            
               JOptionPane.showMessageDialog(null,"Username Already exist");           
                  
             } 
            
         rs.close();
          st.close();
          con.close();          
        }catch(Exception e){
          System.out.println(e);
        }  
       Customerlogin login = new Customerlogin();
       login.setVisible(true);
       this.dispose(); 
  }
}
}
   }     
    }

private void txtnameActionPerformed( ActionEvent evt) {  }

    private void btnclearActionPerformed( ActionEvent evt) {
         txtname.setText("");
         txtmobileno.setText("");
         txtaddress.setText("");
         txtdate.setText("");
         txtusername.setText("");
         txtbudget.setText("");
    }

    
    public static void main(String args[])
 {      
    	Customer ob=new Customer();
    	ob.setVisible(true);
    }

    private  JButton btnclear;
    private  JButton btnupdate;
    private  JMenu jMenu1;
    private  JMenu jMenu2;
    private  JMenuBar jMenuBar1;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JLabel label7;
    private  JLabel label8;
    private  JLabel label9;
    private  JPanel panel1;
    private  JPanel panel10;
    private  JPanel panel11;
    private  JPanel panel2;
    private  JPanel panel3;
    private  JPanel panel4;
    private  JPanel panel5;
    private  JPanel panel6;
    private  JPanel panel7;
    private  JPanel panel8;
    private  JPanel panel9;
    private  JTextField txtaddress;
    private  JTextField txtbudget;
    private  JTextField txtdate;
    private  JTextField txtmobileno;
    private  JTextField txtname;
    private  JTextField txtusername;
}
   

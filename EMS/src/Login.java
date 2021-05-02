import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -758244517866810892L;
	public Login() 
{
   initComponents();
    }

 
    private void initComponents() 
{

        panel2 = new  JPanel();
        label3 = new  JLabel();
        txtuname = new  JTextField();
        txtmobileno = new  JTextField();
        label5 = new  JLabel();
        label6 = new  JLabel();
        btngetpassword = new  JButton();
        label7 = new  JLabel();
        label10 = new  JLabel();
        label9 = new  JLabel();
        label8 = new  JLabel();
        label4 = new  JLabel();
        panel1 = new  JPanel();
        txtusername = new  JTextField();
        txtpassword = new  JPasswordField();
        btnlogin = new  JButton();
        label1 = new  JLabel();
        label2 = new  JLabel();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setForeground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label3.setFont(new  Font("Trebuchet MS", 0, 18));  
        label3.setText("Forgot password ?");
        panel2.add(label3);
        label3.setBounds(436, 46, 170, 21);

        txtuname.setFont(new  Font("Trebuchet MS", 0, 14));  
        txtuname.setText("  Username");
        txtuname.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtunameMouseClicked(evt);
            }
        });
        panel2.add(txtuname);
        txtuname.setBounds(337, 146, 333, 50);

        txtmobileno.setFont(new  Font("Trebuchet MS", 0, 14));  
        txtmobileno.setText("  Mobile No");
        txtmobileno.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtmobilenoMouseClicked(evt);
            }
        });
        panel2.add(txtmobileno);
        txtmobileno.setBounds(337, 221, 333, 50);

        label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/name.png")));  
        panel2.add(label5);
        label5.setBounds(676, 146, 50, 50);

        label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile.png"))); 
        panel2.add(label6);
        label6.setBounds(676, 221, 50, 50);

        btngetpassword.setBackground(new  Color(120, 204, 238));
        btngetpassword.setFont(new  Font("Trebuchet MS", 0, 24));  
        btngetpassword.setForeground(new  Color(255, 255, 255));
        btngetpassword.setText("Get Password");
        btngetpassword.setToolTipText("");
        btngetpassword.setBorder(null);
        btngetpassword.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btngetpasswordActionPerformed(evt);
            }
        });
        panel2.add(btngetpassword);
        btngetpassword.setBounds(332, 349, 390, 40);

        label7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twitter.png"))); 
    
        panel2.add(label7);
        label7.setBounds(337, 282, 48, 48);

        label10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/googleplus.png"))); 
        panel2.add(label10);
        label10.setBounds(622, 282, 48, 48);

        label9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebook.png"))); 
        panel2.add(label9);
        label9.setBounds(527, 282, 48, 48);

        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instagram.png"))); 
        panel2.add(label8);
        label8.setBounds(432, 282, 48, 48);

        label4.setText("Get password here");
        panel2.add(label4);
        label4.setBounds(460, 80, 120, 14);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        txtusername.setBackground(new  Color(120, 204, 238));
        txtusername.setFont(new  Font("Trebuchet MS", 0, 18));  
        txtusername.setForeground(new  Color(255, 255, 255));
        txtusername.setText("  Username");
        txtusername.setBorder(null);
        txtusername.setCaretColor(new  Color(255, 255, 255));
        txtusername.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtusernameMouseClicked(evt);
            }
        });
        
        panel1.add(txtusername);
        txtusername.setBounds(10, 150, 290, 50);

        txtpassword.setBackground(new  Color(120, 204, 238));
        txtpassword.setText("  Password");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtpasswordMouseClicked(evt);
            }
        });
        
        panel1.add(txtpassword);
        txtpassword.setBounds(10, 218, 290, 49);

        btnlogin.setBackground(new  Color(120, 204, 238));
        btnlogin.setFont(new  Font("Trebuchet MS", 0, 18));  
        btnlogin.setForeground(new  Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        panel1.add(btnlogin);
        btnlogin.setBounds(10, 350, 290, 39);

        label1.setBackground(new  Color(75, 190, 237));
        label1.setFont(new  Font("Trebuchet MS", 0, 36));  
        label1.setForeground(new  Color(255, 255, 255));
        label1.setText("Login Now");
        panel1.add(label1);
        label1.setBounds(64, 54, 165, 42);

        label2.setFont(new  Font("Trebuchet MS", 0, 14));  
        label2.setForeground(new  Color(255, 255, 255));
        label2.setText("Dont have an account? ");
        label2.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });
        panel1.add(label2);
        label2.setBounds(80, 290, 148, 18);

        panel2.add(panel1);
        panel1.setBounds(0, 0, 320, 400);

        getContentPane().add(panel2);
        panel2.setBounds(-1, -1, 740, 400);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-744)/2, (screenSize.height-433)/2, 744, 433);
    }

   

    private void btnloginActionPerformed( ActionEvent evt) {
         String uname=txtusername.getText();
       @SuppressWarnings("deprecation")
	String pass=txtpassword.getText();
     try{
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from login where username='"+uname+"' And password='"+pass+"' ");
    if(rs.next())
    {
    JOptionPane.showMessageDialog(null,"Login Successful...");
      Decoration decoration = new Decoration();
decoration.setVisible(true);
this.dispose();
    
     }
    else
    {
    JOptionPane.showMessageDialog(null,"Incorrect Username or Passsword");
    }
    rs.close();
    st.close();
    con.close();
}catch(Exception e)
{
 System.out.println(e);
}
    }                                        

    private void btngetpasswordActionPerformed( ActionEvent evt) 
{
       
         String uname=txtuname.getText();
       String mno=txtmobileno.getText();
     try{
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from login where username='"+uname+"' And mobile_no='"+mno+"' ");
    if(rs.next())
    {
    JOptionPane.showMessageDialog(null,"Your Password : "+rs.getString(3));
     }
    else
    {
    JOptionPane.showMessageDialog(null,"Incorrect username or mobile number");
    }
    rs.close();
    st.close();
    con.close();
}catch(Exception e)
{
 System.out.println(e);
}
                        
    }

    private void txtusernameMouseClicked( MouseEvent evt) {
         txtusername.setText("");
         txtpassword.setText("");               
    }

    private void txtpasswordMouseClicked( MouseEvent evt) {
  
    }

    private void txtunameMouseClicked( MouseEvent evt) {
       txtuname.setText("");
       txtmobileno.setText("");
    }

    private void txtmobilenoMouseClicked( MouseEvent evt) {
         
    }

    private void label2MouseClicked( MouseEvent evt) {
       Adminregister admin = new Adminregister();
       admin.setVisible(true);
       this.dispose();
    }

  

    public static void main(String args[])
 {
      Login ob=new Login();
      ob.setVisible(true);
    }

    private  JButton btngetpassword;
    private  JButton btnlogin;
    private  JLabel label1;
    private  JLabel label10;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JLabel label7;
    private  JLabel label8;
    private  JLabel label9;
    private  JPanel panel1;
    private  JPanel panel2;
    private  JTextField txtmobileno;
    private  JPasswordField txtpassword;
    private  JTextField txtuname;
    private  JTextField txtusername;
   
}



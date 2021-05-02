
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Adminregister extends  JFrame 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7320293243392690958L;
	public Adminregister() {
        initComponents();
        setSize(350,560);
    }

   
    public void initComponents()
 {
        jPanel1 = new  JPanel();
        label1 = new  JLabel();
        txtmobileno = new  JTextField();
        txtusername = new  JTextField();
        txtpassword = new  JPasswordField();
        btnlogin = new  JButton();
        label2 = new  JLabel();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new  Color(75, 190, 237));
        jPanel1.setLayout(null);

        label1.setBackground(new  Color(75, 190, 237));
        label1.setFont(new  Font("Trebuchet MS", 0, 36));  
        label1.setForeground(new  Color(255, 255, 255));
        label1.setText("Register");
        jPanel1.add(label1);
        label1.setBounds(100, 10, 140, 42);

        txtmobileno.setBackground(new  Color(120, 204, 238));
        txtmobileno.setFont(new  Font("Trebuchet MS", 0, 18));  
        txtmobileno.setForeground(new  Color(255, 255, 255));
        txtmobileno.setText("  Mobile No");
        txtmobileno.setBorder(null);
        txtmobileno.setCaretColor(new  Color(255, 255, 255));
        txtmobileno.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtmobilenoMouseClicked(evt);
            }
        });
        txtmobileno.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtmobilenoActionPerformed(evt);
            }
        });
        jPanel1.add(txtmobileno);
        txtmobileno.setBounds(20, 320, 290, 50);

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
        txtusername.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername);
        txtusername.setBounds(20, 250, 290, 50);

        txtpassword.setBackground(new  Color(120, 204, 238));
        txtpassword.setText("  Password");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent evt) {
                txtpasswordMouseClicked(evt);
            }
        });
        txtpassword.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword);
        txtpassword.setBounds(20, 390, 290, 49);

        btnlogin.setBackground(new  Color(120, 204, 238));
        btnlogin.setFont(new  Font("Trebuchet MS", 0, 18));  
        btnlogin.setForeground(new  Color(255, 255, 255));
        btnlogin.setText("Register");
        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(20, 460, 290, 39);

        label2.setHorizontalAlignment( SwingConstants.CENTER);
       label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("./hotel.png")));  
        jPanel1.add(label2);
        label2.setBounds(100, 70, 128, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 530);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-354)/2, (screenSize.height-571)/2, 354, 571);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmobilenoMouseClicked( MouseEvent evt) {
txtmobileno.setText("");
    }

    private void txtmobilenoActionPerformed( ActionEvent evt) {
}

    private void txtusernameMouseClicked( MouseEvent evt) {
       txtusername.setText("");       
    }

    private void txtusernameActionPerformed( ActionEvent evt) {
}

    private void txtpasswordMouseClicked( MouseEvent evt) {

       txtpassword.setText("");
    }

    private void txtpasswordActionPerformed( ActionEvent evt) {
}

    private void btnloginActionPerformed( ActionEvent evt) {

        
    String t1=txtusername.getText();
    String t2=txtmobileno.getText();
    @SuppressWarnings("deprecation")
	String t3=txtpassword.getText();
   
 try{
	 Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
        PreparedStatement ps=con.prepareStatement("Insert into login values(?,?,?)");
        ps.setString(1,t1);
        ps.setString(2,t2);       
        ps.setString(3,t3);   
        
int k=ps.executeUpdate();
if(k>=1)
JOptionPane.showMessageDialog(null,"Record Inserted...");
		;
ps.close();
con.close();
}catch(Exception e)
{
 System.out.println(e);
}   
      Login login = new Login();
       login.setVisible(true);
       this.dispose(); 
         
    }

   
    public static void main(String args[])
 {
       
    	Adminregister ob= new Adminregister();
        ob.setVisible(true);
    }

    private  JButton btnlogin;
    private  JPanel jPanel1;
    private  JLabel label1;
    private  JLabel label2;
    private  JTextField txtmobileno;
    private  JPasswordField txtpassword;
    private  JTextField txtusername;

}

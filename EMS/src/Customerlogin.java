
import  java.sql.*;
import   javax.swing.JOptionPane;
import   javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class Customerlogin extends   JFrame 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3444981756151268764L;
	public Customerlogin() {
        initComponents();
        setSize(340,445);
    }

    private void initComponents()
 {
        panel1 = new   JPanel();
        txtusername = new   JTextField();
        btnlogin = new   JButton();
        label1 = new   JLabel();
        label2 = new   JLabel();
        txtmobileno = new   JTextField();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new    Color(75, 190, 237));
        panel1.setLayout(null);

        txtusername.setBackground(new    Color(120, 204, 238));
        txtusername.setFont(new    Font("Trebuchet MS", 0, 18));  
        txtusername.setForeground(new    Color(255, 255, 255));
        txtusername.setText("  Username");
        txtusername.setBorder(null);
        txtusername.setCaretColor(new    Color(255, 255, 255));
        txtusername.addMouseListener(new   MouseAdapter() {
            public void mouseClicked(  MouseEvent evt) {
                txtusernameMouseClicked(evt);
            }
        });
        txtusername.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        panel1.add(txtusername);
        txtusername.setBounds(10, 150, 300, 50);

        btnlogin.setBackground(new    Color(120, 204, 238));
        btnlogin.setFont(new    Font("Trebuchet MS", 0, 18));  
        btnlogin.setForeground(new    Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        panel1.add(btnlogin);
        btnlogin.setBounds(10, 350, 290, 39);

        label1.setBackground(new    Color(75, 190, 237));
        label1.setFont(new    Font("Trebuchet MS", 0, 36));  
        label1.setForeground(new    Color(255, 255, 255));
        label1.setText("Login Now");
        panel1.add(label1);
        label1.setBounds(64, 54, 165, 42);

        label2.setFont(new    Font("Trebuchet MS", 0, 14));  
        label2.setForeground(new    Color(255, 255, 255));
        label2.setText("Dont have an account? ");
        label2.addMouseListener(new   MouseAdapter() {
            public void mouseClicked(  MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });
        panel1.add(label2);
        label2.setBounds(80, 300, 148, 18);

        txtmobileno.setBackground(new    Color(120, 204, 238));
        txtmobileno.setFont(new    Font("Trebuchet MS", 1, 18));  
        txtmobileno.setForeground(new    Color(255, 255, 255));
        txtmobileno.setText("Mobileno");
        txtmobileno.setBorder(  BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panel1.add(txtmobileno);
        txtmobileno.setBounds(10, 220, 300, 50);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 330, 400);

           Dimension screenSize =    Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-336)/2, (screenSize.height-440)/2, 336, 440);
    }

    private void txtusernameActionPerformed(  ActionEvent evt) {
}

    private void btnloginActionPerformed(  ActionEvent evt) {
        String uname=txtusername.getText();
        String pass=txtmobileno.getText();
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from customer where username='"+uname+"' And mobile_no='"+pass+"' ");
            if(rs.next())
                {
            JOptionPane.showMessageDialog(null,"Login Successful...");
         Venueorder venueorder = new Venueorder(uname);
                venueorder.setVisible(true);
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
    private void label2MouseClicked(MouseEvent evt) {
        Customer customer= new Customer();
        customer.setVisible(true);
        this.dispose();            
    }
    private void txtusernameMouseClicked(  MouseEvent evt) {
      txtusername.setText("");
      txtmobileno.setText("");
    }
    public static void main(String args[]) 
{
     Customerlogin ob=new Customerlogin();
     ob.setVisible(true);
    }
    private   JButton btnlogin;
    private   JLabel label1;
    private   JLabel label2;
    private   JPanel panel1;
    private   JTextField txtmobileno;
    private   JTextField txtusername;
}

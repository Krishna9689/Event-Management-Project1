import  java.awt.*;
import  java.awt.event.*;
import javax.swing.*;

public class Welcome extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6387425700604248886L;
	public Welcome() {
     setSize(1800,1800);
        initComponents();
    }

    private void initComponents() {

        panel1 = new   JPanel();
        panel2 = new   JPanel();
        label1 = new   JLabel();
        panel3 = new   JPanel();
        label2 = new   JLabel();
        btnlogin = new   JButton();
        panel6 = new   JPanel();
        panel7 = new   JPanel();
        label3 = new   JLabel();
        panel8 = new   JPanel();
        label4 = new   JLabel();
        btnregister = new   JButton();
        panel4 = new   JPanel();
        panel5 = new   JPanel();
        label5 = new   JLabel();
        label6 = new   JLabel();
        label7 = new   JLabel();
        label9 = new   JLabel();
        label10 = new   JLabel();
        label8 = new   JLabel();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panel1.setBackground(new  Color(255, 255, 255));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(75, 190, 237));
        panel2.setLayout(null);

        label1.setFont(new  Font("Trebuchet MS", 1, 24)); 
        label1.setForeground(new  Color(255, 255, 255));
        label1.setHorizontalAlignment(  SwingConstants.CENTER);
        label1.setText("Admin");
        panel2.add(label1);
        label1.setBounds(10, 11, 240, 38);

        panel1.add(panel2);
        panel2.setBounds(10, 11, 260, 60);

        panel3.setBackground(new  Color(120, 204, 238));
        panel3.setLayout(null);

        label2.setHorizontalAlignment(  SwingConstants.CENTER);
        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png")));
        panel3.add(label2);
        label2.setBounds(10, 11, 240, 278);

        btnlogin.setBackground(new  Color(75, 190, 237));
        btnlogin.setFont(new  Font("Trebuchet MS", 1, 18)); // NOI18N
        btnlogin.setForeground(new  Color(255, 255, 255));
        btnlogin.setText("LOGIN ");
        btnlogin.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        panel3.add(btnlogin);
        btnlogin.setBounds(10, 295, 240, 50);

        panel1.add(panel3);
        panel3.setBounds(10, 82, 260, 356);

        getContentPane().add(panel1);
        panel1.setBounds(-1, 0, 280, 449);

        panel6.setBackground(new  Color(255, 255, 255));
        panel6.setLayout(null);

        panel7.setBackground(new  Color(75, 190, 237));
        panel7.setLayout(null);

        label3.setFont(new  Font("Trebuchet MS", 1, 24)); 
        label3.setForeground(new  Color(255, 255, 255));
        label3.setHorizontalAlignment(  SwingConstants.CENTER);
        label3.setText("CUSTOMER");
        panel7.add(label3);
        label3.setBounds(10, 11, 234, 38);

        panel6.add(panel7);
        panel7.setBounds(9, 11, 255, 60);

        panel8.setBackground(new  Color(120, 204, 238));
        panel8.setLayout(null);

        label4.setHorizontalAlignment(  SwingConstants.CENTER);
        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); 
        panel8.add(label4);
        label4.setBounds(10, 11, 234, 278);

        btnregister.setBackground(new  Color(75, 190, 237));
        btnregister.setFont(new  Font("Trebuchet MS", 1, 18)); // NOI18N
        btnregister.setForeground(new  Color(255, 255, 255));
        btnregister.setText("LOGIN");
        btnregister.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        panel8.add(btnregister);
        btnregister.setBounds(10, 295, 230, 50);

        panel6.add(panel8);
        panel8.setBounds(10, 82, 254, 356);

        getContentPane().add(panel6);
        panel6.setBounds(679, 0, 280, 449);

        panel4.setBackground(new  Color(75, 190, 237));
        panel4.setLayout(null);

        panel5.setBackground(new  Color(255, 255, 255));
        panel5.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 24));
        label5.setForeground(new  Color(75, 190, 237));
        label5.setHorizontalAlignment(  SwingConstants.CENTER);
        label5.setText("\"Perfection is not attainable,");
        panel5.add(label5);
        label5.setBounds(10, 22, 327, 40);

        label6.setFont(new  Font("Trebuchet MS", 1, 18)); 
        label6.setForeground(new  Color(75, 190, 237));
        label6.setHorizontalAlignment(  SwingConstants.CENTER);
        label6.setText(" but if we chase perfection ");
        panel5.add(label6);
        label6.setBounds(0, 68, 352, 36);

        label7.setFont(new  Font("Trebuchet MS", 1, 24)); 
        label7.setForeground(new  Color(75, 190, 237));
        label7.setHorizontalAlignment(  SwingConstants.CENTER);
        label7.setText("we can catch excellence.\"");
        panel5.add(label7);
        label7.setBounds(18, 110, 324, 43);

        label9.setFont(new  Font("Trebuchet MS", 1, 36)); 
        label9.setForeground(new  Color(120, 204, 238));
        label9.setHorizontalAlignment(  SwingConstants.CENTER);
        label9.setText("We at Gryffindor");
        panel5.add(label9);
        label9.setBounds(10, 304, 332, 42);

        label10.setFont(new  Font("Trebuchet MS", 1, 24)); 
        label10.setForeground(new  Color(120, 204, 238));
        label10.setHorizontalAlignment(  SwingConstants.CENTER);
        label10.setText("Excell in Event Management");
        panel5.add(label10);
        label10.setBounds(10, 352, 332, 40);

        label8.setHorizontalAlignment(  SwingConstants.CENTER);
        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png"))); 
        panel5.add(label8);
        label8.setBounds(110, 170, 128, 119);

        panel4.add(panel5);
        panel5.setBounds(24, 22, 350, 410);

        getContentPane().add(panel4);
        panel4.setBounds(280, 0, 400, 450);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-965)/2, (screenSize.height-485)/2, 965, 485);
    }

    private void btnloginActionPerformed( ActionEvent evt) {
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }

    private void btnregisterActionPerformed( ActionEvent evt) {
        Customerlogin customerlogin= new Customerlogin();
        customerlogin.setVisible(true);
        this.dispose();      
    }


    public static void main(String args[]) 
{
Welcome ob=new Welcome();
ob.setVisible(true);
    }
    
    private   JButton btnlogin;
    private   JButton btnregister;
    private   JLabel label1;
    private   JLabel label10;
    private   JLabel label2;
    private   JLabel label3;
    private   JLabel label4;
    private   JLabel label5;
    private   JLabel label6;
    private   JLabel label7;
    private   JLabel label8;
    private   JLabel label9;
    private   JPanel panel1;
    private   JPanel panel2;
    private   JPanel panel3;
    private   JPanel panel4;
    private   JPanel panel5;
    private   JPanel panel6;
    private   JPanel panel7;
    private   JPanel panel8;
    // End of variables declaration//GEN-END:variables
}

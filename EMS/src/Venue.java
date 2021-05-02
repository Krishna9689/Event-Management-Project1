import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Venue extends  JFrame
 {
  /**
	 * 
	 */
	private static final long serialVersionUID = -32966852103867139L;
public Venue() 
{
        initComponents();
        
                    table1.setFocusable(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.setIntercellSpacing(new java.awt.Dimension(0, 0)); 
        table1.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        table1.getTableHeader().setOpaque(false);
        table1.getTableHeader().setBackground(new Color(75, 190, 237));
        table1.getTableHeader().setForeground(new Color(255,255,255));
        table1.setRowHeight(25);
        table1.setSelectionBackground(new java.awt.Color(75, 190, 237));
        table1.setSelectionForeground(new java.awt.Color(255,255,255));
        table1.setShowVerticalLines(false);
        table1.setShowHorizontalLines(false);
        
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            ps=con.prepareStatement("select * from venue");
            rs=ps.executeQuery();
            Vector<String> head=new Vector<String>();
            ResultSetMetaData rsm=rs.getMetaData();
            int cols=rsm.getColumnCount();

            {
                head.add("Name");
                head.add("Price");
                head.add("Location");
            }

            Vector<Vector<String>> data=new Vector<Vector<String>>();
            while(rs.next())
            {
                Vector<String> row=new Vector<String>();
                for(int i=1;i<=cols;i++)
                {
                    row.add(rs.getString(i));
                }
                data.add(row);
            }

            table1.setModel(new  DefaultTableModel(
                    data,head ));
            jScrollPane1.setViewportView(table1);


        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

    private void initComponents() 
{
        panel3 = new  JPanel();
        panel4 = new  JPanel();
        panel5 = new  JPanel();
        label3 = new  JLabel();
        label4 = new  JLabel();
        jLabel4 = new  JLabel();
        txtname = new  JTextField();
        txtlocation = new  JTextField();
        txtprice = new  JTextField();
        btnaddvenue = new  JButton();
        jScrollPane1 = new  JScrollPane();
        table1 = new  JTable();
        jLabel3 = new  JLabel();
        panel7 = new  JPanel();
        label6 = new  JLabel();
        panel8 = new  JPanel();
        label7 = new  JLabel();
        panel6 = new  JPanel();
        label5 = new  JLabel();
        btnremove = new  JButton();
        btnclear = new  JButton();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btnfood = new  JButton();
        btnemployee = new  JButton();
        btndecoration = new  JButton();
        jMenuBar1 = new  JMenuBar();
        jMenu1 = new  JMenu();
        jMenuItem6 = new  JMenuItem();
        Transaction = new  JMenu();
        jMenuItem7 = new  JMenuItem();
        jMenu2 = new  JMenu();
        jMenuItem1 = new  JMenuItem();
        jMenuItem2 = new  JMenuItem();
        jMenuItem3 = new  JMenuItem();
        jMenuItem4 = new  JMenuItem();
        jMenuItem5 = new  JMenuItem();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel3.setBackground(new   Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new   Color(255, 255, 255));
        panel4.setLayout(null);

        panel5.setBackground(new   Color(75, 190, 237));
        panel5.setLayout(null);

        label3.setFont(new   Font("Trebuchet MS", 1, 36));   
        label3.setForeground(new   Color(255, 255, 255));
        label3.setText("VENUE DETAILS");
        panel5.add(label3);
        label3.setBounds(20, 0, 257, 42);

        label4.setFont(new   Font("Trebuchet MS", 1, 14));   
        label4.setForeground(new   Color(255, 255, 255));
        label4.setText("NOTE : ALL FIELDS COMPULSARY");
        panel5.add(label4);
        label4.setBounds(29, 48, 213, 18);

        panel4.add(panel5);
        panel5.setBounds(9, 11, 700, 80);
        panel4.add(jLabel4);
        jLabel4.setBounds(278, 487, 0, 0);
        panel4.add(txtname);
        txtname.setBounds(10, 135, 230, 50);
        panel4.add(txtlocation);
        txtlocation.setBounds(246, 135, 230, 50);
        panel4.add(txtprice);
        txtprice.setBounds(482, 135, 226, 50);

        btnaddvenue.setBackground(new   Color(75, 190, 237));
        btnaddvenue.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnaddvenue.setForeground(new   Color(255, 255, 255));
        btnaddvenue.setText("UPDATE");
        btnaddvenue.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnaddvenueActionPerformed(evt);
            }
        });
        panel4.add(btnaddvenue);
        btnaddvenue.setBounds(440, 450, 270, 53);

        table1.setModel(new  DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "PRICE", "LOCATION"
            }
        ));
        table1.addMouseListener(new   MouseAdapter() {
            public void mouseClicked(  MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 203, 698, 230);
        panel4.add(jLabel3);
        jLabel3.setBounds(722, 0, 421, 414);

        panel7.setBackground(new   Color(75, 190, 224));
        panel7.setLayout(null);

        label6.setFont(new   Font("Trebuchet MS", 1, 14));   
        label6.setForeground(new   Color(255, 255, 255));
        label6.setText("LOCATION");
        panel7.add(label6);
        label6.setBounds(10, 0, 100, 18);

        panel4.add(panel7);
        panel7.setBounds(246, 115, 230, 20);

        panel8.setBackground(new   Color(75, 190, 224));
        panel8.setLayout(null);

        label7.setFont(new   Font("Trebuchet MS", 1, 14));   
        label7.setForeground(new   Color(255, 255, 255));
        label7.setText("PRICE");
        panel8.add(label7);
        label7.setBounds(10, 0, 38, 18);

        panel4.add(panel8);
        panel8.setBounds(482, 115, 226, 20);

        panel6.setBackground(new   Color(75, 190, 224));
        panel6.setLayout(null);

        label5.setFont(new   Font("Trebuchet MS", 1, 14));   
        label5.setForeground(new   Color(255, 255, 255));
        label5.setText("NAME");
        panel6.add(label5);
        label5.setBounds(10, 0, 36, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 115, 230, 20);

        btnremove.setBackground(new   Color(75, 190, 237));
        btnremove.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnremove.setForeground(new   Color(255, 255, 255));
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        panel4.add(btnremove);
        btnremove.setBounds(10, 450, 210, 50);

        btnclear.setBackground(new   Color(75, 190, 237));
        btnclear.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnclear.setForeground(new   Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panel4.add(btnclear);
        btnclear.setBounds(230, 450, 200, 50);

        panel3.add(panel4);
        panel4.setBounds(20, 20, 725, 510);

        getContentPane().add(panel3);
        panel3.setBounds(300, 0, 770, 550);

        panel1.setBackground(new   Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new   Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png"))); 
        panel2.add(label1);
        label1.setBounds(67, 26, 128, 128);

        label2.setFont(new   Font("Trebuchet MS", 1, 36));   
        label2.setForeground(new   Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(47, 172, 172, 42);

        btnfood.setBackground(new   Color(75, 190, 237));
        btnfood.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnfood.setForeground(new   Color(255, 255, 255));
        btnfood.setText("Food");
        btnfood.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });
        panel2.add(btnfood);
        btnfood.setBounds(10, 440, 240, 60);

        btnemployee.setBackground(new   Color(75, 190, 237));
        btnemployee.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnemployee.setForeground(new   Color(255, 255, 255));
        btnemployee.setText("Employee");
        btnemployee.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnemployeeActionPerformed(evt);
            }
        });
        panel2.add(btnemployee);
        btnemployee.setBounds(10, 300, 240, 60);

        btndecoration.setBackground(new   Color(75, 190, 237));
        btndecoration.setFont(new   Font("Trebuchet MS", 1, 24));   
        btndecoration.setForeground(new   Color(255, 255, 255));
        btndecoration.setText("Decoration");
        btndecoration.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btndecorationActionPerformed(evt);
            }
        });
        panel2.add(btndecoration);
        btndecoration.setBounds(10, 370, 240, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 260, 510);

        getContentPane().add(panel1);
        panel1.setBounds(-1, -1, 300, 550);

        jMenu1.setText("Master");

        jMenuItem6.setText("Employee Registration");
        jMenuItem6.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        Transaction.setText("Transaction");

        jMenuItem7.setText("Customer bill");
        jMenuItem7.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Transaction.add(jMenuItem7);

        jMenuBar1.add(Transaction);

        jMenu2.setText("Report");

        jMenuItem1.setText("Customer Report");
        
        jMenuItem1.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Venue Order Report");
        jMenuItem2.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Decoration Order Report");
        jMenuItem3.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Food Order Report");
        jMenuItem4.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Employee Report");
        jMenuItem5.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

          Dimension screenSize =   Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1097)/2, (screenSize.height-609)/2, 1097, 609);
    }

    private void btnemployeeActionPerformed(  ActionEvent evt) {
Empinfo employee = new Empinfo();
employee.setVisible(true);
this.dispose();       
    }

    private void btnfoodActionPerformed(  ActionEvent evt) {

        Food food = new Food();
        food.setVisible(true);
        this.dispose();
    }

    private void btnaddvenueActionPerformed(  ActionEvent evt)
 {
        String t1=txtname.getText();
        String t2=txtlocation.getText();
        String t3=txtprice.getText();
        String t4="Venue";
if( (t1.equals("")) || (t2.equals("")) || (t3.equals(""))) 
{
JOptionPane.showMessageDialog(null,"Plzzz Enter All Fields");
}
else
{

        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            PreparedStatement ps=con.prepareStatement("Insert into venue values(?,?,?,?)");
            ps.setString(1,t1);
            ps.setString(2,t3);
            ps.setString(3,t2);
            ps.setString(4,t4);

            int k=ps.executeUpdate();
            if(k>=1)
                JOptionPane.showMessageDialog(null,"Record Inserted...");         
            ps.close();
            con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }               
        @SuppressWarnings("unused")
		int row = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.addRow(new Object[]{t1,t3,t2});
}
    }

    private void table1MouseClicked(MouseEvent evt) {
    }

    private void btnremoveActionPerformed(  ActionEvent evt)
 {     
Connection con;
PreparedStatement pst;
int row = table1.getSelectedRow();

String cell = table1.getModel().getValueAt(row,0).toString();
String sql = ("Delete from venue where venue_Name='" +cell+"'");
try
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  con=DriverManager.getConnection("jdbc:odbc:palace");
    pst = con.prepareStatement(sql);
    pst.execute();     
JOptionPane.showMessageDialog (this,"Record Deleted Successfully");  

}
catch(Exception e)
{
JOptionPane.showMessageDialog (null,e);
}     
    
  DefaultTableModel model = (DefaultTableModel)table1.getModel();
  model.removeRow(row);
    }

    private void btndecorationActionPerformed(  ActionEvent evt) {
        Decoration decoration = new Decoration();
        decoration.setVisible(true);
        this.dispose();
    }

    private void btnclearActionPerformed(  ActionEvent evt) {
        txtname.setText("");
        txtlocation.setText("");
        txtprice.setText("");
    }

    private void jMenuItem6ActionPerformed(  ActionEvent evt) {
        Empinfo empinfo = new Empinfo();
        empinfo.setVisible(true);
        this.dispose();
    }

    private void jMenuItem7ActionPerformed(  ActionEvent evt) {
        String uname = JOptionPane.showInputDialog("Enter Username:");
        Bill ob=new Bill(uname);
        ob.setVisible(true);
        this.dispose();
    }

    
    private void jMenuItem1ActionPerformed(  ActionEvent evt) {
        new CR();
    }

    private void jMenuItem2ActionPerformed(  ActionEvent evt) {
        new VO();
    }
    private void jMenuItem3ActionPerformed(  ActionEvent evt) {
        new DO();
    }

    private void jMenuItem4ActionPerformed(  ActionEvent evt) {
        new FO();
    }

    private void jMenuItem5ActionPerformed(  ActionEvent evt) {
        new Emp();
    }

    public static void main(String args[])
 {
Venue ob=new Venue();
 ob.setVisible(true);
 }
    private  JMenu Transaction;
    private  JButton btnaddvenue;
    private  JButton btnclear;
    private  JButton btndecoration;
    private  JButton btnemployee;
    private  JButton btnfood;
    private  JButton btnremove;
    private  JLabel jLabel3;
    private  JLabel jLabel4;
    private  JMenu jMenu1;
    private  JMenu jMenu2;
    private  JMenuBar jMenuBar1;
    private  JMenuItem jMenuItem1;
    private  JMenuItem jMenuItem2;
    private  JMenuItem jMenuItem3;
    private  JMenuItem jMenuItem4;
    private  JMenuItem jMenuItem5;
    private  JMenuItem jMenuItem6;
    private  JMenuItem jMenuItem7;
    private  JScrollPane jScrollPane1;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JLabel label7;
    private  JPanel panel1;
    private  JPanel panel2;
    private  JPanel panel3;
    private  JPanel panel4;
    private  JPanel panel5;
    private  JPanel panel6;
    private  JPanel panel7;
    private  JPanel panel8;
    private  JTable table1;
    private  JTextField txtlocation;
    private  JTextField txtname;
    private  JTextField txtprice;
}


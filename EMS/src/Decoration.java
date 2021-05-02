import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;


public class Decoration extends JFrame
 {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6670156037790502784L;
	public Decoration()
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
           ps=con.prepareStatement("select * from decoration");
           rs=ps.executeQuery();
         Vector<String> head=new Vector<String>();
         ResultSetMetaData rsm=rs.getMetaData();
         int cols=rsm.getColumnCount();
         
         {
           head.add("Name");
           head.add("Price");
           head.add("Type");
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

     table1.setModel(new DefaultTableModel(
           data,head ));
            scrollpane1.setViewportView(table1);
    
           
    }catch(Exception e)
    {
     System.out.println(e);
    }

     
    }

    private void initComponents() {

        jPanel1 = new   JPanel();
        jPanel2 = new   JPanel();
        label1 = new   JLabel();
        label2 = new   JLabel();
        btnemployee = new   JButton();
        btnfood = new   JButton();
        bntvenue = new   JButton();
        jPanel3 = new   JPanel();
        jPanel4 = new   JPanel();
        jPanel5 = new   JPanel();
        label3 = new   JLabel();
        txtdecorationname = new   JTextField();
        txtdecorationprice = new   JTextField();
        btnupdate = new   JButton();
        scrollpane1 = new   JScrollPane();
        table1 = new   JTable();
        btndelete = new   JButton();
        btnclear = new   JButton();
        combobox = new   JComboBox<Object>();
        jPanel8 = new   JPanel();
        label6 = new   JLabel();
        jPanel7 = new   JPanel();
        label5 = new   JLabel();
        jPanel9 = new   JPanel();
        label7 = new   JLabel();
        jPanel6 = new   JPanel();
        label4 = new   JLabel();
        jMenuBar1 = new   JMenuBar();
        jMenu1 = new   JMenu();
        jMenuItem6 = new   JMenuItem();
        Transaction = new   JMenu();
        jMenuItem7 = new   JMenuItem();
        jMenu2 = new   JMenu();
        jMenuItem1 = new   JMenuItem();
        jMenuItem2 = new   JMenuItem();
        jMenuItem3 = new   JMenuItem();
        jMenuItem4 = new   JMenuItem();
        jMenuItem5 = new   JMenuItem();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new   Color(75, 190, 237));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new   Color(255, 255, 255));
        jPanel2.setLayout(null);

        label1.setHorizontalAlignment(  SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png"))); 
        jPanel2.add(label1);
        label1.setBounds(75, 28, 128, 128);

        label2.setFont(new   Font("Trebuchet MS", 1, 36));   
        label2.setForeground(new   Color(75, 190, 237));
        label2.setText("Gryffindor");
        jPanel2.add(label2);
        label2.setBounds(59, 174, 172, 42);

        btnemployee.setBackground(new   Color(75, 190, 237));
        btnemployee.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnemployee.setForeground(new   Color(255, 255, 255));
        btnemployee.setText("Employee");
        btnemployee.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnemployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnemployee);
        btnemployee.setBounds(10, 350, 260, 60);

        btnfood.setBackground(new   Color(75, 190, 237));
        btnfood.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnfood.setForeground(new   Color(255, 255, 255));
        btnfood.setText("Food");
        btnfood.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnfood);
        btnfood.setBounds(10, 490, 260, 60);

        bntvenue.setBackground(new   Color(75, 190, 237));
        bntvenue.setFont(new   Font("Trebuchet MS", 1, 24));   
        bntvenue.setForeground(new   Color(255, 255, 255));
        bntvenue.setText("Venue");
        bntvenue.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                bntvenueActionPerformed(evt);
            }
        });
        jPanel2.add(bntvenue);
        bntvenue.setBounds(10, 420, 260, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(16, 10, 280, 556);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 578);

        jPanel3.setBackground(new   Color(153, 153, 153));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new   Color(255, 255, 255));
        jPanel4.setPreferredSize(new   Dimension(920, 670));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new   Color(75, 190, 237));
        jPanel5.setPreferredSize(new   Dimension(850, 75));
        jPanel5.setLayout(null);

        label3.setFont(new   Font("Trebuchet MS", 1, 36));   
        label3.setForeground(new   Color(255, 255, 255));
        label3.setText("Decoration Details");
        jPanel5.add(label3);
        label3.setBounds(10, 14, 330, 42);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 9, 785, 67);
        jPanel4.add(txtdecorationname);
        txtdecorationname.setBounds(10, 154, 300, 50);
        jPanel4.add(txtdecorationprice);
        txtdecorationprice.setBounds(495, 154, 300, 50);

        btnupdate.setBackground(new   Color(120, 204, 224));
        btnupdate.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnupdate.setForeground(new   Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnupdate);
        btnupdate.setBounds(442, 495, 350, 50);

        table1.setModel(new  DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Price"
            }
        ));
        scrollpane1.setViewportView(table1);

        jPanel4.add(scrollpane1);
        scrollpane1.setBounds(10, 215, 785, 269);

        btndelete.setBackground(new   Color(120, 204, 238));
        btndelete.setFont(new   Font("Trebuchet MS", 1, 24));   
        btndelete.setForeground(new   Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete);
        btndelete.setBounds(226, 495, 210, 50);

        btnclear.setBackground(new   Color(75, 190, 237));
        btnclear.setFont(new   Font("Trebuchet MS", 1, 24));   
        btnclear.setForeground(new   Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel4.add(btnclear);
        btnclear.setBounds(10, 495, 210, 50);

        combobox.setModel(new   DefaultComboBoxModel<Object>(new String[] { "Lights", "Flowers", "Floor", "Music", "Firework", "Stage" }));
        jPanel4.add(combobox);
        combobox.setBounds(320, 154, 165, 50);

        jPanel8.setBackground(new   Color(75, 190, 224));
        jPanel8.setPreferredSize(new   Dimension(160, 20));
        jPanel8.setLayout(null);

        label6.setFont(new   Font("Trebuchet MS", 1, 14));   
        label6.setForeground(new   Color(255, 255, 255));
        label6.setText("Decoration Type");
        jPanel8.add(label6);
        label6.setBounds(10, 0, 107, 18);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(320, 135, 165, 20);

        jPanel7.setBackground(new   Color(75, 190, 224));
        jPanel7.setLayout(null);

        label5.setFont(new   Font("Trebuchet MS", 1, 14));   
        label5.setForeground(new   Color(255, 255, 255));
        label5.setText("Decoration Name");
        jPanel7.add(label5);
        label5.setBounds(10, 0, 111, 18);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(10, 135, 300, 20);

        jPanel9.setBackground(new   Color(75, 190, 224));
        jPanel9.setLayout(null);

        label7.setFont(new   Font("Trebuchet MS", 1, 14));   
        label7.setForeground(new   Color(255, 255, 255));
        label7.setText("Decoration Price");
        jPanel9.add(label7);
        label7.setBounds(10, 0, 108, 18);

        jPanel4.add(jPanel9);
        jPanel9.setBounds(495, 136, 300, 20);

        jPanel6.setBackground(new   Color(204, 204, 204));
        jPanel6.setLayout(null);

        label4.setFont(new   Font("Trebuchet MS", 1, 14));   
        label4.setForeground(new   Color(255, 255, 255));
        label4.setText("Note : All fields compulsary");
        jPanel6.add(label4);
        label4.setBounds(10, 0, 294, 36);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(10, 87, 785, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 805, 556);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(310, 0, 830, 580);

        jMenu1.setText("Master");

        jMenuItem6.setText("Employee Registration");
        jMenuItem6.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        Transaction.setText("Transaction");

        jMenuItem7.setText("Customer bill");
        jMenuItem7.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Transaction.add(jMenuItem7);

        jMenuBar1.add(Transaction);

        jMenu2.setText("Report");

        jMenuItem1.setText("Customer Report");
        
        jMenuItem1.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Venue Order Report");
        jMenuItem2.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Decoration Order Report");
        jMenuItem3.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Food Order Report");
        jMenuItem4.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Employee Report");
        jMenuItem5.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

          Dimension screenSize =   Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1155)/2, (screenSize.height-637)/2, 1155, 637);
    }

    private void btndeleteActionPerformed( ActionEvent evt) {
       
Connection con;
PreparedStatement pst;


int row = table1.getSelectedRow();

String cell = table1.getModel().getValueAt(row,0).toString();
String sql = ("Delete from decoration where Decoration_Name='" +cell+"'");
try
{
	Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
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

    private void btnemployeeActionPerformed( ActionEvent evt) {
Empinfo employee = new Empinfo();
employee.setVisible(true);
this.dispose();

    }

    private void btnfoodActionPerformed( ActionEvent evt) {
   
Food food = new Food();
food.setVisible(true);
this.dispose();
    }

    private void btnupdateActionPerformed(ActionEvent evt)
 {
             
        String t1=txtdecorationname.getText();
        String t2=txtdecorationprice.getText();
        String t3=combobox.getSelectedItem().toString();
        String t4="Decoration";
      
if( (t1.equals("")) || (t2.equals(""))) 
{
JOptionPane.showMessageDialog(null,"Plzzz Enter All Fields");
}
else
{

 try{
		Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
        PreparedStatement ps=con.prepareStatement("Insert into decoration values(?,?,?,?)");
        ps.setString(1,t1);
        ps.setString(2,t2);
        ps.setString(3,t3);
        ps.setString(4,t4);

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
  }      
        @SuppressWarnings("unused")
		int row = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.addRow(new Object[]{t1,t2,t3});   
        
 
    }

    private void btnclearActionPerformed( ActionEvent evt) {
        txtdecorationname.setText("");
         txtdecorationprice.setText("");
    }

    private void bntvenueActionPerformed( ActionEvent evt) {
       Venue venue = new Venue();
venue.setVisible(true);
this.dispose();
    }

    private void jMenuItem6ActionPerformed( ActionEvent evt) {
        Empinfo empinfo = new Empinfo();
        empinfo.setVisible(true);
        this.dispose();
    }

    private void jMenuItem7ActionPerformed( ActionEvent evt) {
        String uname = JOptionPane.showInputDialog("Enter Username:");
        Bill ob=new Bill(uname);
        ob.setVisible(true);
        this.dispose();
    }

   
    private void jMenuItem1ActionPerformed( ActionEvent evt) {
      new CR();
    }

    private void jMenuItem2ActionPerformed( ActionEvent evt) {
      new VO();
    }

    private void jMenuItem3ActionPerformed( ActionEvent evt) {
      new DO();
    }

    private void jMenuItem4ActionPerformed( ActionEvent evt) {
       new FO();
    }

    private void jMenuItem5ActionPerformed( ActionEvent evt) {
      new Emp();
    }
    
    public static void main(String args[]) 
{
Decoration ob=new Decoration();
ob.setVisible(true);
    }

    private   JMenu Transaction;
    private   JButton bntvenue;
    private   JButton btnclear;
    private   JButton btndelete;
    private   JButton btnemployee;
    private   JButton btnfood;
    private   JButton btnupdate;
	private   JComboBox<Object> combobox;
    private   JMenu jMenu1;
    private   JMenu jMenu2;
    private   JMenuBar jMenuBar1;
    private   JMenuItem jMenuItem1;
    private   JMenuItem jMenuItem2;
    private   JMenuItem jMenuItem3;
    private   JMenuItem jMenuItem4;
    private   JMenuItem jMenuItem5;
    private   JMenuItem jMenuItem6;
    private   JMenuItem jMenuItem7;
    private   JPanel jPanel1;
    private   JPanel jPanel2;
    private   JPanel jPanel3;
    private   JPanel jPanel4;
    private   JPanel jPanel5;
    private   JPanel jPanel6;
    private   JPanel jPanel7;
    private   JPanel jPanel8;
    private   JPanel jPanel9;
    private   JLabel label1;
    private   JLabel label2;
    private   JLabel label3;
    private   JLabel label4;
    private   JLabel label5;
    private   JLabel label6;
    private   JLabel label7;
    private   JScrollPane scrollpane1;
    private   JTable table1;
    private   JTextField txtdecorationname;
    private   JTextField txtdecorationprice;
 
}

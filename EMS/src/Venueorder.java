import java.sql.*;


import java.util.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;




public class Venueorder extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6152254470471921515L;
	String un;
    public Venueorder(String uname) {
      initComponents();
    un=uname;
         
    
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
        
        
        table2.setFocusable(false);
        table2.getTableHeader().setReorderingAllowed(false);
        table2.setIntercellSpacing(new java.awt.Dimension(0, 0)); 
        table2.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        table2.getTableHeader().setOpaque(false);
        table2.getTableHeader().setBackground(new Color(75, 190, 237));
        table2.getTableHeader().setForeground(new Color(255,255,255));
        table2.setRowHeight(25);
        table2.setSelectionBackground(new java.awt.Color(75, 190, 237));
        table2.setSelectionForeground(new java.awt.Color(255,255,255));
        table2.setShowVerticalLines(false);
        table2.setShowHorizontalLines(false);   
    
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

table1.setModel(new  DefaultTableModel(
data,head ));
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
        
 // Second Connection---------------------------------------------------------------------------
Connection con2;
PreparedStatement ps2;
ResultSet rs2;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps2=con2.prepareStatement("select * from bill where username='"+uname+"'");

rs2=ps2.executeQuery();
Vector<String> head=new Vector<String>();
ResultSetMetaData rsm=rs2.getMetaData();
int cols=rsm.getColumnCount();

{
head.add("Name");
head.add("Price");
head.add("Type");

}

Vector<Vector<String>> data=new Vector<Vector<String>>();
while(rs2.next())
{
Vector<String> row=new Vector<String>();
for(int i=1;i<=cols;i++)
{
  row.add(rs2.getString(i));
}
data.add(row);
}

table2.setModel(new  DefaultTableModel(
data,head ));
 jScrollPane2.setViewportView(table2);

 
}catch(Exception e)
{
System.out.println(e);
}
    
    
    }

   
   

   
    private void initComponents() {

        jMenuBar1 = new  JMenuBar();
        jMenu1 = new  JMenu();
        jMenu2 = new  JMenu();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btnfood = new  JButton();
        btndecoration = new  JButton();
        panel3 = new  JPanel();
        panel4 = new  JPanel();
        panel5 = new  JPanel();
        label3 = new  JLabel();
        label4 = new  JLabel();
        jScrollPane1 = new  JScrollPane();
        table1 = new  JTable();
        jScrollPane2 = new  JScrollPane();
        table2 = new  JTable();
        panel6 = new  JPanel();
        label5 = new  JLabel();
        panel7 = new  JPanel();
        label6 = new  JLabel();
        btnselectvenue = new  JButton();
        btnremove = new  JButton();
        jMenuBar3 = new  JMenuBar();
        jMenu5 = new  JMenu();
        jMenu6 = new  JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png")));
        panel2.add(label1);
        label1.setBounds(67, 26, 128, 128);

        label2.setFont(new  Font("Trebuchet MS", 1, 36));  
        label2.setForeground(new  Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(47, 172, 172, 42);

        btnfood.setBackground(new  Color(75, 190, 237));
        btnfood.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnfood.setForeground(new  Color(255, 255, 255));
        btnfood.setText("Food");
        btnfood.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });
        panel2.add(btnfood);
        btnfood.setBounds(10, 420, 250, 60);

        btndecoration.setBackground(new  Color(75, 190, 237));
        btndecoration.setFont(new  Font("Trebuchet MS", 1, 24));  
        btndecoration.setForeground(new  Color(255, 255, 255));
        btndecoration.setText("Decoration");
        btndecoration.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btndecorationActionPerformed(evt);
            }
        });
        panel2.add(btndecoration);
        btndecoration.setBounds(10, 350, 250, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 270, 490);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 310, 530);

        panel3.setBackground(new  Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new  Color(255, 255, 255));
        panel4.setForeground(new  Color(255, 255, 255));
        panel4.setLayout(null);

        panel5.setBackground(new  Color(75, 190, 237));
        panel5.setLayout(null);

        label3.setFont(new  Font("Trebuchet MS", 1, 36));  
        label3.setForeground(new  Color(255, 255, 255));
        label3.setText("VENUE ORDER");
        panel5.add(label3);
        label3.setBounds(28, 0, 475, 45);

        label4.setFont(new  Font("Trebuchet MS", 1, 18));  
        label4.setForeground(new  Color(255, 255, 255));
        label4.setText("NOTE : SELECT ONE VENUE");
        panel5.add(label4);
        label4.setBounds(28, 51, 292, 25);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 750, 80);

        table1.setFont(new  Font("Trebuchet MS", 0, 14));  
        table1.setModel(new  DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "PRICE", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(table1);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 143, 368, 280);

        table2.setModel(new  DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "PRICE", "ADDRESS"
            }
        ));
        jScrollPane2.setViewportView(table2);

        panel4.add(jScrollPane2);
        jScrollPane2.setBounds(388, 143, 371, 280);

        panel6.setBackground(new  Color(120, 204, 238));
        panel6.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 18));  
        label5.setForeground(new  Color(255, 255, 255));
        label5.setHorizontalAlignment( SwingConstants.CENTER);
        label5.setText("SELECT FROM THE VENUES BELOW");
        panel6.add(label5);
        label5.setBounds(10, 11, 347, 23);

        panel4.add(panel6);
        panel6.setBounds(10, 98, 368, 40);

        panel7.setBackground(new  Color(120, 204, 238));
        panel7.setLayout(null);

        label6.setFont(new  Font("Trebuchet MS", 1, 18));  
        label6.setForeground(new  Color(255, 255, 255));
        label6.setHorizontalAlignment( SwingConstants.CENTER);
        label6.setText("BILLING TABLE");
        panel7.add(label6);
        label6.setBounds(10, 11, 353, 23);

        panel4.add(panel7);
        panel7.setBounds(387, 98, 373, 40);

        btnselectvenue.setBackground(new  Color(75, 190, 237));
        btnselectvenue.setFont(new  Font("Trebuchet MS", 1, 18));  
        btnselectvenue.setForeground(new  Color(255, 255, 255));
        btnselectvenue.setText("SELECT VENUE");
        btnselectvenue.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnselectvenueActionPerformed(evt);
            }
        });
        panel4.add(btnselectvenue);
        btnselectvenue.setBounds(390, 430, 371, 43);

        btnremove.setBackground(new  Color(75, 190, 237));
        btnremove.setFont(new  Font("Trebuchet MS", 1, 18));  
        btnremove.setForeground(new  Color(255, 255, 255));
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        panel4.add(btnremove);
        btnremove.setBounds(10, 430, 370, 43);

        panel3.add(panel4);
        panel4.setBounds(20, 20, 770, 490);

        getContentPane().add(panel3);
        panel3.setBounds(310, 0, 810, 527);

        jMenu5.setText("Master");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Transaction");
        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1135)/2, (screenSize.height-587)/2, 1135, 587);
    }

    private void btnremoveActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement pst;


int row = table2.getSelectedRow();

String cell = table2.getModel().getValueAt(row,0).toString();
String sql = ("Delete from bill where name='" +cell+"'");
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
    
  DefaultTableModel model = (DefaultTableModel)table2.getModel();
  model.removeRow(row);

    }

    private void btndecorationActionPerformed( ActionEvent evt) {
       Decorationorder decorationorder = new Decorationorder(un);
                decorationorder.setVisible(true);
                decorationorder.saveusername(un);
                this.dispose();
    }

    private void btnfoodActionPerformed( ActionEvent evt) {
    
Foodorder foodorder = new Foodorder(un);
foodorder.setVisible(true);
foodorder.saveusername(un);
this.dispose();
    }
    
   static int f=0;
   int f1=0;
    private void btnselectvenueActionPerformed( ActionEvent evt) {
    	
    	String cell;
try
{
	Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
    Statement sta= co.createStatement();
    int row = table1.getSelectedRow();
     cell = table1.getModel().getValueAt(row,0).toString();
     ResultSet rsp = sta.executeQuery("select * from bill");
while(rsp.next())
{
String a=rsp.getString(1);
String b=rsp.getString(5);
if(a.equals(cell) && b.equals(un))
{
    f=1;
}
}
rsp.close();
sta.close();
co.close();





Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");



            String sql = "INSERT INTO bill("+ "name,"+ "price,"+ "type,"+ "subtype,"+ "username)"+ "VALUES(?,?,?,?,?)";

            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            PreparedStatement pstmt = con1.prepareStatement(sql);

            ResultSet rs = statement.executeQuery("select * from venue");
            
          
            while(rs.next()) 
{
String aa=rs.getString(1);
                if(aa.equals(cell) && (f==0))
{
                String t1 = rs.getString(1);
                String t2 = rs.getString(2);
                String t3 = rs.getString(3);
                String t4 = rs.getString(4);
                String t5 = un;
                pstmt.setString(1, t1);
                pstmt.setString(2, t2);
                pstmt.setString(4, t3);
                pstmt.setString(3, t4);
                pstmt.setString(5, t5);
                pstmt.executeUpdate();
       
        DefaultTableModel model = (DefaultTableModel)table2.getModel();
        model.addRow(new Object[]{t1,t2,t3});
                
}
  }
if(f==1)
{
 JOptionPane.showMessageDialog(null,"You Can Select Only One Venue");
}

        } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);
        } 
     
    }
    public static void main(String args[]) {
      
               Venueorder ob=new Venueorder("abc");
      ob.setVisible(true);
    }
   
    private  JButton btndecoration;
    private  JButton btnfood;
    private  JButton btnremove;
    private  JButton btnselectvenue;
    private  JMenu jMenu1;
    private  JMenu jMenu2;
    private  JMenu jMenu5;
    private  JMenu jMenu6;
    private  JMenuBar jMenuBar1;
    private  JMenuBar jMenuBar3;
    private  JScrollPane jScrollPane1;
    private  JScrollPane jScrollPane2;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JPanel panel1;
    private  JPanel panel2;
    private  JPanel panel3;
    private  JPanel panel4;
    private  JPanel panel5;
    private  JPanel panel6;
    private  JPanel panel7;
    private  JTable table1;
    private  JTable table2;
  
}

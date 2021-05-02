
import java.sql.*;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Foodorder extends JFrame
 {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6099412129119371825L;
	public Foodorder(String uname) 
{
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
ps=con.prepareStatement("select * from food");
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
ps2=con2.prepareStatement("select * from bill where username='"+un+"'");
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

table2.setModel(new DefaultTableModel(
data,head ));
 jScrollPane2.setViewportView(table2);

 
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
        label4 = new  JLabel();
        label3 = new  JLabel();
        jScrollPane1 = new  JScrollPane();
        table1 = new  JTable();
        jScrollPane2 = new  JScrollPane();
        table2 = new  JTable();
        btnadd = new  JButton();
        btnremove = new  JButton();
        btnsnacks = new  JButton();
        btnstarter = new  JButton();
        btnmaincourse = new  JButton();
        btndessert = new  JButton();
        btndrinks = new  JButton();
        btnbill = new  JButton();
        panel6 = new  JPanel();
        label5 = new  JLabel();
        panel7 = new  JPanel();
        label6 = new  JLabel();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btnvenue = new  JButton();
        btndecoration = new  JButton();
        jMenuBar1 = new  JMenuBar();
        jMenu1 = new  JMenu();
        jMenu2 = new  JMenu();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new  Dimension(1000, 720));
        getContentPane().setLayout(null);

        panel3.setBackground(new  Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new  Color(255, 255, 255));
        panel4.setLayout(null);

        panel5.setBackground(new  Color(75, 190, 237));
        panel5.setLayout(null);

        label4.setFont(new  Font("Trebuchet MS", 1, 18));  
        label4.setForeground(new  Color(255, 255, 255));
        label4.setText("NOTE :  SELECT FOOD");
        panel5.add(label4);
        label4.setBounds(10, 47, 581, 21);

        label3.setFont(new  Font("Trebuchet MS", 1, 36));  
        label3.setForeground(new  Color(255, 255, 255));
        label3.setText("FOOD ORDER");
        panel5.add(label3);
        label3.setBounds(10, 11, 678, 30);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 775, 80);

        table1.setModel(new  DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "TYPE", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(table1);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 193, 386, 331);

        table2.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "TYPE", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(table2);

        panel4.add(jScrollPane2);
        jScrollPane2.setBounds(406, 193, 378, 331);

        btnadd.setBackground(new  Color(75, 190, 237));
        btnadd.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnadd.setForeground(new  Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        panel4.add(btnadd);
        btnadd.setBounds(405, 535, 380, 40);

        btnremove.setBackground(new  Color(75, 190, 237));
        btnremove.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnremove.setForeground(new  Color(255, 255, 255));
        btnremove.setText("REMOVE");
        btnremove.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        panel4.add(btnremove);
        btnremove.setBounds(210, 535, 185, 40);

        btnsnacks.setBackground(new  Color(75, 190, 237));
        btnsnacks.setFont(new  Font("Trebuchet MS", 0, 14));  
        btnsnacks.setForeground(new  Color(255, 255, 255));
        btnsnacks.setText("SNACKS");
        btnsnacks.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnsnacks.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnsnacksActionPerformed(evt);
            }
        });
        panel4.add(btnsnacks);
        btnsnacks.setBounds(10, 98, 155, 35);

        btnstarter.setBackground(new  Color(75, 190, 237));
        btnstarter.setFont(new  Font("Trebuchet MS", 0, 14));  
        btnstarter.setForeground(new  Color(255, 255, 255));
        btnstarter.setText("STARTER");
        btnstarter.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnstarter.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnstarterActionPerformed(evt);
            }
        });
        panel4.add(btnstarter);
        btnstarter.setBounds(160, 98, 155, 35);

        btnmaincourse.setBackground(new  Color(75, 190, 237));
        btnmaincourse.setFont(new  Font("Trebuchet MS", 0, 14));  
        btnmaincourse.setForeground(new  Color(255, 255, 255));
        btnmaincourse.setText("MAIN COURSE");
        btnmaincourse.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnmaincourse.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnmaincourseActionPerformed(evt);
            }
        });
        panel4.add(btnmaincourse);
        btnmaincourse.setBounds(310, 98, 170, 35);

        btndessert.setBackground(new  Color(75, 190, 237));
        btndessert.setFont(new  Font("Trebuchet MS", 0, 14));  
        btndessert.setForeground(new  Color(255, 255, 255));
        btndessert.setText("DESSERT");
        btndessert.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btndessert.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btndessertActionPerformed(evt);
            }
        });
        panel4.add(btndessert);
        btndessert.setBounds(480, 98, 155, 35);

        btndrinks.setBackground(new  Color(75, 190, 237));
        btndrinks.setFont(new  Font("Trebuchet MS", 0, 14));  
        btndrinks.setForeground(new  Color(255, 255, 255));
        btndrinks.setText("DRINK");
        btndrinks.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btndrinks.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btndrinksActionPerformed(evt);
            }
        });
        panel4.add(btndrinks);
        btndrinks.setBounds(630, 98, 155, 35);

        btnbill.setBackground(new  Color(75, 190, 237));
        btnbill.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnbill.setForeground(new  Color(255, 255, 255));
        btnbill.setText("BILL");
        btnbill.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnbillActionPerformed(evt);
            }
        });
        panel4.add(btnbill);
        btnbill.setBounds(10, 535, 185, 39);

        panel6.setBackground(new  Color(204, 204, 204));
        panel6.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 18));  
        label5.setForeground(new  Color(255, 255, 255));
        label5.setText("SELECT FROM BELOW");
        panel6.add(label5);
        label5.setBounds(15, 15, 300, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 140, 385, 45);

        panel7.setBackground(new  Color(204, 204, 204));
        panel7.setLayout(null);

        label6.setFont(new  Font("Trebuchet MS", 1, 18));  
        label6.setForeground(new  Color(255, 255, 255));
        label6.setText("YOUR BILL IS BELOW");
        panel7.add(label6);
        label6.setBounds(15, 15, 300, 18);

        panel4.add(panel7);
        panel7.setBounds(407, 140, 377, 45);

        panel3.add(panel4);
        panel4.setBounds(21, 21, 800, 586);

        getContentPane().add(panel3);
        panel3.setBounds(290, 0, 840, 630);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png")));  
        panel2.add(label1);
        label1.setBounds(60, 30, 128, 191);

        label2.setFont(new  Font("Trebuchet MS", 1, 36));  
        label2.setForeground(new  Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(40, 230, 172, 42);

        btnvenue.setBackground(new  Color(75, 190, 237));
        btnvenue.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnvenue.setForeground(new  Color(255, 255, 255));
        btnvenue.setText("Venue");
        btnvenue.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnvenueActionPerformed(evt);
            }
        });
        panel2.add(btnvenue);
        btnvenue.setBounds(10, 520, 230, 60);

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
        btndecoration.setBounds(10, 450, 230, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 250, 590);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 290, 650);

        jMenu1.setText("Master");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1147)/2, (screenSize.height-690)/2, 1147, 690);
    }

    private void btndecorationActionPerformed( ActionEvent evt) {
     Decorationorder decorationorder = new Decorationorder(un);
decorationorder.setVisible(true);
decorationorder.saveusername(un);
this.dispose();
    }

    private void btnvenueActionPerformed(ActionEvent evt) {
     Venueorder venueorder = new Venueorder(un);
venueorder.setVisible(true);
this.dispose();
    }

    private void btnaddActionPerformed( ActionEvent evt) {
     
    int f=0;
String cell;
try {

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

    ResultSet rs = statement.executeQuery("SELECT * FROM food");
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
 JOptionPane.showMessageDialog(null,"You have already Selected this item");
}

        } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);
        } 


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

    private void btnsnacksActionPerformed( ActionEvent evt) {
 Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from food where Food_Type='SNACKS'");
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
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
        

    }

    private void btnstarterActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from food where Food_Type='STARTER'");
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
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
    }

    private void btnmaincourseActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from food where Food_Type='MAIN COURSE'");
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
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
    }

    private void btndessertActionPerformed( ActionEvent evt) {
         Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from food where Food_Type='DESSERT'");
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
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
    }

    private void btndrinksActionPerformed( ActionEvent evt) {
         Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from food where Food_Type='DRINKS'");
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
 jScrollPane1.setViewportView(table1);

 
}catch(Exception e)
{
System.out.println(e);
}
    }

    private void btnbillActionPerformed( ActionEvent evt) {
       Bill bill = new Bill(un);
       bill.setVisible(true);
       bill.saveusername(un);
       this.dispose();
    }

  
    public static void main(String args[])
 {
Foodorder ob=new Foodorder("abc");
ob.setVisible(true);
    }

    private  JButton btnadd;
    private  JButton btnbill;
    private  JButton btndecoration;
    private  JButton btndessert;
    private  JButton btndrinks;
    private  JButton btnmaincourse;
    private  JButton btnremove;
    private  JButton btnsnacks;
    private  JButton btnstarter;
    private  JButton btnvenue;
    private  JMenu jMenu1;
    private  JMenu jMenu2;
    private  JMenuBar jMenuBar1;
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

   public String un;
   public void saveusername(String uname) {
      un=uname;
    }
}

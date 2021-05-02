
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Decorationorder extends  JFrame 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 727711633771704991L;
	public Decorationorder(String uname)
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

table2.setModel(new  DefaultTableModel(
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
        btnstage = new  JButton();
        btnfloor = new  JButton();
        btnlight = new  JButton();
        btnflower = new  JButton();
        btnfirework = new  JButton();
        btnmusic = new  JButton();
        btnadd = new  JButton();
        jScrollPane2 = new  JScrollPane();
        table2 = new  JTable();
        panel6 = new  JPanel();
        label5 = new  JLabel();
        panel7 = new  JPanel();
        label6 = new  JLabel();
        btnremove = new  JButton();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btnvenue = new  JButton();
        btnfood = new  JButton();
        jMenuBar1 = new  JMenuBar();
        jMenu1 = new  JMenu();
        jMenu2 = new  JMenu();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel3.setBackground(new  Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new  Color(255, 255, 255));
        panel4.setLayout(null);

        panel5.setBackground(new  Color(75, 190, 237));
        panel5.setLayout(null);

        label4.setFont(new  Font("Trebuchet MS", 1, 18)); 
        label4.setForeground(new  Color(255, 255, 255));
        label4.setText("NOTE :  SELECT DECORATION");
        panel5.add(label4);
        label4.setBounds(23, 48, 400, 22);

        label3.setFont(new  Font("Trebuchet MS", 1, 36));
        label3.setForeground(new  Color(255, 255, 255));
        label3.setText("DECORATION");
        panel5.add(label3);
        label3.setBounds(23, 0, 216, 42);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 734, 80);

         
        jScrollPane1.setViewportView(table1);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 207, 364, 320);

        btnstage.setBackground(new  Color(75, 190, 237));
        btnstage.setForeground(new  Color(255, 255, 255));
        btnstage.setText("STAGE");
        btnstage.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnstage.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnstageActionPerformed(evt);
            }
        });
        panel4.add(btnstage);
        btnstage.setBounds(10, 110, 125, 35);

        btnfloor.setBackground(new  Color(75, 190, 237));
        btnfloor.setForeground(new  Color(255, 255, 255));
        btnfloor.setText("FLOOR ");
        btnfloor.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnfloor.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnfloorActionPerformed(evt);
            }
        });
        panel4.add(btnfloor);
        btnfloor.setBounds(130, 110, 125, 35);

        btnlight.setBackground(new  Color(75, 190, 237));
        btnlight.setForeground(new  Color(255, 255, 255));
        btnlight.setText("LIGHT");
        btnlight.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnlight.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnlightActionPerformed(evt);
            }
        });
        panel4.add(btnlight);
        btnlight.setBounds(375, 110, 125, 35);

        btnflower.setBackground(new  Color(75, 190, 237));
        btnflower.setForeground(new  Color(255, 255, 255));
        btnflower.setText("FLOWER");
        btnflower.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnflower.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnflowerActionPerformed(evt);
            }
        });
        panel4.add(btnflower);
        btnflower.setBounds(250, 110, 125, 35);

        btnfirework.setBackground(new  Color(75, 190, 237));
        btnfirework.setForeground(new  Color(255, 255, 255));
        btnfirework.setText("FIREWORK");
        btnfirework.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnfirework.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnfireworkActionPerformed(evt);
            }
        });
        panel4.add(btnfirework);
        btnfirework.setBounds(620, 110, 125, 35);

        btnmusic.setBackground(new  Color(75, 190, 237));
        btnmusic.setForeground(new  Color(255, 255, 255));
        btnmusic.setText("MUSIC");
        btnmusic.setBorder( BorderFactory.createLineBorder(new  Color(75, 190, 237)));
        btnmusic.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnmusicActionPerformed(evt);
            }
        });
        panel4.add(btnmusic);
        btnmusic.setBounds(500, 110, 125, 35);

        btnadd.setBackground(new  Color(75, 190, 237));
        btnadd.setFont(new  Font("Trebuchet MS", 1, 18));
        btnadd.setForeground(new  Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        panel4.add(btnadd);
        btnadd.setBounds(380, 540, 364, 40);

         
        jScrollPane2.setViewportView(table2);

        panel4.add(jScrollPane2);
        jScrollPane2.setBounds(380, 207, 364, 320);

        panel6.setBackground(new  Color(204, 204, 204));
        panel6.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 14));
        label5.setForeground(new  Color(255, 255, 255));
        label5.setText("SELECT FROM BELOW");
        panel6.add(label5);
        label5.setBounds(10, 11, 300, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 155, 365, 40);

        panel7.setBackground(new  Color(204, 204, 204));
        panel7.setLayout(null);

        label6.setFont(new  Font("Trebuchet MS", 1, 14));
        label6.setForeground(new  Color(255, 255, 255));
        label6.setText("YOUR BILL IS BELOW");
        panel7.add(label6);
        label6.setBounds(10, 11, 230, 18);

        panel4.add(panel7);
        panel7.setBounds(380, 155, 365, 40);

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
        btnremove.setBounds(10, 540, 364, 40);

        panel3.add(panel4);
        panel4.setBounds(20, 20, 754, 590);

        getContentPane().add(panel3);
        panel3.setBounds(331, 0, 796, 630);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png")));
        panel2.add(label1);
        label1.setBounds(75, 28, 128, 176);

        label2.setFont(new  Font("Trebuchet MS", 1, 36));
        label2.setForeground(new  Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(55, 222, 172, 42);

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
        btnvenue.setBounds(10, 450, 270, 60);

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
        btnfood.setBounds(10, 520, 270, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 290, 590);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 331, 630);

        jMenu1.setText("Master");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1143)/2, (screenSize.height-692)/2, 1143, 692);
    }

    private void btnfireworkActionPerformed( ActionEvent evt) {
      Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='FIREWORK'");
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
//JOptionPane.showMessageDialog (this,"Record Deleted Successfully");  

}
catch(Exception e)
{
JOptionPane.showMessageDialog (null,e);
}     
    
  DefaultTableModel model = (DefaultTableModel)table2.getModel();
  model.removeRow(row);
        
        
    }

    private void btnvenueActionPerformed( ActionEvent evt) {
   
Venueorder venueorder = new Venueorder(un);
venueorder.setVisible(true);
this.dispose();
    }

    private void btnfoodActionPerformed( ActionEvent evt) {
  
Foodorder foodorder = new Foodorder(un);
foodorder.setVisible(true);
foodorder.saveusername(un);
this.dispose();
    }

    private void btnaddActionPerformed( ActionEvent evt) {
    

 try {
	
     Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement sta= co.createStatement();
  int f=0;
String cell;
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

            ResultSet rs = statement.executeQuery("SELECT * FROM decoration");
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

    private void btnstageActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='STAGE'");
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
    }                                        

    private void btnfloorActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='FLOOR'");
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
    }

    private void btnflowerActionPerformed( ActionEvent evt) {
       Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='FLOWERs'");
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
    }

    private void btnlightActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='LIGHTs'");
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
    }

    private void btnmusicActionPerformed( ActionEvent evt) {
        Connection con;
PreparedStatement ps;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
ps=con.prepareStatement("select * from decoration where Decoration_Type='MUSIC'");
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
    }

   
    public static void main(String args[])
 {

        Decorationorder ob=new Decorationorder("abc");
        ob.setVisible(true);
    }
 
    private  JButton btnadd;
    private  JButton btnfirework;
    private  JButton btnfloor;
    private  JButton btnflower;
    private  JButton btnfood;
    private  JButton btnlight;
    private  JButton btnmusic;
    private  JButton btnremove;
    private  JButton btnstage;
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

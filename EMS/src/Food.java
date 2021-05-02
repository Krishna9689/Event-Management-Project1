import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;




public class Food extends JFrame 
{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1431062735216703724L;
	public Food()
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
        txtname = new  JTextField();
        txtprice = new  JTextField();
        jScrollPane1 = new  JScrollPane();
        table1 = new  JTable();
        btnupdate = new  JButton();
        btndelete = new  JButton();
        btnclear = new  JButton();
        panel6 = new  JPanel();
        label5 = new  JLabel();
        panel7 = new  JPanel();
        label6 = new  JLabel();
        panel8 = new  JPanel();
        label7 = new  JLabel();
        combobox = new  JComboBox<Object>();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btnvenue = new  JButton();
        btnemploye = new  JButton();
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
        setBackground(new  Color(255, 255, 255));
        getContentPane().setLayout(null);

        panel3.setBackground(new  Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new  Color(255, 255, 255));
        panel4.setLayout(null);

        panel5.setBackground(new  Color(75, 190, 237));
        panel5.setLayout(null);

        label3.setFont(new  Font("Trebuchet MS", 1, 36));  
        label3.setForeground(new  Color(255, 255, 255));
        label3.setText("Food Menu");
        panel5.add(label3);
        label3.setBounds(39, 0, 183, 42);

        label4.setFont(new  Font("Trebuchet MS", 1, 14));  
        label4.setForeground(new  Color(255, 255, 255));
        label4.setText("All Fields are Compulsary");
        panel5.add(label4);
        label4.setBounds(39, 48, 163, 18);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 691, 75);
        panel4.add(txtname);
        txtname.setBounds(10, 130, 225, 50);
        panel4.add(txtprice);
        txtprice.setBounds(476, 130, 225, 50);

        table1.setModel(new  DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(table1);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 198, 691, 288);

        btnupdate.setBackground(new  Color(75, 190, 237));
        btnupdate.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnupdate.setForeground(new  Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        panel4.add(btnupdate);
        btnupdate.setBounds(470, 504, 230, 50);

        btndelete.setBackground(new  Color(75, 190, 237));
        btndelete.setFont(new  Font("Trebuchet MS", 1, 24));  
        btndelete.setForeground(new  Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setActionCommand("REMOVE");
        btndelete.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        panel4.add(btndelete);
        btndelete.setBounds(240, 504, 224, 50);

        btnclear.setBackground(new  Color(75, 190, 237));
        btnclear.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnclear.setForeground(new  Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panel4.add(btnclear);
        btnclear.setBounds(10, 504, 224, 50);

        panel6.setBackground(new  Color(75, 190, 224));
        panel6.setLayout(null);

        label5.setFont(new  Font("Trebuchet MS", 1, 14));  
        label5.setForeground(new  Color(255, 255, 255));
        label5.setText(" NAME");
        panel6.add(label5);
        label5.setBounds(10, 0, 40, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 112, 225, 20);

        panel7.setBackground(new  Color(75, 190, 224));
        panel7.setLayout(null);

        label6.setFont(new  Font("Trebuchet MS", 1, 14));  
        label6.setForeground(new  Color(255, 255, 255));
        label6.setText("TYPE");
        panel7.add(label6);
        label6.setBounds(10, 0, 33, 18);

        panel4.add(panel7);
        panel7.setBounds(245, 112, 225, 20);

        panel8.setBackground(new  Color(75, 190, 224));
        panel8.setLayout(null);

        label7.setFont(new  Font("Trebuchet MS", 1, 14));  
        label7.setForeground(new  Color(255, 255, 255));
        label7.setText("PRICE");
        panel8.add(label7);
        label7.setBounds(10, 0, 38, 18);

        panel4.add(panel8);
        panel8.setBounds(476, 112, 225, 20);

        combobox.setModel(new  DefaultComboBoxModel<Object>(new String[] { "SNACKS", "STARTER", "MAIN COURSE", "DESSERT", "DRINKS" }));
        panel4.add(combobox);
        combobox.setBounds(245, 130, 225, 50);

        panel3.add(panel4);
        panel4.setBounds(20, 20, 710, 570);

        getContentPane().add(panel3);
        panel3.setBounds(310, 0, 750, 610);

        panel1.setBackground(new  Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new  Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png"))); 
        panel2.add(label1);
        label1.setBounds(70, 30, 128, 142);

        label2.setFont(new  Font("Trebuchet MS", 1, 36));  
        label2.setForeground(new  Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(47, 186, 172, 42);

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
        btnvenue.setBounds(10, 500, 250, 60);

        btnemploye.setBackground(new  Color(75, 190, 237));
        btnemploye.setFont(new  Font("Trebuchet MS", 1, 24));  
        btnemploye.setForeground(new  Color(255, 255, 255));
        btnemploye.setText("Employee");
        btnemploye.addActionListener(new  ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                btnemployeActionPerformed(evt);
            }
        });
        panel2.add(btnemploye);
        btnemploye.setBounds(10, 360, 250, 60);

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
        btndecoration.setBounds(10, 430, 250, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 270, 570);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 310, 610);

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

         Dimension screenSize =  Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1076)/2, (screenSize.height-670)/2, 1076, 670);
    }// </editor-fold>                        

    private void btnemployeActionPerformed( ActionEvent evt) {
Empinfo employee = new Empinfo();
employee.setVisible(true);
this.dispose();      
    }

    private void btnvenueActionPerformed( ActionEvent evt) {    
Venue venue = new Venue();
venue.setVisible(true);
this.dispose();
    }

    private void btnupdateActionPerformed( ActionEvent evt) {
        String t1=txtname.getText();
        String t2=txtprice.getText();
        String t3=combobox.getSelectedItem().toString();
        String t4="Food";
      
 try{
	 Class.forName("com.mysql.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
        PreparedStatement ps=con.prepareStatement("Insert into food values(?,?,?,?)");
        ps.setString(1,t1);
        ps.setString(2,t2);
        ps.setString(3,t3);
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
 
 
DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.addRow(new Object[]{t1,t2,t3});
    }

    private void btndeleteActionPerformed( ActionEvent evt) {
  Connection con;
  PreparedStatement pst;
  
  
int row = table1.getSelectedRow();

String cell = table1.getModel().getValueAt(row,0).toString();
String sql = ("Delete from food where Food_Name='" +cell+"'");
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

    private void btnclearActionPerformed( ActionEvent evt) {
         txtname.setText("");
         txtprice.setText("");
    }

    private void btndecorationActionPerformed( ActionEvent evt) {
       Decoration decoration = new Decoration();
decoration.setVisible(true);
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
     Food ob=new Food();
     ob.setVisible(true);
    }
    private  JMenu Transaction;
    private  JButton btnclear;
    private  JButton btndecoration;
    private  JButton btndelete;
    private  JButton btnemploye;
    private  JButton btnupdate;
    private  JButton btnvenue;
    private  JComboBox<Object> combobox;
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
    private  JTextField txtname;
    private  JTextField txtprice;
}

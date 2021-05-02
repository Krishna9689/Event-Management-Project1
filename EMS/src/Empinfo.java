import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import javax.swing.table.DefaultTableModel;

public class Empinfo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3440769382895228243L;
	public Empinfo() {
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
           ps=con.prepareStatement("select * from employee");
           rs=ps.executeQuery();
         Vector<String> head=new Vector<String>();
         ResultSetMetaData rsm=rs.getMetaData();
         int cols=rsm.getColumnCount();
         
         {
           head.add("Name");
           head.add("Mobile No");
           head.add("Address");
           head.add("Email");
           head.add("Designation");
           head.add("Salary");
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

    private void initComponents() {

        jTextField2 = new  JTextField();
        panel3 = new  JPanel();
        panel4 = new  JPanel();
        txtfullname = new  JTextField();
        txtaddress = new  JTextField();
        txtmobileno = new  JTextField();
        txtemail = new  JTextField();
        txtsalary = new  JTextField();
        txtdesignation = new  JTextField();
        jScrollPane1 = new  JScrollPane();
        table1 = new  JTable();
        btnupdate = new  JButton();
        btnclear = new  JButton();
        btndelete = new  JButton();
        panel5 = new  JPanel();
        label3 = new  JLabel();
        panel7 = new  JPanel();
        label5 = new  JLabel();
        panel6 = new  JPanel();
        label4 = new  JLabel();
        panel8 = new  JPanel();
        label6 = new  JLabel();
        panel9 = new  JPanel();
        label7 = new  JLabel();
        panel10 = new  JPanel();
        label8 = new  JLabel();
        panel11 = new  JPanel();
        label9 = new  JLabel();
        panel1 = new  JPanel();
        panel2 = new  JPanel();
        label1 = new  JLabel();
        label2 = new  JLabel();
        btndecoration = new  JButton();
        btnfood = new  JButton();
        btnvenue = new  JButton();
        labelsearch = new  JLabel();
        txtsearch = new  JTextField();
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

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel3.setBackground(new java.awt.Color(153, 153, 153));
        panel3.setLayout(null);

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setPreferredSize(new java.awt.Dimension(600, 600));
        panel4.setLayout(null);

        txtfullname.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        txtfullname.setPreferredSize(new java.awt.Dimension(300, 50));
        panel4.add(txtfullname);
        txtfullname.setBounds(10, 98, 300, 50);

        txtaddress.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        txtaddress.setPreferredSize(new java.awt.Dimension(615, 50));

        panel4.add(txtaddress);
        txtaddress.setBounds(10, 184, 630, 50);

        txtmobileno.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        txtmobileno.setPreferredSize(new java.awt.Dimension(300, 50));
        panel4.add(txtmobileno);
        txtmobileno.setBounds(340, 98, 300, 50);

        txtemail.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        txtemail.setPreferredSize(new java.awt.Dimension(300, 50));
        panel4.add(txtemail);
        txtemail.setBounds(10, 263, 630, 50);

        txtsalary.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        panel4.add(txtsalary);
        txtsalary.setBounds(10, 340, 300, 50);
        panel4.add(txtdesignation);
        txtdesignation.setBounds(339, 340, 300, 50);

        table1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Full name", "Mobile No", "Address", "Emaiil","Designation","Salary"
            }
        ));
        table1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode( ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        panel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 398, 631, 145);

        btnupdate.setBackground(new java.awt.Color(75, 190, 237));
        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE INFO");
        btnupdate.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        panel4.add(btnupdate);
        btnupdate.setBounds(330, 554, 304, 35);

        btnclear.setBackground(new java.awt.Color(75, 190, 237));
        btnclear.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        panel4.add(btnclear);
        btnclear.setBounds(10, 554, 150, 35);

        btndelete.setBackground(new java.awt.Color(75, 190, 237));
        btndelete.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        panel4.add(btndelete);
        btndelete.setBounds(166, 554, 150, 35);

        panel5.setBackground(new java.awt.Color(75, 190, 237));
        panel5.setLayout(null);

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("EMPLOYEE INFORMATION");
        panel5.add(label3);
        label3.setBounds(10, 11, 312, 29);

        panel4.add(panel5);
        panel5.setBounds(10, 11, 630, 60);

        panel7.setBackground(new java.awt.Color(75, 190, 224));
        panel7.setLayout(null);

        label5.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("MOBILE NO");
        panel7.add(label5);
        label5.setBounds(10, 0, 71, 18);

        panel4.add(panel7);
        panel7.setBounds(340, 80, 300, 20);

        panel6.setBackground(new java.awt.Color(75, 190, 224));
        panel6.setLayout(null);

        label4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("FULL NAME");
        panel6.add(label4);
        label4.setBounds(10, 0, 73, 18);

        panel4.add(panel6);
        panel6.setBounds(10, 80, 300, 20);

        panel8.setBackground(new java.awt.Color(75, 190, 224));
        panel8.setLayout(null);

        label6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("ADDRESS");
        panel8.add(label6);
        label6.setBounds(10, 0, 58, 18);

        panel4.add(panel8);
        panel8.setBounds(10, 166, 630, 20);

        panel9.setBackground(new java.awt.Color(75, 190, 224));
        panel9.setLayout(null);

        label7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("EMAIL");
        panel9.add(label7);
        label7.setBounds(10, 0, 39, 18);

        panel4.add(panel9);
        panel9.setBounds(10, 245, 630, 20);

        panel10.setBackground(new java.awt.Color(75, 190, 224));
        panel10.setLayout(null);

        label8.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("SALARY");
        panel10.add(label8);
        label8.setBounds(10, 0, 50, 18);

        panel4.add(panel10);
        panel10.setBounds(10, 325, 300, 20);

        panel11.setBackground(new java.awt.Color(75, 190, 224));
        panel11.setLayout(null);

        label9.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("DESIGNATION");
        panel11.add(label9);
        label9.setBounds(10, 0, 87, 18);

        panel4.add(panel11);
        panel11.setBounds(339, 325, 300, 20);

        panel3.add(panel4);
        panel4.setBounds(20, 20, 650, 600);

        getContentPane().add(panel3);
        panel3.setBounds(320, 0, 690, 640);

        panel1.setBackground(new java.awt.Color(75, 190, 237));
        panel1.setLayout(null);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(null);

        label1.setHorizontalAlignment( SwingConstants.CENTER);
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel.png")));
        panel2.add(label1);
        label1.setBounds(75, 28, 128, 145);

        label2.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        label2.setForeground(new java.awt.Color(75, 190, 237));
        label2.setText("Gryffindor");
        panel2.add(label2);
        label2.setBounds(55, 191, 172, 42);

        btndecoration.setBackground(new java.awt.Color(75, 190, 237));
        btndecoration.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        btndecoration.setForeground(new java.awt.Color(255, 255, 255));
        btndecoration.setText("Decoration");
        btndecoration.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btndecorationActionPerformed(evt);
            }
        });
        panel2.add(btndecoration);
        btndecoration.setBounds(10, 390, 260, 60);

        btnfood.setBackground(new java.awt.Color(75, 190, 237));
        btnfood.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        btnfood.setForeground(new java.awt.Color(255, 255, 255));
        btnfood.setText("Food");
        btnfood.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnfoodActionPerformed(evt);
            }
        });
        panel2.add(btnfood);
        btnfood.setBounds(10, 530, 260, 60);

        btnvenue.setBackground(new java.awt.Color(75, 190, 237));
        btnvenue.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        btnvenue.setForeground(new java.awt.Color(255, 255, 255));
        btnvenue.setText("Venue");
        btnvenue.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                btnvenueActionPerformed(evt);
            }
        });
        panel2.add(btnvenue);
        btnvenue.setBounds(10, 460, 260, 60);

        labelsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png")));
        labelsearch.addMouseListener(new   MouseAdapter() {
            public void mouseClicked(  MouseEvent evt) {
                labelsearchMouseClicked(evt);
            }
        });
        labelsearch.addAncestorListener(new   AncestorListener() {
            public void ancestorMoved(  AncestorEvent evt) {
            }
            public void ancestorAdded(  AncestorEvent evt) {
                labelsearchAncestorAdded(evt);
            }
            public void ancestorRemoved(  AncestorEvent evt) {
            }
        });
        panel2.add(labelsearch);
        labelsearch.setBounds(220, 320, 50, 60);

        txtsearch.setText("Enter Employee Name");
        txtsearch.addMouseListener(new   MouseAdapter() {
            public void mouseClicked(  MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        panel2.add(txtsearch);
        txtsearch.setBounds(10, 320, 210, 60);

        panel1.add(panel2);
        panel2.setBounds(20, 20, 280, 600);

        getContentPane().add(panel1);
        panel1.setBounds(-2, 0, 320, 640);

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

        jMenuItem2.setText("Venue Report");
        jMenuItem2.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Decoration Report");
        jMenuItem3.addActionListener(new   ActionListener() {
            public void actionPerformed(  ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Food Report");
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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1026)/2, (screenSize.height-700)/2, 1026, 700);
    }



    private void btndecorationActionPerformed(  ActionEvent evt) {
Decoration decoration = new Decoration();
decoration.setVisible(true);
this.dispose();
    }
    private void btnvenueActionPerformed(  ActionEvent evt) {

Venue venue = new Venue();
venue.setVisible(true);
this.dispose();

    }

    private void btnfoodActionPerformed(  ActionEvent evt) {
Food food = new Food();
food.setVisible(true);
this.dispose();    
    }

    private void btnupdateActionPerformed(  ActionEvent evt) {
       
        
        String t1=txtfullname.getText();
        String t2=txtmobileno.getText();
        String t3=txtaddress.getText();
        String t4=txtemail.getText();
        String t5=txtsalary.getText();
        String t6=txtdesignation.getText();

if( (t1.equals("")) || (t2.equals("")) || (t3.equals("")) || (t4.equals("")) || (t5.equals("")) || (t6.equals("")) ) 
{
JOptionPane.showMessageDialog(null,"Plzzz Enter All Fields");
}
else
{

	Pattern patter=Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
	Matcher matche=patter.matcher(t1);
	 if(!(matche.matches()))
                     {
                      JOptionPane.showMessageDialog(null,"Plzz Enter Valid Name:");
                     }
                          else 
	         {
		 Pattern paaa=Pattern.compile("(0/91)?[7-9][0-9]{9}");
	 	 Matcher maaa=paaa.matcher(t2);
	 	if(!(maaa.find() && maaa.group().equals(t2)))
		  {
    		 JOptionPane.showMessageDialog(null,"Plzz Enter Valid Phone no:");
 		 }
                  	  else 
                 		  {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+

         	                   "[a-zA-Z0-9_+&*-]+)*@" + 

        	                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 

         	                   "A-Z]{2,7}$"; 
      		  Pattern patt = Pattern.compile(emailRegex); 
		if(!(patt.matcher(t4).matches()))
	{
	JOptionPane.showMessageDialog(null,"Enter Valid Email Address");
	}
	else
                        {

		           String ss="^[0-9]+.?[0-9]{2}?$";
		          Pattern paa=Pattern.compile(ss);
		          Matcher maa=paa.matcher(t5);
		          if(!(maa.matches()))
 		              {
   		               JOptionPane.showMessageDialog(null,"Plzz Enter Valid Amount:");
 		                   }
             		                  else
              		                      {

        try{
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
            Statement st=con.createStatement();
            
           ResultSet rs=st.executeQuery("select * from employee where name='"+t1+"' ");

            if(!rs.next())
           {
               int k=st.executeUpdate("insert into employee values('"+t1+"','"+t2+"','"+t3+"','"+t4+"','"+t5+"','"+t6+"')");
               if(k>=1)
               {
               JOptionPane.showMessageDialog(null,"Record Inserted...");   
Empinfo em=new Empinfo();
    em.setVisible(true);
    this.dispose();
       DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.addRow(new Object[]{t1,t2,t3,t4,t6,t5});
          
               }
          }else
                  {
                 int k=st.executeUpdate("update employee set name='"+t1+"',mobile_No='"+t2+"',address='"+t3+"',email='"+t4+"',designation='"+t6+"',salary='"+t5+"'where name='"+t1+"'");
                  if(k>=1)
                  {
               JOptionPane.showMessageDialog(null,"Record Updated...");           
Empinfo em=new Empinfo();
    em.setVisible(true);
    this.dispose();
       DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.addRow(new Object[]{t1,t2,t3,t4,t6,t5});
          
                  }
             } 
            
         rs.close();
          st.close();
          con.close();          
        }catch(Exception e){
         JOptionPane.showMessageDialog(null," "+e);
        }  
    
       }
}
}
}
}     
    

       

    }

    private void btndeleteActionPerformed(  ActionEvent evt) {                                          
      
Connection con;
PreparedStatement pst;


int row = table1.getSelectedRow();

String cell = table1.getModel().getValueAt(row,0).toString();


String sql = ("Delete from employee where Name='" +cell+"'");
try
{
	Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
    pst = con.prepareStatement(sql);
    pst.executeUpdate();     
JOptionPane.showMessageDialog (this,"Record Deleted Successfully");  
}
catch(Exception e)
{
JOptionPane.showMessageDialog (null,e);
}     
    
  DefaultTableModel model = (DefaultTableModel)table1.getModel();
  model.removeRow(row);
    }

    private void btnclearActionPerformed(  ActionEvent evt) {                                         
         txtfullname.setText("");
         txtmobileno.setText("");
         txtemail.setText("");
         txtdesignation.setText("");
         txtsalary.setText("");
         txtaddress.setText("");
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
   //     CR cust=new CR();
    }

    private void jMenuItem2ActionPerformed(  ActionEvent evt) {
     //   VO venue=new VO();
    }

    private void jMenuItem3ActionPerformed(  ActionEvent evt) {
     //   DO venue=new DO();
    }

    private void jMenuItem4ActionPerformed(  ActionEvent evt) {
      //  FO venue=new FO();
    }

    private void jMenuItem5ActionPerformed(  ActionEvent evt) {
       // Emp venue=new Emp();
  
    }

    private void txtsearchMouseClicked(  MouseEvent evt) {
      txtsearch.setText("");
    }

    private void labelsearchAncestorAdded(  AncestorEvent evt) {   }

    private void labelsearchMouseClicked(  MouseEvent evt) {
String search=txtsearch.getText();
try{
Connection con;
Statement pst;
ResultSet rs;


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
pst=con.createStatement();
rs=pst.executeQuery("select * from employee where Name='"+search+"'"); 
    if(rs.next())
    {
txtfullname.setText(""+rs.getString(1));
txtmobileno.setText(""+rs.getString(2));
txtaddress.setText(""+rs.getString(3));
txtemail.setText(""+rs.getString(4));
txtsalary.setText(""+rs.getString(5));
txtdesignation.setText(""+rs.getString(6)); 
}
}
catch(Exception e)
 {
 System.out.println(e);      
 }        
    }

    public static void main(String args[]) {
Empinfo ob=new Empinfo();
ob.setVisible(true);
    }

    private  JMenu Transaction;
    private  JButton btnclear;
    private  JButton btndecoration;
    private  JButton btndelete;
    private  JButton btnfood;
    private  JButton btnupdate;
    private  JButton btnvenue;
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
    private  JTextField jTextField2;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JLabel label7;
    private  JLabel label8;
    private  JLabel label9;
    private  JLabel labelsearch;
    private  JPanel panel1;
    private  JPanel panel10;
    private  JPanel panel11;
    private  JPanel panel2;
    private  JPanel panel3;
    private  JPanel panel4;
    private  JPanel panel5;
    private  JPanel panel6;
    private  JPanel panel7;
    private  JPanel panel8;
    private  JPanel panel9;
    private  JTable table1;
    private  JTextField txtaddress;
    private  JTextField txtdesignation;
    private  JTextField txtemail;
    private  JTextField txtfullname;
    private  JTextField txtmobileno;
    private  JTextField txtsalary;
    private  JTextField txtsearch;

}

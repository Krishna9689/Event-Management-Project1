

import javax.swing.*;
import java.io.*;
import java.sql.*;
// import java.text.SimpleDateFormat;
public class CR
{
   
CR()
  {
   	Connection cn=null; 
  	try
   	{
    
       	BufferedWriter bw=new BufferedWriter(new FileWriter("Cust.html"));

       	Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/palace","root","");
   	Statement st=cn.createStatement();
        	ResultSet rs=st.executeQuery("select *  from  customer");
        	ResultSetMetaData rsm=rs.getMetaData();
        	int cols=rsm.getColumnCount();
        	bw.write("<html><head><title>Customer Report</title></head>");
        	bw.write("<body bgcolor=white>");
       

        	bw.write("<h1 align=center><font color=Brown>Event Management</h1>");
        	bw.write("<hr>");
         	bw.write("<h2 align=center><font color=Red>Customer ReportT</h2>");
        	bw.write("<pre>");
       	bw.write("<font color=blue>");
    //   	SimpleDateFormat dateFormat = new SimpleDateFormat ( "dd/MM/yyyy", Locale.getDefault() );     
        	  
        	bw.write("Date:-\n");
            bw.write("Reg No-:-shrirampur_45002                                         Ph No-(02422-222222)</pre>");
            bw.write("Address:-Shrirampur <br>Cd Jain College");        
            bw.write("<hr>");
        

        	bw.write("<table bgcolor=white align=center  border=3 width=600>");
        	bw.write("<tr>");        
        	for(int i=1;i<=cols;i++)
        	{
	bw.write("<th>"+rsm.getColumnName(i));
        	}
        	bw.write("</tr>");        
        
        	while(rs.next())
        	{
          	bw.write("<tr>");        
          
          	for(int i=1;i<=cols;i++)
           	{
            	bw.write("<td>"+rs.getString(i));
           	}     
          	bw.write("</tr>");        
        	}
        	bw.write("</table>");                
  
     	bw.write("<hr><br><h4 align=right> Authorised Sign");
   		rs.close();
    		bw.close();

    	Runtime r=Runtime.getRuntime();
    	r.exec("explorer Cust.html");
  	}
   	catch(Exception ed)
   	{
     	JOptionPane.showMessageDialog(null,"Err="+ed);
   	}
	}
	public static void main(String aaaa[])
	{
new CR();
	}
}
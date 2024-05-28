package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
/**
 * This class is used to fetch data from the database 
 * @param query
 * @throws SQLException
 */
public class ClientCare_DataBase_Utility {
	
	Connection conn ;
	/**
	 * This method is used to get connection to database
	 * @param url
	 * @param username
	 * @param password
	 * @throws Throwable
	 */
     public void getConnection() throws Throwable {
    	 try {
    	 Driver driverref=new Driver();
    	 DriverManager.registerDriver(driverref);
    	 conn = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
    	 }catch(Exception e) {
    		 
    	 }
     }
     /**
      * This method is used to execute query
      * @param query
      * @throws SQLException
      */
     public ResultSet getExecuteQuery(String query) throws SQLException {
    	 ResultSet res=null;
    	 try {
    	 Statement stat = conn.createStatement();
    	  res = stat.executeQuery(query);
    	 }
    	 catch(Exception e) {
    	 }
    	 return res;
     }
     /**
      * This method is used to Update the table in the database
      * @param query
      * @return
      */
     public int  getUpdateQuery(String query) {
    	 int res=0;
    	 try {
    		 Statement stat = conn.createStatement();
    		  res = stat.executeUpdate(query);
    	 }
    	 catch(Exception e) {
    	 }
    	 return res;
    	 
     }
     /**
      * This method is used to close the connection to database
      * @throws SQLException
      */
     public void getCloseConnection() throws SQLException {
    	 try {
    	 conn.close();
    	 }catch(Exception e) {
    		 
    	 }
     }
     
    

	
}

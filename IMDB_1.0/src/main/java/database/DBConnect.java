// This File will be used for connection with the database and executing queries

package database;
import java.sql.*;

import variables.GlobalVariables;

//Connect to the sqlite database
public class DBConnect
{
	GlobalVariables objGlobal = new GlobalVariables();
	public void Connect(){
    try {
      Class.forName(objGlobal.strSQLite);
      objGlobal.conn = DriverManager.getConnection(objGlobal.strDBPath);
      objGlobal.conn.setAutoCommit(false);
      System.out.println("Opened database successfully");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
  }
	
	//This method will execute the sql queries to fetch/update data.
    public void exeQuery(String query) throws SQLException{
    	objGlobal.stmt = null;
	  	objGlobal.stmt = objGlobal.conn.createStatement();
    	objGlobal.stmt.executeUpdate(query);
		objGlobal.stmt.close();
		objGlobal.conn.commit();
  }
}
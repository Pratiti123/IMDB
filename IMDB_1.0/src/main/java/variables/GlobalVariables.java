//This file consists of variables used throughout the project

package variables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GlobalVariables {
	public Statement stmt;
	public Connection conn;
	public ResultSet rs;
	public String strSQLite = "org.sqlite.JDBC";
	public String strDBPath = "jdbc:sqlite:D:\\QA\\Space\\IMDB\\IMDB_1.0\\IMDB.sqlite";
	public String strQuery;
	public String strFilePath = "D:\\QA\\Space\\IMDB_Top_250_Movie_List.csv";
}

package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Database
{
	public Connection getConnection() throws Exception
	{
		try
		{
			String connectionURL = "jdbc:mysql://mdarisrac02d:3306/pancancer?useAffectedRows=true";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "panuser", "panuser");
			return connection;
		} 
		catch (Exception e)
		{
			throw e;
		}
 
	}
 
}

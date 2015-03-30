package model;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
 
import dao.Access;
import dao.Database;
import dto.CGHubData;
 
public class AccessManager
{
	public ArrayList<CGHubData> getCgdata() throws Exception
	{
		ArrayList<CGHubData> cgList = new ArrayList<CGHubData>();
		Database db = new Database();
		Connection con = db.getConnection();
		Access access = new Access();
		cgList = access.getCgdata(con);
		return cgList;
	}
}
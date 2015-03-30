package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
import dto.CGHubData;
 
public class Access
{
	public ArrayList<CGHubData> getCgdata(Connection con) throws SQLException
	{
		ArrayList<CGHubData> cgList = new ArrayList<CGHubData>();
//		PreparedStatement stmt = con.prepareStatement("SELECT analysis_id, barcode case when bam_or_fastq=\'bam\' then bam_path when bam_or_fastq=\'fastq\' then fastq_path end from cghub");
		PreparedStatement stmt = con.prepareStatement("SELECT analysis_id, barcode from cghub");
		ResultSet rs = stmt.executeQuery();
		try
		{
			while(rs.next())
			{
				CGHubData cgRecord = new CGHubData();
				cgRecord.setAnalysisId(rs.getString(1));
				cgRecord.setBarcode(rs.getString(2));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
return cgList;
 
	}
}
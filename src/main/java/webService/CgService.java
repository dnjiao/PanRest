package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.CGHubData;
import model.AccessManager;



@Path("/cgService")
public class CgService
{
	@GET
	@Path("/cgdata")
	@Produces("application/json")
	public String cgrecord()
	{
		String cgdata = null;
		ArrayList<CGHubData> cgList = new ArrayList<CGHubData>();
		try
		{
			cgList = new AccessManager().getCgdata();
			Gson gson = new Gson();
			cgdata = gson.toJson(cgList);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return cgdata;
	}
//	@GET
//	@Path("/{parameter}")
//	public Response responseMsg( @PathParam("parameter") String parameter,
//			@DefaultValue("Nothing to say") @QueryParam("value") String value) {
//
//		String output = "Hello from: " + parameter + " : " + value;
//
//		return Response.status(200).entity(output).build();
//	}
}
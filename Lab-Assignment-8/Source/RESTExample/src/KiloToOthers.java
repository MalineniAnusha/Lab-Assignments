
/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;


@Path("/kilotoothers")
public class KiloToOthers {
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public Response convertCtoFfromInput(@PathParam("c") int j) throws JSONException {
		
		JSONObject jsonObject = new JSONObject();
		double miles,yards,feet;
		miles = (j * 0.621371);
		yards = (j* 1093.61);
		feet = (j * 3280.84);
		
		jsonObject.put("Kilometers", j);
		jsonObject.put("Miles", miles); 
		jsonObject.put("Yards", yards); 
		jsonObject.put("Feet", feet);
		
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
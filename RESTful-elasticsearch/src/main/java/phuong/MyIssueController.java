package phuong;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("")
public class MyIssueController {


	@Path("issue")
	@GET
	@Produces("application/json")
	public Response getAllIssues() {
		List<String> list = MyIssueDAO.getAllIssue();

		String json = "[";
		int size = list.size();

		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				json += list.get(i) + ",";
			} else {
				json += list.get(i);
			}
		}

		json += "]";	
		return Response.ok(json).header("Access-Control-Allow-Origin", "http://localhost:4200").build();	
	}
	
	@Path("del/{id}")
	@GET
	@Produces("application/json")
	public Response DelIssue(@PathParam("id") String id ) {
		
		MyIssueDAO.delIssue(id);
		return Response.ok("OK").header("Access-Control-Allow-Origin", "http://localhost:4200").build();
		
	}
	
	@Path("issue/{id}")
	@GET
	@Produces("application/json")
	public Response getIssue(@PathParam("id") String id) {
		String json = MyIssueDAO.getIssue(id);
		return Response.ok(json).header("Access-Control-Allow-Origin", "http://localhost:4200").build();
	}

}

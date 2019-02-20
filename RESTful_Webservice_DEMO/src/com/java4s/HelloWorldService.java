package com.java4s;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/Welcome")
public class HelloWorldService {
 
	@GET
	@Path("/All")
	@Produces("text/html")
	public Response getAll() { 
		
		String output = "<font face='verdana' size='3'> Welcome to HELLOW WORLD </font>"; 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/ME")
	@Produces("text/html")
	public Response getMe() {
 
		String output = "<font face='serif' size='2'>Welcome to HELLOW WORLD ms.salma naaz </font>"; 
		return Response.status(200).entity(output).build();
 
	} 
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLTextDemo()
	{
		return "<html>"+"<title>"+"Demo Information"+"</title>"+"<body><h1>"+"Welcome HELLOW WORLD"+"</body></h1>"+"</html>";
		
	}
	@GET
	@Path("/plain")
	@Produces(MediaType.TEXT_PLAIN)
	public String getplainTextDemo()
	{
		return "Welcome HELLOW WORLD";
	}
	
}
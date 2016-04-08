package org.todo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;


// tag::documentation[]
@Path("/todo") // <1>
public class TodoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Todo> getTodos() { // <2>
        return getTodosFromDb();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateTodo(@PathParam("id") String id, Todo todo) {
        return Response.ok().build();
    }

    @DELETE
    public Response deleteDoneTodos() { // <3>
        return Response.noContent().build();
    }

    private java.util.List<Todo> getTodosFromDb() {
        return Arrays.asList(new Todo("Jenkins Pipeline", false));
    }

}
// end::documentation[]

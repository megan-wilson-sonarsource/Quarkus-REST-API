package org.acme.getting.started;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/dictionary")
public class AnagramDictionaryResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AnagramDictionaryEntry> entries() {
 // public List<AnagramDictionaryEntry> entries(@QueryParam("word_length") int length) {
        // if (length != null) {
        //     return AnagramDictionaryEntry.findByLength(length);
        // }
        return AnagramDictionaryEntry.listAll();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response newAnagramDictionaryEntry(AnagramDictionaryEntry entry) {
        entry.id = null;
        entry.persist();
        return Response.status(Status.CREATED).entity(entry).build();
    }
    
}

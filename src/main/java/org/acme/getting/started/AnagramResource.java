package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/anagram")
public class AnagramResource {
    
    @Inject
    AnagramService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/alphabatize/{word}")
    public String alphabatize(@PathParam String word) {
        return service.alphabetize(word);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/word_length/{word}")
    public int wordLength(@PathParam String word){
        return service.word_length(word);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String anagram(){
        return "\nWelcome to Anagram Finder\n---------------------------\n";
    }
}

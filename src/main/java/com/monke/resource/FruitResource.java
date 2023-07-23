package com.monke.resource;

import com.monke.service.FruitService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/fruit")
public class FruitResource {

    @Inject
    FruitService fruitService;

    @GET
    @Path("/banana")
    @Produces(MediaType.TEXT_PLAIN)
    public String getFruit() {
        return fruitService.getBanana();
    }
}

package com.xtesoft.mined.clients;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient
@Path("/auth/realms/MINED/protocol/openid-connect/token")
public interface KeycloakRestClient {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response getToken(@FormParam("username") String username,
                             @FormParam("password") String password,
                             @FormParam("client_id") String client_id,
                             @FormParam("grant_type") String grant_type);
}

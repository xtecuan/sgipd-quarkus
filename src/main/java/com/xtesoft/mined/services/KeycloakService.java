package com.xtesoft.mined.services;

import com.xtesoft.mined.clients.KeycloakRestClient;
import com.xtesoft.mined.clients.pojos.keycloak.KeycloakTokenPojo;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class KeycloakService {
    @Inject
    @RestClient
    KeycloakRestClient keycloakRestClient;

    @ConfigProperty(name = "mined.user")
    String user;

    @ConfigProperty(name = "mined.password")
    String password;

    @ConfigProperty(name = "mined.client_id")
    String clientId;

    @ConfigProperty(name = "mined.grant_type")
    String grantType;

    public KeycloakTokenPojo getToken(){
        Response r = keycloakRestClient.getToken(user,password,clientId,grantType);

        if(r.getStatus()==200){
            return r.readEntity(KeycloakTokenPojo.class);
        }else{
            return null;
        }
    }

}

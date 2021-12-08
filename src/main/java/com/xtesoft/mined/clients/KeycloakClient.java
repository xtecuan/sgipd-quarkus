package com.xtesoft.mined.clients;

import com.xtesoft.mined.clients.pojos.keycloak.KeycloakTokenPojo;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class KeycloakClient {
    @ConfigProperty(name = "keycloak.token.url")
    String keycloakTokenUrl;

    @ConfigProperty(name = "mined.user")
    String user;

    @ConfigProperty(name = "mined.password")
    String password;

    @ConfigProperty(name = "mined.client_id")
    String clientId;

    @ConfigProperty(name = "mined.grant_type")
    String grantType;

    private WebTarget keycloakTokenUrlTarget;

    private static final Logger LOG = Logger.getLogger(KeycloakClient.class);

    @PostConstruct
    void init() {
        keycloakTokenUrlTarget = ClientBuilder.newClient().target(keycloakTokenUrl);
    }

    public KeycloakTokenPojo getToken(){

        Form form =new Form();
        form.param("username",user);
        form.param("password",password);
        form.param("client_id", clientId);
        form.param("grant_type", grantType);
        KeycloakTokenPojo pojo = keycloakTokenUrlTarget.request().accept(MediaType.APPLICATION_JSON)
                .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED),
                        KeycloakTokenPojo.class);

        return pojo;
    }
}

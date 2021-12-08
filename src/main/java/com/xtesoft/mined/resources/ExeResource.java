package com.xtesoft.mined.resources;

import com.xtesoft.mined.clients.pojos.keycloak.KeycloakTokenPojo;
import com.xtesoft.mined.clients.pojos.sgipd.ReporteDocentesAplicaciones;
import com.xtesoft.mined.services.KeycloakService;
import com.xtesoft.mined.services.SGIPDService;
import org.jboss.logging.annotations.Param;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@ApplicationScoped
@Path("executor")
public class ExeResource {
    @Inject
    KeycloakService keycloakService;

    @Inject
    SGIPDService sgipdService;

    @GET
    @Path("/getToken")
    public KeycloakTokenPojo getToken() {
        return keycloakService.getToken();
    }

    @GET
    @Path("/aplicacionesdocente/codigoDeSolicitante/{codigoSolicitante}")
    public List<ReporteDocentesAplicaciones> getAplicaciones(@PathParam("codigoSolicitante") Integer codigoSolicitante) {
        return sgipdService.getAplicacionesDocente(codigoSolicitante);
    }

    @GET
    @Path("/jobtest")
    public String jobtest() {
        sgipdService.runCriterio5RestanteTest();
        return "done";
    }
}

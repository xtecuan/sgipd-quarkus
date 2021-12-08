package com.xtesoft.mined.clients;

import com.xtesoft.mined.clients.pojos.sgipd.Criterio5Result;
import com.xtesoft.mined.clients.pojos.sgipd.ReporteDocentesAplicaciones;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient
public interface SGIPDClient {
    @GET
    @Path("/aplicacionesdocente/codigoDeSolicitante/{codigoSolicitante}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReporteDocentesAplicaciones> getAplicacionesDocente(
            @HeaderParam("Authorization") String authorization,
            @PathParam("codigoSolicitante") Integer codigoSolicitante);

    @GET
    @Path("/criterio5/saveCriterio5ResidenciaDocente/pageSize/{pageSize}/from/{from}")
    public Criterio5Result saveCriterio5ResidenciaDocente(
            @HeaderParam("Authorization") String authorization,
            @PathParam("pageSize") Integer pageSize,
            @PathParam("from") Integer from
    );

    @GET
    @Path("/criterio5/count")
    @Produces(MediaType.TEXT_PLAIN)
    public Long getCountAplicaciones(@HeaderParam("Authorization") String authorization);

}

package com.xtesoft.mined.repositories;
import com.xtesoft.mined.entities.sgipd.Calificacion;
import com.xtesoft.mined.entities.sgipd.PruebaPsicometrica;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@ApplicationScoped
public class CalificacionRepository implements PanacheRepository<Calificacion>{


}

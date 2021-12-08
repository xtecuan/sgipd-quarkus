package com.xtesoft.mined.repositories;

import com.xtesoft.mined.entities.sgipd.DocenteAplicacion;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class DocenteAplicacionRepository implements PanacheRepository<DocenteAplicacion> {

    public List<DocenteAplicacion> findAllNoRechazadasByNip(String nip){
            return getEntityManager()
                    .createNamedQuery("DocenteAplicacion.findAllNoRechazadasByNip")
                    .setParameter("nip",nip)
                    .getResultList();
    }
}

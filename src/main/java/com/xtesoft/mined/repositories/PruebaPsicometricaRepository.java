package com.xtesoft.mined.repositories;

import com.xtesoft.mined.entities.sgipd.PruebaPsicometrica;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PruebaPsicometricaRepository implements PanacheRepository<PruebaPsicometrica> {

    public List<PruebaPsicometrica> findAllOrdered(Integer pageSize,Integer from){
        if(pageSize!=null && from!=null){
            return getEntityManager()
                    .createNamedQuery("PruebaPsicometrica.findAll")
                    .setMaxResults(pageSize)
                    .setFirstResult(from)
                    .getResultList();
        }else{
            return getEntityManager()
                    .createNamedQuery("PruebaPsicometrica.findAll")
                    .getResultList();
        }
    }
}

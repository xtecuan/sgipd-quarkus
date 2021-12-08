package com.xtesoft.mined.repositories;

import com.xtesoft.mined.entities.sgipd.Criterio;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CriterioRepository implements PanacheRepository<Criterio> {
}

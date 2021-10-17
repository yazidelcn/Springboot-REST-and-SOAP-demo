package com.elcnyazid.banque.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
public interface ProjectionSolde {
    public double getSolde();
}

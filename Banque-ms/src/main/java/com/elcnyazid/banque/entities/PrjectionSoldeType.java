package com.elcnyazid.banque.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "soldeAndType", types = Compte.class)
public interface PrjectionSoldeType {

    public double getSolde();
    public Type getType();
}

package com.elcnyazid.banque.web;

import com.elcnyazid.banque.entities.Compte;
import com.elcnyazid.banque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "BaqueSOAPService")
public class CompteSOAPSerive {
    @Autowired
    private CompteRepository compteRepository;


    @WebMethod
    public List<Compte> compteList(){
        return  compteRepository.findAll();
    }

    @WebMethod
    public Compte getCompteById(@WebParam(name = "id") Long id){

        return compteRepository.findById(id).get();
    }

    @WebMethod
    public Compte saveCompte(@WebParam(name = "compte") Compte compte){

        return compteRepository.save(compte);
    }

    @WebMethod
    public Compte updateCompte(@WebParam(name = "compte") Compte compte, @WebParam(name = "id") Long id){
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @WebMethod
    public void deleteCompte(@WebParam(name = "id") Long id){
        compteRepository.deleteById(id);
    }



}

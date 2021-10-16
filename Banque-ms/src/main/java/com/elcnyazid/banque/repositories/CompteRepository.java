package com.elcnyazid.banque.repositories;

import com.elcnyazid.banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}

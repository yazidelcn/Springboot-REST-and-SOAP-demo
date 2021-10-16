package com.elcnyazid.banque;

import com.elcnyazid.banque.entities.Compte;
import com.elcnyazid.banque.entities.Type;
import com.elcnyazid.banque.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BanqueMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueMsApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
		return args -> {
			compteRepository.save(new Compte(null, Math.random()*9000, new Date(), Type.EPARGNE));
			compteRepository.save(new Compte(null, Math.random()*9000, new Date(), Type.EPARGNE));
			compteRepository.save(new Compte(null, Math.random()*9000, new Date(), Type.COURANT));
			compteRepository.findAll().forEach(c ->{
				System.out.println(c	);
			});
		};
	}
}

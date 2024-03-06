package ma.ecom.microservicecommandes;

import ma.ecom.microservicecommandes.entities.Commande;
import ma.ecom.microservicecommandes.repository.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class MicroserviceCommandesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCommandesApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CommandeRepository commandeRepository){
		return args -> {
			Commande commande1 = Commande.builder().desc("Description de se produit").date(LocalDate.now()).quantity(7).amount(15000.0).build();
			Commande commande2 = Commande.builder().desc(" Autre Description de se produit").date(LocalDate.now()).quantity(9).amount(4500.0).build();
			Commande commande3 = Commande.builder().desc("Description d'un autre  produit ").date(LocalDate.now()).quantity(15).amount(9500.0).build();
			Commande commande4 = Commande.builder().desc("Une autre Description de se produit").date(LocalDate.now()).quantity(17).amount(7500.0).build();
			Commande commande5 = Commande.builder().desc("Description de se produit aussi").date(LocalDate.now()).quantity(10).amount(4600.0).build();

			commandeRepository.save(commande1);
			commandeRepository.save(commande2);
			commandeRepository.save(commande3);
			commandeRepository.save(commande4);
			commandeRepository.save(commande5);


		};
	}

}

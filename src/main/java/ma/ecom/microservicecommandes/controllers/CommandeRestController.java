package ma.ecom.microservicecommandes.controllers;

import lombok.AllArgsConstructor;
import ma.ecom.microservicecommandes.configurations.ConfigurationApp;
import ma.ecom.microservicecommandes.entities.Commande;
import ma.ecom.microservicecommandes.repository.CommandeRepository;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CommandeRestController implements HealthIndicator {

    private final CommandeRepository commandeRepository;
    private final ConfigurationApp configurationApp;

    @GetMapping("/commandes")
    public List<Commande> commandeList() throws Exception {

        List<Commande> Lc = commandeRepository.findAll();
        if(Lc.isEmpty()){
            throw new Exception("Pas de commande pour le momment ");
        }

        return Lc.subList(0,configurationApp.getCommandes_last());
    }

    @GetMapping("/commande/{id}")
    public ResponseEntity<Commande> showCommande(@PathVariable Long id){
        Commande cmd;
        cmd = commandeRepository.findById(id).orElse(null);
        if(cmd == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(cmd, HttpStatus.OK);
    }
    @PutMapping("/modify/{id}")
    public ResponseEntity<Commande> modifyCommande(@PathVariable Long id, @RequestBody Commande CommandeModifie){
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        if(optionalCommande.isPresent()){
            Commande commandeExistante = optionalCommande.get();
            commandeExistante.setDate(CommandeModifie.getDate());
            commandeExistante.setDesc(CommandeModifie.getDesc());
            commandeExistante.setAmount(CommandeModifie.getAmount());
            commandeExistante.setQuantity(CommandeModifie.getQuantity());
            commandeRepository.save(commandeExistante);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Commande> deleteCommande(@PathVariable Long id){
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        if(optionalCommande.isPresent()){
            commandeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        System.out.println("****** Actuator : CommandeRestController health() ");
        List<Commande> commandes = commandeRepository.findAll();
        if (commandes.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }
}


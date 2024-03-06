package ma.ecom.microservicecommandes.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@Data
public class ConfigurationApp {
    // correspond à la propriété « mes-configs.limitDeProduits » dans le fichier de configuration du MS
    private int commandes_last;

}

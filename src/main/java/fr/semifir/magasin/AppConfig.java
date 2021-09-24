package fr.semifir.magasin;


import fr.semifir.magasin.services.impl.ProduitServiceImpl;
import fr.semifir.magasin.repositories.CategorieRepository;
import fr.semifir.magasin.repositories.ClientRepository;
import fr.semifir.magasin.repositories.CommandeRepository;
import fr.semifir.magasin.repositories.ProduitRepository;
import fr.semifir.magasin.services.CategorieService;
import fr.semifir.magasin.services.ClientService;
import fr.semifir.magasin.services.CommandeService;
import fr.semifir.magasin.services.ProduitService;
import fr.semifir.magasin.services.impl.CategorieServiceImpl;
import fr.semifir.magasin.services.impl.ClientServiceImpl;
import fr.semifir.magasin.services.impl.CommandeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CategorieService categorieService(CategorieRepository repo){
        return new CategorieServiceImpl(repo);
    }

    @Bean
    public ClientService clientService(ClientRepository repo){
        return new ClientServiceImpl(repo);
    }

    @Bean
    public CommandeService commandeService(CommandeRepository repo){
        return new CommandeServiceImpl(repo);
    }

    @Bean
    public ProduitService produitService(ProduitRepository repo){
        return new ProduitServiceImpl(repo);
    }
}

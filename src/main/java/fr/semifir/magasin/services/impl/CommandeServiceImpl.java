package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.services.CommandeService;
import fr.semifir.magasin.models.Commande;
import fr.semifir.magasin.repositories.CommandeRepository;

import java.util.List;
import java.util.Optional;

public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository repo;

    public CommandeServiceImpl(CommandeRepository repo) {
        this.repo = repo;
    }

    public List<Commande> findAll() {
        return repo.findAll();
    }

    public Commande save(Commande commande) {
        return repo.save(commande);
    }

    public Optional<Commande> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}

package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {

    public List<Commande> findAll();
    public Commande save(Commande commande);
    public Optional<Commande> findById(Long id);
    public void deleteById(Long id);
}

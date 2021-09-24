package fr.semifir.magasin.services.impl;

import fr.semifir.magasin.models.Produit;
import fr.semifir.magasin.repositories.ProduitRepository;
import fr.semifir.magasin.services.ProduitService;

import java.util.List;
import java.util.Optional;

public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository repo;

    public ProduitServiceImpl(ProduitRepository repo) {
        this.repo = repo;
    }

    public List<Produit> findAll() {
        return repo.findAll();
    }

    public Produit save(Produit produit) {
        return repo.save(produit);
    }

    public Optional<Produit> findById(Long id) {
        return repo.findById(id);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}

package fr.semifir.magasin.services;

import fr.semifir.magasin.models.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    public List<Produit> findAll();
    public Produit save(Produit produit);
    public Optional<Produit> findById(Long id);
    public void deleteById(Long id);
}
